package com.book.map;

import java.util.HashMap;

/**
 * Hashtable ��һ���̰߳�ȫ��Mapʵ�֣�HashMap����ȫ
 * ��ˣ�HashMap�����ܽϸ�
 * 
 * Hashtable������null��Ϊ���Ժ�value����HashMap����ʹ��null��Ϊkey��value
 * @author «��
 *
 */

public class NullInHashMap 
{
	public static void main(String[] args)
	{
		HashMap<Object, Object> hm = new HashMap<>();
		
		hm.put("null", "null");
		
//		����ʧ��
		hm.put("null", "null");
		
		hm.put("Chen", "grace");
		
		System.out.println("hm: " + hm);
		
	}
}
