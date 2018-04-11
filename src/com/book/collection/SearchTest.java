package com.book.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SearchTest 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args)
	{
		ArrayList nums = new ArrayList();
		
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		
		System.out.println("nums: " + nums);
		
		System.out.println("Collections.max(nums): " + Collections.max(nums));
		
		System.out.println("Collections.min(nums): " + Collections.min(nums));
		
		Collections.replaceAll(nums, 0, 1);
		System.out.println("new nums: " + nums);
		
		System.out.println("Collections.frequency(nums, -5): " + Collections.frequency(nums, -5));

		Collections.sort(nums);
		System.out.println("new nums: " + nums);
		
		System.out.println("Collections.binarySearch(nums, 3): " + Collections.binarySearch(nums, 3));
	}
}
