package com.book.set;

import java.util.LinkedHashSet;

/**
 * ��ʹ��������Ϊ��Ԫ�صĴ���
 * ����ʹ��Ԫ�ؿ��������Բ����˳�򱣴��
 * 
 * Ԫ�ص�˳����������ӵ�˳��һ��
 * ����LinkedHashSeʹ���������¼����Ԫ�ص����˳��
 * ������Ȼ��������Ԫ���ظ�
 * @author «��
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
