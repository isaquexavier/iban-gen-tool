package com.iax.iban;

import com.iax.iban.utils.IbanUtils;

/**
 * 
 * This class has only one public method responsible for validating IBANs values.
 * 
 * @author Isaque Xavier
 * 
 * */
public abstract class IbanValidator {

	/**
	 * Check if a given IBAN is valid according to the ISO 7064 documentation.
	 * An IBAN is validated by converting it into an integer and performing a
	 * basic mod-97 operation (as described in ISO 7064) on it. If the IBAN is
	 * valid, the remainder equals 1.
	 * 
	 * The full algorithm of IBAN validation can be accessed in the link below.
	 * 
	 * @see <a
	 *      href="https://en.wikipedia.org/wiki/International_Bank_Account_Number#Validating_the_IBAN">full
	 *      algorithm of IBAN validation</a>
	 * 
	 * */
	public final static boolean isValid(String iban) {
		// first checking the IBAN length
		if (checkIbanLenght(iban)) {
			// second, move four initial chars to the end of the chain
			String rearrangedIban = IbanUtils.move4CharsToTheEnd(iban);
			// Convert to integer
			if (rearrangedIban != null) {
				String integerIban = IbanUtils.convertIbanToInteger(rearrangedIban);
				// Compute remainder
				return (integerIban != null && (IbanUtils.calculateMod97(integerIban) == 1));
			}
		}
		return false;
	}

	private static boolean checkIbanLenght(String iban) {
		if (iban != null && iban.length() >= 2) {
			SupportedCountry country = SupportedCountry.countriesValueOf(iban.substring(0, 2));
			if (country != null) {
				return country.getIbanLength() == iban.length();
			}
		}
		return false;
	}

}
