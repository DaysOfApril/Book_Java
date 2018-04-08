package com.book.list;

import java.util.Stack;

/**
 * 现在的程序一般较少的使用Stack类，
 * 如果程序需要使用栈，则可以使用LinkedList
 * 它是基于链表的，List的实现类
 * LinkedList 既实现了List接口，也实现了Deque接口
 * @author 芦庆
 *
 */

public class VectorTest 
{
	public static void main(String[] args)
	{
		Stack<Object> v = new Stack<>();
		
		v.push("Jillie");
		v.push("is");
		v.push("a");
		v.push("lovely");
		v.push("girl");
		
		System.out.println("v: " + v);
		
		System.out.println("v.peek(): " + v.peek());
		System.out.println("v: " + v);
		
		System.out.println("v.pop()" + v.pop());
		System.out.println("v: " + v);
	}
}
