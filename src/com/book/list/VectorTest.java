package com.book.list;

import java.util.Stack;

/**
 * ���ڵĳ���һ����ٵ�ʹ��Stack�࣬
 * ���������Ҫʹ��ջ�������ʹ��LinkedList
 * ���ǻ�������ģ�List��ʵ����
 * LinkedList ��ʵ����List�ӿڣ�Ҳʵ����Deque�ӿ�
 * @author «��
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
