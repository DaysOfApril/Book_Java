package com.book.set;

import java.util.HashSet;
import java.util.Set;

/**
 * ���ܱ�֤Ԫ�ص�����˳��˳���п��ܷ����仯
 * HashSet�ǲ�ͬ���ģ�������߳�ͬʱ����һ��HashSet�������ͨ������������ͬ��
 * @author «��
 * ����Ԫ�ؿ���Ϊnull
 */

public class SetTest 
{
	public static void main(String[] args)
	{
		Set<String> set = new HashSet<>();
		
		set.add("Jillie");
		
		System.out.println("set.add(\"Jillie\")��" + set.add("Jillie"));
		System.out.println("set: " + set);
	}
}
