package com.book.map;

import java.util.LinkedHashMap;

/**
 * ʹ��LinkedHashMapʱ������˳��
 * �����˳����ͬ
 * @author «��
 *
 */

public class LinkedHashMapTest
{
	public static void main(String[] args)
	{
		LinkedHashMap<Object, Object> scores = new LinkedHashMap<>();
		
		scores.put("Chinese", 98);
		scores.put("Math", 90);
		scores.put("English", 68);
		
		for(Object key: scores.keySet())
		{
			System.out.println(key + " -> " + scores.get(key));
		}
	}
}
