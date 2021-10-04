package com.revature.week4;

import java.util.Arrays;
import java.util.List;

public class CreditCard {

	/*
	 * Create a function that takes a number as an argument and returns true if the
	 * number is a valid credit card number, false otherwise.
	 * 
	 * Credit card numbers must be between 14-19 digits in length, and pass the Luhn
	 * test, described below:
	 * 
	 * STEP 1 : Remove the last digit (this is the "check digit").
	 * 
	 * STEP 2 : Reverse the number.
	 * 
	 * STEP 3 : Double the value of each digit in odd-numbered positions. If the doubled
	 * value has more than 1 digit, add the digits together (e.g. 8 x 2 = 16 --> 1 +
	 * 6 = 7).
	 * 
	 * STEP 4 : Add all digits.
	 * 
	 * STEP 5 : Subtract the last digit of the sum (from step 4) from 10. The result should
	 * be equal to the check digit from step 1.
	 */

	public boolean isCreditCard(long number) {
		// Inputs the number in a StringBuilder
		StringBuilder sb = new StringBuilder(String.valueOf(number));
		// checks if number is between 14 and 19
		if (sb.length() > 14 && sb.length() < 19) {
			// saving the last number of number to "check"
			int check = Character.getNumericValue(sb.charAt(sb.length() - 1));
			// removing the last number of number
			sb.deleteCharAt(sb.length() - 1);
			// reverse the numbers
			sb.reverse();
			// creating total to store the sum
			int total = 0;
			for (int i = 0; i < sb.length(); i++) {
				// stores number into a temp
				int temp = Character.getNumericValue(sb.charAt(i));
				if (i % 2 == 0) {// if the number is in an "odd" position (actually even in the world of
									// programmers)
					// double the number
					temp = temp * 2;
					if (temp > 9) {// if there is two digits
						// first digit + second digit
						temp = Character.getNumericValue(String.valueOf(temp).charAt(0))
								+ Character.getNumericValue(String.valueOf(temp).charAt(1));
					}
				}
				// add to total
				total += temp;
			}
			// 10 subtracted by the last digit of the total
			total = 10 - Character.getNumericValue(String.valueOf(total).charAt(String.valueOf(total).length()-1));
			// if total equals check, then return true, it's a credit card
			return total == check ? true : false;
		}
		// false
		return false;
	}
}
