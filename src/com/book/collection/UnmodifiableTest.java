package com.book.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableTest 
{
	public static void main(String[] args)
	{
		List<Object> unmodifyableList = Collections.emptyList();
		
		Set<Object> unmodifyableSet = Collections.singleton("Jillie");
		
		Map<Object, Object> scores = new HashMap<>();
		
		scores.put("Jillie", "lovely");
		scores.put("Chen", "grace");
		
		Map<Object, Object> unmodifyableMap = Collections.unmodifiableMap(scores);
		
		unmodifyableList.add("Ao");
		unmodifyableSet.add("Ao");
		unmodifyableMap.put("Ao", "Oo");
	}
}
