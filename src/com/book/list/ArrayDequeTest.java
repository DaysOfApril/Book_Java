package com.book.list;

import java.util.ArrayDeque;

/**
 * Ë«¶Ë¶ÓÁÐ³äµ±Õ»
 * @author Â«Çì
 *
 */

public class ArrayDequeTest 
{
	public static void main(String[] args)
	{
		ArrayDeque<String> stack = new ArrayDeque<>();
		
		stack.push("Jillie");
		stack.push("is");
		stack.push("a");
		stack.push("lovely");
		stack.push("girl");
	
		System.out.println("stack: " + stack);
		System.out.println("stack.peek(): " + stack.peek());
		
		System.out.println("\nstack: " + stack);
		System.out.println("stack.peek(): " + stack.pop());
		
		System.out.println("finally, stack: " + stack);
	}
}
