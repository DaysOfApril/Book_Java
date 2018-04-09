package com.book.list;

import java.util.LinkedList;

/**
 * LinkedList����List�ӿڵ�ʵ���࣬������Ը������������ʼ����е�Ԫ��
 * ����֮�⣬LinkedList��ʵ����Deque�ӿڣ���������Գ䵱˫�˶���
 * ��Ȼ��Ҳ���Գ䵱ջ
 * @author «��
 *
 * �ڲ���������ʽ���漯���е�Ԫ��
 * ����������ʼ���Ԫ��ʱ�����ܽϲ�
 * �����룬ɾ��ʱ���ܽϺ�
 * 
 */

public class LinkedListTest 
{
	public static void main(String[] args)
	{
		LinkedList<String> books = new LinkedList<>();
		
		books.add("Jillie");
		books.push("is");
		books.offerLast("a");
		books.push("lovely");
		books.add("girl");
		
//		add ��ӵ���β
//		push ��ӵ�ջ��
//		offer ��ӵ���β
		for(int loop = 0; loop < books.size(); ++loop)
		{
			System.out.println(books.get(loop));
		}
		
		System.out.println("\n\n\nbooks.peekFirst(): " + books.peekFirst());
		System.out.println("books.peekLast(): " + books.peekLast());
		System.out.println("books: " + books);
		
		System.out.println("books.pop(): " + books.pop());
		System.out.println("books.pop(): " + books.pop());
		System.out.println("books.pop(): " + books.pop());
		System.out.println("finally, books: " + books);
	}
}
