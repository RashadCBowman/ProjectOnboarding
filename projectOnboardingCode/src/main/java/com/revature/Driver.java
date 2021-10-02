package com.revature;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.revature.week3.SwapNumbers;

public class Driver {
	public static void main (String[] args) {
		

		List<Integer> nums = Arrays.asList(3, 4, 6, 1, 2, 3);
		List<Integer> numOnly = nums.stream().filter(n -> n >= 3).collect(Collectors.toList());
		int num = nums.stream().filter(n -> n >= 3).reduce(0,(ans,i) -> ans=ans<i?i:ans);
		int num2 = 0;
		for (Integer n : numOnly) {
			num2 += n;
		}
		
		System.out.println("Num number: " + num);
		System.out.println("Num2 number: " + num2);
		SwapNumbers sn = new SwapNumbers();
		Float[] fa = {3f,5f};
		List<Float> fl = Arrays.asList(3f,5f);
		
		System.out.println("Inputting regularly : " + sn.swapNumber(3f,5f));
		System.out.println("With an Array : " + Arrays.asList(sn.swapNumber(fa)));
		System.out.println("With a List : " + sn.swapNumber(fl));
	}
}
