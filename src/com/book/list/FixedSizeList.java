package com.book.list;

import java.util.Arrays;
import java.util.List;

/**
 * �̶����鳤�ȵ�list
 * 
 * Arrays���ù������ṩ��asList(Object ...a)�ķ���
 * �÷������԰�һ��������ƶ� �����Ķ���ת����һ��list���ϣ����list����
 * �Ȳ���ArrayListʵ�����ʵ����Ҳ����Vectorʵ�����ʵ��
 * ����Arrays�ڲ���ArrayList��ʵ��
 * @author «��
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
