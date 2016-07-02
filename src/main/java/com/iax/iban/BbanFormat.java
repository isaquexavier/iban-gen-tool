package com.iax.iban;

import java.util.Random;

/**
 * This class represents a part of BBAN format of a Country.
 * 
 * @author Isaque Xavier
 * 
 * */
class BbanFormat {

	private int lengthOfSequence;

	private char typeOfCharacter;

	public BbanFormat() {
		super();
	}

	public BbanFormat(int lengthOfSequence, char typeOfCharacter) {
		super();
		this.lengthOfSequence = lengthOfSequence;
		this.typeOfCharacter = typeOfCharacter;
	}

	protected int getLengthOfSequence() {
		return lengthOfSequence;
	}

	protected void setLengthOfSequence(int lengthOfSequence) {
		this.lengthOfSequence = lengthOfSequence;
	}

	protected char getTypeOfCharacter() {
		return typeOfCharacter;
	}

	protected void setTypeOfCharacter(char typeOfCharacter) {
		this.typeOfCharacter = typeOfCharacter;
	}

	/**
	 * This method generates a Random BBAN based on the pair lengthOfSequence
	 * and typeOfCharacter. In terms of upper case alpha characters (A–Z)
	 * denoted by "a", numeric characters (0–9) denoted by "n" and mixed case
	 * alphanumeric characters (a–z, A–Z, 0–9) denoted by "c".
	 * 
	 * */
	public String nextRandomValue() {
		String randomValue = "";
		for (int i = 0; i < lengthOfSequence; i++) {
			if (typeOfCharacter == 'a') {
				randomValue = randomValue + nextRandomValue("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			} else if (typeOfCharacter == 'n') {
				randomValue = randomValue + nextRandomValue("0123456789");
			} else if (typeOfCharacter == 'c') {
				randomValue = randomValue + nextRandomValue("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ");
			}
		}
		return randomValue;
	}

	private String nextRandomValue(String alphabet) {
		final int N = alphabet.length() - 1;
		Random r = new Random();
		return String.valueOf(alphabet.charAt(r.nextInt(N)));
	}

	@Override
	public String toString() {
		return String.format("%s%s", lengthOfSequence, typeOfCharacter);
	}

}
