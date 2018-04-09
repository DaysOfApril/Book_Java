package com.book.map;

import java.util.Hashtable;

class A
{
	int count;
	
	public A(int count)
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
		if(null != obj && obj.getClass() == A.class)
		{
			A tmp = (A)obj;
			
			return tmp.getCount() == this.getCount();
		}
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return this.count;
	}

	@Override
	public String toString()
	{
		return count + "";
	}
}

class B
{
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
}

public class HashtableTest 
{
	public static void main(String[] args)
	{
		Hashtable<Object, Object> ht = new Hashtable<>();
		
		ht.put(new A(19), "Jillie");
		ht.put(new A(20), "Chen");
		ht.put(new A(21), new B());
		
		System.out.println("ht: " + ht);
		
		System.out.println("ht.containsKey(\"Emmm\"): " + ht.containsValue("Emmm"));
		
		System.out.println("ht.containsKey(new A(19)): " + ht.containsKey(new A(19)));
		
		ht.remove(new A(21));
		
		for(Object key: ht.keySet())
		{
			System.out.print(key + " -> ");
			System.out.println(ht.get(key));
		}
	}
}
