package com.iax.iban.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.iax.iban.IbanGenerator;
import com.iax.iban.IbanValidator;
import com.iax.iban.SupportedCountry;

public class IbanTestCase {

	@Test
	public void ibanValidatorSuccessTest() {
		String[] validIbanSamples = new String[] { "AT611904300234573201", "DE89370400440532013000",
				"NL91ABNA0417164300", "GB82WEST12345698765432" };
		assertNotNull("Null instance for validIbanSamples.", validIbanSamples);
		for (String ibanSample : validIbanSamples) {
			assertTrue(String.format("Invalid IBAN, [%s]", ibanSample), IbanValidator.isValid(ibanSample));
		}
	}

	@Test
	public void ibanValidatorFailureTest() {
		String[] validIbanSamples = new String[] { "XX89370400440532013000", "GB82WEST12345698765432321" };
		assertNotNull("Null instance for validIbanSamples.", validIbanSamples);
		for (String ibanSample : validIbanSamples) {
			assertFalse(String.format("Valid IBAN, [%s]", ibanSample), IbanValidator.isValid(ibanSample));
		}
	}

	@Test
	public void ibanGenTest() {
		String iban = null;
		IbanGenerator ibanGenerator = new IbanGenerator();
		for (int i = 0; i < 500; i++) {
			for (SupportedCountry country : SupportedCountry.values()) {
				assertNotNull("Null instance of country.", country);
				iban = ibanGenerator.randomIBAN(country);
				assertTrue(String.format("Invalid IBAN [%s]", iban), IbanValidator.isValid(iban));
			}
		}
	}

}
