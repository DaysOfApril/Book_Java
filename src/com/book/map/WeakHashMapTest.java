package com.book.map;

import java.util.WeakHashMap;

public class WeakHashMapTest 
{
	public static void main(String[] args)
	{
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		
		whm.put(new String("����"), new String("����"));
		whm.put(new String("��ѧ"), new String("һ��"));
		whm.put(new String("Ӣ��"), new String("����"));
		
		System.out.println("whm: " + whm);
		
		whm.put("Jillie", "lovely");
		
		System.out.println("new whm: " + whm);
		
		System.gc();
		System.runFinalization();
		
		System.out.println("finally whm: " + whm);
	}
}
