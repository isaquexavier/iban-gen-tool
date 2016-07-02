package com.iax.iban;


/**
 * 
 * Enum implementation which holds the countries table for IBAN calculation.
 * Represents all ISO3166 Country objects.
 * Each object contains attributes such: Country Name, ISO Code, Field Length and BBAN Format Arrays.
 * 
 * @author Isaque Xavier
 * 
 * */
public enum SupportedCountry {

	ALBANIA ("Albania", "AL", 28 , new BbanFormat[] { new BbanFormat( 8, 'n'), new BbanFormat( 16, 'c' ) }), 
	ANDORRA ("Andorra", "AD", 24 , new BbanFormat[] { new BbanFormat( 8, 'n'),new BbanFormat( 12, 'c' ) }), 
	AUSTRIA ("Austria", "AT", 20 , new BbanFormat[] { new BbanFormat( 16, 'n' ) }), 
	AZERBAIJAN ("Azerbaijan", "AZ", 28 , new BbanFormat[] { new BbanFormat( 4, 'c'), new BbanFormat( 20, 'n' ) }), 
	BAHRAIN ("Bahrain", "BH", 22 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 14, 'c' ) }), 
	BELGIUM ("Belgium", "BE", 16 , new BbanFormat[] { new BbanFormat( 12, 'n' ) }), 
	BOSNIA_AND_HERZEGOVINA ("Bosnia and Herzegovina", "BA", 20 , new BbanFormat[] { new BbanFormat( 16, 'n' ) }), 
	BRAZIL ("Brazil", "BR", 29 , new BbanFormat[] { new BbanFormat( 23, 'n'), new BbanFormat( 1, 'a'), new BbanFormat( 1, 'c' ) }), 
	BULGARIA ("Bulgaria", "BG", 22 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 6, 'n'),new BbanFormat( 8, 'c' ) }), 
	COSTA_RICA ("Costa Rica", "CR", 21 , new BbanFormat[] { new BbanFormat( 17, 'n' ) }), 
	CROATIA ("Croatia", "HR", 21 , new BbanFormat[] { new BbanFormat( 17, 'n' ) }), 
	CYPRUS ("Cyprus", "CY", 28 , new BbanFormat[] { new BbanFormat( 8, 'n'),new BbanFormat( 16, 'c' ) }), 
	CZECH_REPUBLIC ("Czech Republic", "CZ", 24 , new BbanFormat[] { new BbanFormat( 20, 'n' ) }), 
	DENMARK ("Denmark", "DK", 18 , new BbanFormat[] { new BbanFormat( 14, 'n' ) }), 
	DOMINICAN_REPUBLIC ("Dominican Republic", "DO", 28 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 20, 'n' ) }), 
	EAST_TIMOR ("East Timor", "TL", 23 , new BbanFormat[] { new BbanFormat( 19, 'n' ) }), 
	ESTONIA ("Estonia", "EE", 20 , new BbanFormat[] { new BbanFormat( 16, 'n' ) }), 
	FAROE_ISLANDS ("Faroe Islands", "FO", 18 , new BbanFormat[] { new BbanFormat( 14, 'n' ) }), 
	FINLAND ("Finland", "FI", 18 , new BbanFormat[] { new BbanFormat( 14, 'n' ) }), 
	FRANCE ("France", "FR", 27 , new BbanFormat[] { new BbanFormat( 10, 'n'),new BbanFormat( 11, 'c'),new BbanFormat( 2, 'n' ) }), 
	GEORGIA ("Georgia", "GE", 22 , new BbanFormat[] { new BbanFormat( 2, 'c'),new BbanFormat( 16, 'n' ) }), 
	GERMANY ("Germany", "DE", 22 , new BbanFormat[] { new BbanFormat( 18, 'n' ) }), 
	GIBRALTAR ("Gibraltar", "GI", 23 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 15, 'c' ) }), 
	GREECE ("Greece", "GR", 27 , new BbanFormat[] { new BbanFormat( 7, 'n'),new BbanFormat( 16, 'c' ) }), 
	GREENLAND ("Greenland", "GL", 18 , new BbanFormat[] { new BbanFormat( 14, 'n' ) }),
	GUATEMALA ("Guatemala", "GT", 28 , new BbanFormat[] { new BbanFormat( 4, 'c'),new BbanFormat( 20, 'c' ) }), 
	HUNGARY ("Hungary", "HU", 28 , new BbanFormat[] { new BbanFormat( 24, 'n' ) }), 
	ICELAND ("Iceland", "IS", 26 , new BbanFormat[] { new BbanFormat( 22, 'n' ) }), 
	IRELAND ("Ireland", "IE", 22 , new BbanFormat[] { new BbanFormat( 4, 'c'),new BbanFormat( 14, 'n' ) }), 
	ISRAEL ("Israel", "IL", 23 , new BbanFormat[] { new BbanFormat( 19, 'n' ) }), 
	ITALY ("Italy", "IT", 27 , new BbanFormat[] { new BbanFormat( 1, 'a'),new BbanFormat( 10, 'n'),new BbanFormat( 12, 'c' ) }), 
	JORDAN ("Jordan", "JO", 30 , new BbanFormat[] { new BbanFormat( 4, 'a'), new BbanFormat( 22, 'n' ) }), 
	KAZAKHSTAN ("Kazakhstan", "KZ", 20 , new BbanFormat[] { new BbanFormat( 3, 'n'),new BbanFormat( 13, 'c' ) }), 
	KOSOVO ("Kosovo", "XK", 20 , new BbanFormat[] { new BbanFormat( 4, 'n'),new BbanFormat( 10, 'n'),new BbanFormat( 2, 'n' ) }), 
	KUWAIT ("Kuwait", "KW", 30 , new BbanFormat[] { new BbanFormat( 4, 'a'), new BbanFormat( 22, 'c' ) }), 
	LATVIA ("Latvia", "LV", 21 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 13, 'c' ) }), 
	LEBANON ("Lebanon", "LB", 28 , new BbanFormat[] { new BbanFormat( 4, 'n'),new BbanFormat( 20, 'c' ) }), 
	LIECHTENSTEIN ("Liechtenstein", "LI", 21 , new BbanFormat[] { new BbanFormat( 5, 'n'),new BbanFormat( 12, 'c' ) }), 
	LITHUANIA ("Lithuania", "LT", 20 , new BbanFormat[] { new BbanFormat( 16, 'n' ) }), 
	LUXEMBOURG ("Luxembourg", "LU", 20 , new BbanFormat[] { new BbanFormat( 3, 'n'),new BbanFormat( 13, 'c' ) }), 
	MACEDONIA ("Macedonia", "MK", 19 , new BbanFormat[] { new BbanFormat( 3, 'n'),new BbanFormat( 10, 'c'),new BbanFormat( 2, 'n' ) }), 
	MALTA ("Malta", "MT", 31 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 5, 'n'),new BbanFormat( 18, 'c' ) }), 
	MAURITANIA ("Mauritania", "MR", 27 , new BbanFormat[] { new BbanFormat( 23, 'n' ) }), 
	MAURITIUS ("Mauritius", "MU", 30 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 19, 'n'),new BbanFormat( 3, 'a' ) }), 
	MONACO ("Monaco", "MC", 27 , new BbanFormat[] { new BbanFormat( 10, 'n'),new BbanFormat( 11, 'c'),new BbanFormat( 2, 'n' ) }), 
	MOLDOVA ("Moldova", "MD", 24 , new BbanFormat[] { new BbanFormat( 2, 'c'),new BbanFormat( 18, 'c' ) }), 
	MONTENEGRO ("Montenegro", "ME", 22 , new BbanFormat[] { new BbanFormat( 18, 'n' ) }), 
	NETHERLANDS ("Netherlands", "NL", 18 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 10, 'n' ) }), 
	NORWAY ("Norway", "NO", 15 , new BbanFormat[] { new BbanFormat( 11, 'n' ) }), 
	PAKISTAN ("Pakistan", "PK", 24 , new BbanFormat[] { new BbanFormat( 4, 'c'),new BbanFormat( 16, 'n' ) }), 
	PALESTINIAN_TERRITORIES ("Palestinian territories", "PS", 29 , new BbanFormat[] { new BbanFormat( 4, 'c'),new BbanFormat( 21, 'n' ) }), 
	POLAND ("Poland", "PL", 28 , new BbanFormat[] { new BbanFormat( 24, 'n' ) }), 
	PORTUGAL ("Portugal", "PT", 25 , new BbanFormat[] { new BbanFormat( 21, 'n' ) }), 
	QATAR ("Qatar", "QA", 29 , new BbanFormat[] { new BbanFormat( 4, 'a'), new BbanFormat( 21, 'c' ) }), 
	ROMANIA ("Romania", "RO", 24 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 16, 'c' ) }), 
	SAN_MARINO ("San Marino", "SM", 27 , new BbanFormat[] { new BbanFormat( 1, 'a'),new BbanFormat( 10, 'n'),new BbanFormat( 12, 'c' ) }), 
	SAUDI_ARABIA ("Saudi Arabia", "SA", 24 , new BbanFormat[] { new BbanFormat( 2, 'n'),new BbanFormat( 18, 'c' ) }), 
	SERBIA ("Serbia", "RS", 22 , new BbanFormat[] { new BbanFormat( 18, 'n' ) }), 
	SLOVAKIA ("Slovakia", "SK", 24 , new BbanFormat[] { new BbanFormat( 20, 'n' ) }), 
	SLOVENIA ("Slovenia", "SI", 19 , new BbanFormat[] { new BbanFormat( 15, 'n' ) }), 
	SPAIN ("Spain", "ES", 24 , new BbanFormat[] { new BbanFormat( 20, 'n' ) }), 
	SWEDEN ("Sweden", "SE", 24 , new BbanFormat[] { new BbanFormat( 20, 'n' ) }), 
	SWITZERLAND ("Switzerland", "CH", 21 , new BbanFormat[] { new BbanFormat( 5, 'n'),new BbanFormat( 12, 'c' ) }), 
	TUNISIA ("Tunisia", "TN", 24 , new BbanFormat[] { new BbanFormat( 20, 'n' ) }), 
	TURKEY ("Turkey", "TR", 26 , new BbanFormat[] { new BbanFormat( 5, 'n'),new BbanFormat( 17, 'c' ) }), 
	UNITED_ARAB_EMIRATES ("United Arab Emirates", "AE", 23 , new BbanFormat[] { new BbanFormat( 3, 'n'),new BbanFormat( 16, 'n' ) }), 
	UNITED_KINGDOM ("United Kingdom", "GB", 22 , new BbanFormat[] { new BbanFormat( 4, 'a'),new BbanFormat( 14, 'n' ) }), 
	VIRGIN_ISLANDS_BRITISH ("Virgin Islands, British", "VG", 24 , new BbanFormat[] { new BbanFormat( 4, 'c'),new BbanFormat( 16, 'n' ) }); 

	private String iso3166CountryCode;

	private int ibanLength;

	private BbanFormat[] bbanFormatArray;
	
	private SupportedCountry(String name, String iso3166CountryCode, int ibanLength, BbanFormat[] bbanFormatArray){
		this.iso3166CountryCode = iso3166CountryCode;
		this.ibanLength = ibanLength;
		this.bbanFormatArray = bbanFormatArray;
	}

	public String getIso3166CountryCode() {
		return iso3166CountryCode;
	}

	public int getIbanLength() {
		return ibanLength;
	}

	public BbanFormat[] getBbanFormatArray() {
		return bbanFormatArray;
	}

	public static SupportedCountry countriesValueOf(String iso3166CountryCode) {
		for (SupportedCountry country : SupportedCountry.values()) {
			if (country.getIso3166CountryCode().equals(iso3166CountryCode)) {
				return country;
			}
		}
		return null;
	}	
	
	
}
