package com.book.map;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableErrorTest 
{
	public static void main(String[] args)
	{
		Hashtable<Object, Object> ht = new Hashtable<>();
		
		ht.put(new A(20), "Jillie");
		ht.put(new A(10), "Chen");
		
		Iterator<Object> it = ht.keySet().iterator();
		
		A first = (A)it.next();
		first.setCount(20);
		
		System.out.println("ht: " + ht);
		
		ht.remove(new A(20));
		System.out.println("ht: " + ht);
		
		System.out.println("ht.get(20): " + ht.get(20));
		
	}
}
