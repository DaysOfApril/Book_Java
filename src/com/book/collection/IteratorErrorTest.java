package com.book.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorErrorTest 
{
	public static void main(String[] args)
	{
		Collection<String> c = new HashSet<>();
		
		c.add("Jillie");
		c.add("is");
		c.add("a");
		c.add("lovely");
		c.add("girl");
		c.add("emmm");
		
		for(Iterator<String> it = c.iterator(); it.hasNext(); )
		{
			String tmp = (String)it.next();
			
			if(tmp.equals("emmm"))
			{
//				在Iterator迭代过程中，不可修改集合元素，下面代码将引发异常
				c.remove(tmp);
			}
		}
		
		System.out.println("c: " + c);
		
		
	}
}
