package com.book.map;

import java.util.WeakHashMap;

public class WeakHashMapTest 
{
	public static void main(String[] args)
	{
		WeakHashMap<Object, Object> whm = new WeakHashMap<>();
		
		whm.put(new String("语文"), new String("良好"));
		whm.put(new String("数学"), new String("一般"));
		whm.put(new String("英语"), new String("优秀"));
		
		System.out.println("whm: " + whm);
		
		whm.put("Jillie", "lovely");
		
		System.out.println("new whm: " + whm);
		
		System.gc();
		System.runFinalization();
		
		System.out.println("finally whm: " + whm);
	}
}
