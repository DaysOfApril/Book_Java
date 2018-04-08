package com.book.enumset;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * HashSet, TreeSet, EnumSet �����̲߳���ȫ��
 * @author «��
 *
 */

public class EnumSetTest2 
{
	public static void main(String[] args)
	{
		Collection<Season> c = new HashSet<>();
		
		c.clear();
		c.add(Season.FALL);
		c.add(Season.SPRING);
		
		EnumSet<Season> es = EnumSet.copyOf(c);
		System.out.println("es: " + es);
	}
}
