package com.book.enumset;

import java.util.EnumSet;

enum Season
{
	SPRING, SUMMER, FALL, WINTER;
}

public class EnumSetTest 
{
	public static void main(String[] args)
	{
		EnumSet<Season> es1 = EnumSet.allOf(Season.class);
		System.out.println("es1: " + es1);
		
		EnumSet<Season> es2 = EnumSet.noneOf(Season.class);
		System.out.println("es2: " + es2);
		es2.add(Season.SPRING);
		es2.add(Season.FALL);
		System.out.println("new es2: " + es2);
		
		EnumSet<Season> es3 = EnumSet.of(Season.FALL, Season.SPRING);
		System.out.println("es3: " + es3);
		
		EnumSet<Season> es4 = EnumSet.range(Season.SUMMER, Season.WINTER);
		System.out.println("es4: " + es4);
		
		EnumSet<Season> es5 = EnumSet.complementOf(es4);
		System.out.println("es5: " + es5);
		
	}
}
