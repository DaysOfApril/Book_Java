package com.book.set;

import java.util.HashSet;
import java.util.Set;

/**
 * 不能保证元素的排列顺序，顺序有可能发生变化
 * HashSet是不同步的，若多个线程同时访问一个HashSet，则必须通过代码来保持同步
 * @author 芦庆
 * 集合元素可以为null
 */

public class SetTest 
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("Jillie");
		
		System.out.println("set.add(\"Jillie\")：" + set.add("Jillie"));
		System.out.println("set: " + set);
	}
}
