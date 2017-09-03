import java.util.Random;

public class GenerateRandom {

	//Method for generating random n-digit
	//(from 2 all the way up to 9) PIN (It can start with 0)
	//Accepts an integer, which determines how much digits you want.
	
	public String getRand(int digits_) {
		//Using random...
		Random genRand = new Random();

		//Declaring an array with size determined by the argument int digits_		
		int[] digits = new int[digits_];
		String number = "";

		for (int i = 0; i < digits.length;) { // NOTE: It doesn't increment automatically
			digits[i] = genRand.nextInt(9);
			//Checks if the digit exists, so the number is with N (up to 9) unique digits
			if (!number.contains(digits[i] + "")) {
				number += digits[i] + "";
				i++;
			}
		}
		
		//Returns an incredibly complex array of chars, but digits in the type of String;
		return number;
	}
	
	//A Method overloading for getRand();
	//This method returns a random distinct string of chars up to 52.
	//This takes the number of symbol length as an integer and
	//String like "yes" which tells the function to use this overloaded method.
	
	public String getRand(int symbols_, String str) {
		
		//Declaring an array with size determined by the argument int symbols_
		//We don't actually use str anywhere, just to do method overloading;
		
		int[] symbols = new int[symbols_];
		String symbolString = "";

		for (int i = 0; i < symbols.length;) { // NOTE: It doesn't increment automatically
			symbols[i] = getRandChar();
			
			//Checks if the symbol exists, so the number is with N (up to 52) unique symbols
			if (!symbolString.contains(symbols[i]+"")) {
				//This requires to + "" even though it's a char :/
				symbolString += symbols[i]+"";
				i++;
			}
		}
		
		//Returns an incredibly complex array of chars in the type of String;
		return symbolString;
	}

	//A private method for generating a random char
	//based on the English alphabet
	
	private  char getRandChar() {
		//This doesn't really work
		int rnd = (int) (Math.random() * 52); // or use Random maybe
		char base = (rnd < 26) ? 'A' : 'a';
		return (char) (base + rnd % 26);
	}
}
