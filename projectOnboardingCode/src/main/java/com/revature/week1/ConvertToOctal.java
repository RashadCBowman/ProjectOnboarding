package com.revature.week1;

public class ConvertToOctal {
	public Integer convertDecimalToOctal(Integer i) {
		return Integer.parseInt(Integer.toOctalString(i));
	}
	
	public Long convertDecimalToOctal(Long l) {
		return Long.parseLong(Long.toOctalString(l));   
	}
}
