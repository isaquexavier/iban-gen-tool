package com.iax.iban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.iax.iban.utils.IbanUtils;

/**
 * 
 * The main Class of the library, responsible for generate Random IBANs based on
 * the Supported Country passed.
 * 
 * @author Isaque Xavier
 * 
 * */
public final class IbanGenerator {

	private static final List<String> GENERATED_IBANS = Collections.synchronizedList(new ArrayList<String>());

	/**
	 * The method provides the functionality of generating a valid IBAN's for
	 * different countries. Valid in this context means syntactically valid
	 * according to the ISO standard, but not necessarily existing bank
	 * accounts.
	 * 
	 * To use this method properly you should pass as parameter, the desired
	 * country, which might be picked up from the enumeration
	 * <code>com.iax.iban.SupportedCountry</code>. This enumeration contains all
	 * supported countries.
	 * 
	 * */
	public String randomIBAN(SupportedCountry supportedcountry) {
		String seed = String.format("%s%s%s", supportedcountry.getIso3166CountryCode(), "00",
				getRandomBasicBankAccountNumber(supportedcountry.getBbanFormatArray()));
		String finalIban = calculateMod97_10(seed, supportedcountry);
		if (GENERATED_IBANS.contains(finalIban)) {
			System.out.println(String.format("Discarding a repeated IBAN [%s]", finalIban));
			finalIban = randomIBAN(supportedcountry);
		}
		GENERATED_IBANS.add(finalIban);
		return finalIban;
	}

	/**
	 * This method Calculate mod-97 of the new number, which results in the
	 * remainder. After, it subtract the remainder from 98, and use the result
	 * for the two check digits. If the result is a single digit number, pad it
	 * with a leading 0 to make a two-digit number
	 * 
	 * */
	private String calculateMod97_10(String seed, SupportedCountry supportedcountry) {
		// first checking the IBAN length
		if (supportedcountry.getIbanLength() == seed.length()) {
			// second, move four initial chars to the end
			String rearrangedIban = IbanUtils.move4CharsToTheEnd(seed);
			// Convert to integer
			if (rearrangedIban != null) {
				String integerIban = IbanUtils.convertIbanToInteger(rearrangedIban);
				// Compute remainder
				if (integerIban != null) {
					int checkDigits = (98 - IbanUtils.calculateMod97(integerIban));
					return String.format("%s%s%s", supportedcountry.getIso3166CountryCode(),
							formatCheckDigits(checkDigits), seed.substring(4, seed.length()));
				}
			}
		}
		return seed;
	}

	private String formatCheckDigits(int checkDigits) {
		return String.format("%02d", checkDigits);
	}

	/**
	 * This method generate a random Basic Bank Account Number based on the
	 * Country BBAN format fields.
	 * */
	private String getRandomBasicBankAccountNumber(BbanFormat[] bbanFormatArray) {
		String randomBasicBankAccountNumber = "";
		for (BbanFormat bf : bbanFormatArray) {
			if (bf != null) {
				randomBasicBankAccountNumber = randomBasicBankAccountNumber + bf.nextRandomValue();
			}
		}
		return randomBasicBankAccountNumber;
	}

}
