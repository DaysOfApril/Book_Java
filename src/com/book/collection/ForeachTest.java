package com.book.collection;

import java.util.Collection;
import java.util.HashSet;

public class ForeachTest 
{
	public static void main(String[] args)
	{
		Collection<String> c = new HashSet<>();
		
		c.add("Jillie");
		c.add("is");
		c.add("a");
		c.add("lovely");
		c.add("girl");
		
		for(String loop: c)
		{
			System.out.println(loop);
		}
		
		System.out.println("c: " + c);
	}
}
