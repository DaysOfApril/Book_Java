package com.book.collection;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationTest 
{
	public static void main(String[] args)
	{
		Vector<Object> v = new Vector<>();
		v.add("Jillie");
		v.add("lovely");
		
		Hashtable<Object, Object> scores = new Hashtable<>();
		scores.put("Chinese", 78);
		scores.put("Math", 88);
		
		Enumeration<Object> em = v.elements();
		while(em.hasMoreElements())
		{
			System.out.println(em.nextElement());
		}
		
		Enumeration<Object> keyEm = scores.keys();
		while(keyEm.hasMoreElements())
		{
			Object key = keyEm.nextElement();
			System.out.println(key + " -> " + scores.get(key));
		}
	}
}
