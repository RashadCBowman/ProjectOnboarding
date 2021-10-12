package com.revature.week5;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class IterateMap {
	
	//Used Object since it did not specify what is being forwarded into the functions
	//Using For Loop
	public void forMap(Map<Object, Object> map) {
		System.out.println("Using for loop:");
		for (Map.Entry<Object, Object> m: map.entrySet()) {
			System.out.println("Key: " +m.getKey()+ " Value: " + m.getValue());
		}
		System.out.println("Using stream forEach:");
		map.entrySet().stream().forEach(m -> System.out.println("Key: " +m.getKey()+ " Value: " + m.getValue()));
	}
	
	
	//Using While Loop
	public void whileMap(Map<Object, Object> map) {
		System.out.println("Using while loop:");
		Iterator<Map.Entry<Object, Object>> m = map.entrySet().iterator();
		while (m.hasNext()) {
			Map.Entry e = m.next();
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		}
	}
}
