package com.book.map;

import java.util.TreeMap;

class R implements Comparable<Object>
{
	int count;
	
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
	public int compareTo(Object obj)
	{
		R tmp = (R)obj;
		
		return this.count > tmp.count ? 1 : 
			this.count < tmp.count ? -1 : 0;
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
		return count + "";
	}
	
}

public class TreeMapTest 
{
	public static void main(String[] args)
	{
		TreeMap<Object, Object> treeMap1 = new TreeMap<>();
		
		treeMap1.put(new R(3), "Jillie");
		treeMap1.put(new R(5), "Chen");
		treeMap1.put(new R(7), "ao");
		
		System.out.println("treeMap1: " + treeMap1);
		
		System.out.println(treeMap1.firstEntry()); 
		
		System.out.println(treeMap1.lastEntry()); 
		
		System.out.println(treeMap1.higherKey(new R(4)));
		
		System.out.println(treeMap1.lowerEntry(new R(6)));
		
		System.out.println(treeMap1.subMap(new R(3), new R(7)));
	}
}
