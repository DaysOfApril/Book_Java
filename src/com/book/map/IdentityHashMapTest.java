package com.book.map;

import java.util.IdentityHashMap;

/**
 * 
 * ���ҽ���������ͨ�� ��==���ж����ʱ
 * IdentityHashMap����Ϊ����key���
 *
 */

public class IdentityHashMapTest 
{
	public static void main(String[] args)
	{
		IdentityHashMap<Object, Object> ihm = new IdentityHashMap<>();
		
		ihm.put(new String("����"), new String("����"));
		ihm.put(new String("����"), new String("һ��"));
		
		ihm.put("Jillie", "lovely");
		ihm.put("Jillie", "grace");
		
		System.out.println("ihm: " + ihm);
	}
}
