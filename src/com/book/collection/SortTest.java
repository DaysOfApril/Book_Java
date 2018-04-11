package com.book.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTest 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		@SuppressWarnings("rawtypes")
		ArrayList nums = new ArrayList();
		
		nums.add(2);
		nums.add(-5);
		nums.add(3);
		nums.add(0);
		
		System.out.println("nums: " + nums);
		
		Collections.reverse(nums);
		System.out.println("after reverse: " + nums);
		
		Collections.swap(nums, 0, 1);
		System.out.println("after swap 1_0: " + nums);
		
		Collections.sort(nums);
		System.out.println("after sort: " + nums);
		
		Collections.sort(nums, new Comparator<Object>() {

			@Override
			public int compare(Object arg0, Object arg1) {
				int i1 = (int)arg0;
				int i2 = (int)arg1;
				
				return i1 > i2 ? -1 : 
					i1 < i2 ? 1 : 0;
			}
		});
		System.out.println("after sort2: " + nums);
		
		Collections.shuffle(nums);
		System.out.println("after shuffle: " + nums);
	}
}
