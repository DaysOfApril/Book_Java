package com.book.treeset;

import java.util.TreeSet;

/**
 * ʹ�ú�����ṹ���洢
 * 
 * �ж���ȵ�����ֻ��compareTo
 * @author «��
 *
 */


class Z implements Comparable<Object>
{
	private int age;
	
	public Z(int age)
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
	public boolean equals(Object obj)
	{
		return true;
	}
	
	@Override
	public int compareTo(Object obj)
	{
		return 1;
	}
}

public class TreeSetTest2 
{
	public static void main(String[] args)
	{
		TreeSet<Object> ts = new TreeSet<>();
		
		Z z1 = new Z(3);
		
		ts.add(z1);
		System.out.println("for the second time: " + ts.add(z1));
		System.out.println("ts: " + ts);
		
		((Z)ts.first()).setAge(5);
		
		System.out.println("((Z)ts.last()).getAge(): " + ((Z)ts.last()).getAge());
	}
}
