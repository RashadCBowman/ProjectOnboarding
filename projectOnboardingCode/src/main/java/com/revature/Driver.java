package com.revature;

import java.util.HashMap;
import java.util.Map;

import com.revature.week5.IterateMap;
import com.revature.week5.RotateString;

public class Driver {
	public static void main (String[] args) {
		IterateMap im = new IterateMap();
		RotateString rs = new RotateString();
		
		
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put(0, 5);
		m.put(1, 9);
		m.put(2, 2);
		m.put(3, 4);
		m.put(4, 5);
		im.forMap(m);
		im.whileMap(m);
		
		System.out.println(rs.rotateString("obbyb", "bobby"));
		
	}
}
