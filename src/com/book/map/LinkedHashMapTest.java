package com.book.map;

import java.util.LinkedHashMap;

/**
 * 使用LinkedHashMap时，迭代顺序
 * 与插入顺序相同
 * @author 芦庆
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
