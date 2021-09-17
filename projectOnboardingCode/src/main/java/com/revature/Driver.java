package com.revature;

import com.revature.week1.ConvertToOctal;
import com.revature.week1.Encryption;

public class Driver {
	public static void main (String[] args) {
		String message = "This is a message! 1 2 3 should not be converted!";
		Integer num1 = new Integer(143);
		Long num2 = new Long(143);
		System.out.println("Normal Message : " + message);
		System.out.println("Rot13 Message : " + Encryption.rot13(message));
		System.out.println("Integer : " + num1 + " Long : " + num2);
		System.out.println("Convert Integer to Octal : " + ConvertToOctal.convertDecimalToOctal(num1));
		System.out.println("Convert Long to Octal : " + ConvertToOctal.convertDecimalToOctal(num2));
	}
}
