package com.revature;

import com.revature.week4.CreditCard;

public class Driver {
	public static void main (String[] args) {
		

		CreditCard cc = new CreditCard();
		System.out.println(cc.isCreditCard(1234567890123456l));
		System.out.println(cc.isCreditCard(1234567890123452l));
	}
}
