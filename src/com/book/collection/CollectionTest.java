package com.book.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest 
{
	public static void main(String[] args)
	{
		Collection<String> c = new ArrayList<>();
		
		c.add("Jillie");
		c.add("is");
		c.add("a");
		c.add("lovely");
		c.add("girl");
		c.add("emmm");
		c.remove("emmm");
		
		System.out.println("c: " + c);
		System.out.println("集合元素个数为：" + c.size());
		System.out.println("c.contains(\"Jillie\"): ? " + c.contains("Jillie") + "\n");
		
		
		Collection<Object> set = new HashSet<>();
		
		set.add("Chen");
		set.add("grace");
		set.add("girl");
		
		System.out.println("set: " + set);
		System.out.println("c是否完全包含set集合？ " + c.containsAll(set));
		
		c.removeAll(set);
		System.out.println("c after delete set: " + c);
		
		c.clear();
		System.out.println("c after clear: " + c);
		
		set.retainAll(c);
		System.out.println("set after set.retainAll(c): " + set);
	}
}
