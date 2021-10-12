package com.revature.week5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RotateString {
	
	public boolean rotateString(String str1, String str2) {
		
		//check if they're the same length, if not, false anyway
		if (str1.length() == str2.length()) {
			//put size of string in int
			int size = str1.length();
			//to figure out the position of the beginning letter of similar letter in the first from second
			List<Integer> pos = new ArrayList<Integer>();
			for (int i = 0 ; i < size ; i++) {
				if (str1.charAt(i) == str2.charAt(0)) {
					pos.add(i);
				}
			}
			//recreates the string
			for (Integer i : pos) {
				//amount of times to add on to temp string
				int counter = 0;
				//the index location
				int index = i;
				//String Builder
				StringBuilder sb = new StringBuilder();
				while (counter++ < size) {
					//if index is above the index, goes back to 0
					if (index >= size) {
						index = 0;
					}
					//adds letter
					sb.append(str1.charAt(index++));
				}
				System.out.println("String: " + sb.toString() + " = " + str2.toString());
				//if string is the same as the second string
				if (sb.toString().equals(str2)) {
					return true;
				}
			}
		}
		//if everything else fails, it's false
		return false;
	}
}
