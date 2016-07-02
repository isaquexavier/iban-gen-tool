package com.iax.iban.utils;

import java.math.BigDecimal;

/**
 * 
 * Utility class for many purposes.
 * 
 * @author Isaque Xavier
 * 
 * */

public abstract class IbanUtils {

	/**
	 * Move the four initial characteres to the end of the String. For example:
	 * given the IBAN [AT611904300234573201], the transformed String will be
	 * [1904300234573201AT61]
	 * 
	 * */
	public static String move4CharsToTheEnd(String iban) {
		if (iban.length() >= 8) {
			return iban.substring(4, iban.length()) + iban.substring(0, 4);
		}
		return iban;
	}

	/**
	 * This method receives an IBAN mixed with numbers and letters, then it
	 * transforms the whole String to a Big integer. The method convert the
	 * letter to interger like the following example. Replace each letter in the
	 * string with two digits, thereby expanding the string, where A = 10, B =
	 * 11, ..., Z = 35
	 * 
	 * For example: given the IBAN [1904300234573201AT61], the transformed
	 * String will be [1904300234573201102961]
	 * 
	 * */
	public static String convertIbanToInteger(String iban) {
		String integerIban = "";
		for (char ch : iban.toCharArray()) {
			integerIban = integerIban + String.valueOf(convertToInteger(ch));
		}
		return integerIban;
	}

	private static int convertToInteger(char ch) {
		int intCode = (int) ch;
		int upperCaseOffset = 64;
		int decimalOffset = 48;
		if (intCode <= 90 & intCode >= 65) {
			return (intCode - upperCaseOffset + 9);
		} else if (intCode <= 57 & intCode >= 48) {
			return (intCode - decimalOffset);
		}
		return -1;
	}

	/**
	 * This method calculate the module 97 receiving an IBAN as seed. Interpret
	 * the string as a decimal integer and compute the remainder of that number
	 * on division by 97. For more information about the module 97 please follow
	 * the link below.
	 * 
	 * @see <a
	 *      href="https://en.wikipedia.org/wiki/International_Bank_Account_Number#Modulo_operation_on_IBAN">module
	 *      97 documentation</a>
	 * 
	 * */
	public static int calculateMod97(String iban) {
		BigDecimal numericIban = new BigDecimal(iban);
		return numericIban.remainder(new BigDecimal(97)).intValue();
	}

}
