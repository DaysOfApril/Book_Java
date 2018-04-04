package com.book.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorTest 
{
	public static void main(String[] args)
	{
		Collection<Object> c = new HashSet<>();
		
		c.add("Jillie");
		c.add("is");
		c.add("a");
		c.add("lovely");
		c.add("girl");
		c.add("emmm");
		
		for(Iterator<Object> it = c.iterator(); it.hasNext(); )
		{
			String tmp = (String)it.next();
			System.out.println(tmp);
			
			if(tmp.equals("emmm"))
			{
				it.remove();
			}
			
			tmp = "tmp";
		}
		
		System.out.println("\n\nthe c , after test: " + c);
		
	}
}
