package com.book.list;

import java.util.Arrays;
import java.util.List;

/**
 * 固定数组长度的list
 * 
 * Arrays，该工具类提供了asList(Object ...a)的方法
 * 该方法可以把一个数组或制定 个数的对象转换成一个list集合，这个list集合
 * 既不是ArrayList实现类的实例，也不是Vector实现类的实例
 * 而是Arrays内部类ArrayList的实例
 * @author 芦庆
 *
 */

public class FixedSizeList 
{
	public static void main(String[] args)
	{
		List<Object> fixedList = Arrays.asList("Jillie", "lovely");
		
		System.out.println("fixedList.getclass(): " + fixedList.getClass());
	}
}
