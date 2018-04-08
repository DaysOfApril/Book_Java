package com.book.set;

import java.util.HashSet;
import java.util.Iterator;

class R
{
	private int count;
	
	public R(int count)
	{
		setCount(count);
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public int getCount()
	{
		return count;
	}

	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(null != obj && obj.getClass() == R.class)
		{
			R tmp = (R)obj;
			
			return tmp.count == this.count;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{
		return "R[count: " + count + "]";
	}
}


public class HashTest2 
{
	public static void main(String[] args)
	{
		HashSet<Object> books = new HashSet<>();
		
		books.add(new R(5));
		books.add(new R(-3));
		books.add(new R(9));
		books.add(new R(-2));
		
		System.out.println("books: " + books);
		
		Iterator<Object> it = books.iterator(); 
		R first = (R)it.next();
		first.setCount(-3);
		
		System.out.println("after set, books: " + books);
		
		System.out.println(books.remove(-3));
		System.out.println("after delete, books: " + books);		
		System.out.println("books.contains(new R(-3))? : " + books.contains(new R(-3)));
	}
}
