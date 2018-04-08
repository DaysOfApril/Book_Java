package com.book.treeset;

import java.util.TreeSet;

public class TreeSetTest 
{
	public static void main(String[] args)
	{
		TreeSet<Object> nums = new TreeSet<>();
		
		nums.add(3);
		nums.add(2);
		nums.add(5);
		nums.add(8);
		
		System.out.println("nums: " + nums);
		
		System.out.println("first: " + nums.first());
		
		System.out.println("last: " + nums.last());
		
		System.out.println("nums.headSet(4): " + nums.headSet(4));
		
		System.out.println("nums.tailSet(5): " + nums.tailSet(5));
		
		System.out.println("nums.subSet(2, 5): " + nums.subSet(2, 5));
	}
}
