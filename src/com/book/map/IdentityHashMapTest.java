package com.book.map;

import java.util.IdentityHashMap;

/**
 * 
 * 当且仅当两对象通过 “==”判断相等时
 * IdentityHashMap才认为两个key相等
 *
 */

public class IdentityHashMapTest 
{
	public static void main(String[] args)
	{
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<>();
		
		ihm.put(new String("语文"), new String("良好"));
		ihm.put(new String("语文"), new String("一般"));
		
		ihm.put("Jillie", "lovely");
		ihm.put("Jillie", "grace");
		
		System.out.println("ihm: " + ihm);
	}
}
