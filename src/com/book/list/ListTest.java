package com.book.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest 
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
		
		books.add(1, "emmm");
		
		for(int loop = 0; loop < books.size(); ++loop)
		{
			System.out.print(books.get(loop) + " ");
		}
		
		books.remove(1);
		System.out.println("\nbooks: " + books);
		
		System.out.println("books.indexOf(\"lovely\"): " + books.indexOf("lovely"));
		books.set(0, "Chen");
		System.out.println("new books: " + books);
		
		System.out.println("books.subList(1, 3): " + books.subList(1, 3));
	}
}
