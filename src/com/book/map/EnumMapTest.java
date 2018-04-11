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
		
		enumMap.put(Season.SPRING, "��԰��ɫ�ز�ס");
		enumMap.put(Season.WINTER, "����һҹ������");
		
		System.out.println("enumMap: " + enumMap);
	}
}
