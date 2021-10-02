package com.revature.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapNumbers {
	
	public Float[] swapNumber(Float[] num) {
		if (num.length == 2) {
			Collections.reverse(Arrays.asList(num));
			return num;
		}
		return null;
	}
	
	public List<Float> swapNumber(List<Float> list){
		if (list.size() == 2) {
			Collections.reverse(list);
			return list;
		}
		return null;
	}
	
	public List<Float> swapNumber(float f, float s){
		List<Float> list = new ArrayList<Float>();
		s = f + s;
		f = s - f;
		s = s - f;
		list.add(f);
		list.add(s);
		return list;
	}
}
