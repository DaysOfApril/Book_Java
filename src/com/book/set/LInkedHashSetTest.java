package com.book.set;

import java.util.LinkedHashSet;

/**
 * 它使用链表来为何元素的次序
 * 这样使得元素看起来是以插入的顺序保存的
 * 
 * 元素的顺序总是与添加的顺序一致
 * 尽管LinkedHashSe使用了链表记录集合元素的添加顺序
 * 但它依然不允许集合元素重复
 * @author 芦庆
 *
 */

public class LInkedHashSetTest 
{
	public static void main(String[] args)
	{
		LinkedHashSet<Object> books = new LinkedHashSet<>();
		
		books.add("Jillie");
		books.add("is");
		books.add("a");
		books.add("lovely");
		books.add("girl");
		
		System.out.println("books: " + books);
	}
}
