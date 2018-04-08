package com.book.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class M
{
	int age;
	
	public M(int age)
	{
		setAge(age);
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	@Override
	public String toString()
	{
		return "" + age;
	}
	
}

public class TreeSetTest4 
{
	public static void main(String[] args)
	{
		TreeSet<Object> ts = new TreeSet<>(new Comparator<Object>()
				{
					public int compare(Object obj1, Object obj2)
					{
						M m1 = (M)obj1;
						M m2 = (M)obj2;
						
						return m1.getAge() > m2.getAge() ? -1 :
							m1.getAge() < m2.getAge() ? 1 : 0;
					}
				});
		
		
		ts.add(new M(5));
		ts.add(new M(-3));
		ts.add(new M(9));
		
		System.out.println("ts: " + ts);
	}
}
