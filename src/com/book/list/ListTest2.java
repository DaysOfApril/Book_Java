package com.book.list;

import java.util.ArrayList;
import java.util.List;

class A
{
	@Override
	public boolean equals(Object obj)
	{
		return true;
	}
}

public class ListTest2 
{
	public static void main(String[] args)
	{
		List<Object> books = new ArrayList<>();
		
		books.add("Jillie");
		books.add("is");
		books.add("a");
		books.add("lovely");
		books.add("girl");
		
		System.out.println("books: " + books);
		
		books.remove(new A());
		System.out.println("books: " + books);
		
		books.remove(new A());
		System.out.println("books: " + books);
	}
}
