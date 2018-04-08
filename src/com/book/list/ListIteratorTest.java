package com.book.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest 
{
	public static void main(String[] args)
	{
		String[] books = {"Jillie", "is", "a", "lovely", "girl"};
		List<Object> list = new ArrayList<>();
		
		for(int loop = 0; loop < books.length; ++loop)
		{
			list.add(books[loop]);
		}
		
		ListIterator<Object> lit = list.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
			lit.add("emmm");
		}
		System.out.println("·´Ïòµü´ú£º\n");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}
}
