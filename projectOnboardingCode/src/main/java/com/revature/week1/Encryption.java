package com.revature.week1;

public class Encryption {
	public static String rot13(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);
			if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				c = (c >= 'a' && c <= 'z') ? (char) ((((c - 97) + 13) % 26) + 97)
						: (char) ((((c - 65) + 13) % 26) + 65);
			}
			sb.append(c);
		}
		return sb.toString();
	}
}
