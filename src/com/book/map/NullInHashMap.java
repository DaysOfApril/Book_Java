package com.book.map;

import java.util.HashMap;

/**
 * Hashtable 是一个线程安全的Map实现，HashMap不安全
 * 因此，HashMap的性能较高
 * 
 * Hashtable不允许null作为可以和value，而HashMap可以使用null作为key或value
 * @author 芦庆
 *
 */

public class NullInHashMap 
{
	public static void main(String[] args)
	{
		HashMap<Object, Object> hm = new HashMap<>();
		
		hm.put("null", "null");
		
//		加入失败
		hm.put("null", "null");
		
		hm.put("Chen", "grace");
		
		System.out.println("hm: " + hm);
		
	}
}
