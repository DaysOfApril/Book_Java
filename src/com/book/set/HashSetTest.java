package com.book.set;

class A
{
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
}

class B
{
	@Override
	public int hashCode()
	{
		return 1;
	}
}

class C
{
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
	
	@Override
	public int hashCode()
	{
		return 1;
	}
}

public class HashSetTest 
{
	public static void main(String[] args)
	{
		
	}
}
