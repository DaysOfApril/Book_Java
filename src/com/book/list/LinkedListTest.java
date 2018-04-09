package com.book.list;

import java.util.LinkedList;

/**
 * LinkedList类是List接口的实现类，即其可以根据索引来访问集合中的元素
 * 除此之外，LinkedList还实现了Deque接口，因此它可以充当双端队列
 * 自然，也可以充当栈
 * @author 芦庆
 *
 * 内部以链表形式保存集合中的元素
 * 所以任意访问集合元素时，性能较差
 * 但插入，删除时性能较好
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
		
//		add 添加到队尾
//		push 添加到栈顶
//		offer 添加到队尾
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
