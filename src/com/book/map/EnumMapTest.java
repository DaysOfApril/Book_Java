package com.book.map;

import java.util.EnumMap;

enum Season
{
	SPRING, SUMMER, FALL, WINTER
}

public class EnumMapTest 
{
	public static void main(String[] args)
	{
		EnumMap<Season, String> enumMap = new EnumMap<>(Season.class);
		
		enumMap.put(Season.SPRING, "满园春色关不住");
		enumMap.put(Season.WINTER, "忽如一夜春风来");
		
		System.out.println("enumMap: " + enumMap);
	}
}
