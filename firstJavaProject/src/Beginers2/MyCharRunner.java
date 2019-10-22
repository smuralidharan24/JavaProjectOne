package Beginers2;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('A');

		System.out.printf("Is the input value a Vowel ------- %b", myChar.isVowel()).println();
		System.out.printf("Is the input value a Digit ------- %b", myChar.isDigit()).println();
		System.out.printf("Is the input value a Alphabet ---- %b", myChar.isAlphabet()).println();
		System.out.printf("Is the input value a Consonant --- %b", myChar.isConsonant()).println();
		MyChar.printLowerCaseAlphabet();
		MyChar.printUpperCaseAlphabet();

	}

}
