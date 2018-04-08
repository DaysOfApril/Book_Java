package com.book.treeset;

import java.util.TreeSet;

/**
 * һ���ı���TreeSet���Ͽɱ�Ԫ�ص�Field������ͼɾ����Ԫ��ʱ����ɾ��ʧ��
 * ����������ԭ�еģ�����Field�޸ĺ���ȵ�Ԫ�أ����޷�ɾ��
 * @author «��
 *
 * ���ɹ�ɾ��һ��Ԫ��֮��TreeSet��Լ�����Ԫ��������������������
 * �������Ϳ���ɾ��TreeSet�е�Ԫ����
 */

class R implements Comparable<Object>
{
	private int count;
	
	public R(int count)
	{
		setCount(count);
	}
	
	public void setCount(int count)
	{
		this.count = count;
	}
	
	public int getCount()
	{
		return count;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		if(null != obj && obj.getClass() == R.class)
		{
			R tmp = (R)obj;
			
			return tmp.count == this.count;
		}
		
		return false;
	}

	@Override
	public int compareTo(Object obj)
	{
		R tmp = (R)obj;
		
		return this.count > tmp.count ? 1 : 
			this.count < tmp.count ? -1 : 0;
	}

	@Override
	public String toString()
	{
		return "" + count;
	}
}

public class TreeSetTest3 
{
	public static void main(String[] args)
	{
		TreeSet<Object> ts = new TreeSet<>();
		
		ts.add(new R(5));
		ts.add(new R(-3));
		ts.add(new R(9));
		ts.add(new R(-2));
		ts.add(new R(20));
		
		System.out.println("ts: " + ts);
		
		R first = (R)ts.first();
		first.setCount(20);
		R last = (R)ts.last();
		last.setCount(9);
		
		System.out.println("after set, ts: " + ts);
		
		System.out.println("try delete first: " + ts.remove(new R(-2)));
		System.out.println("try delete 5: " + ts.remove(new R(5)));
		System.out.println("try delete : " + ts.remove(new R(20)));

		ts.add(new R(10));
		System.out.println("new ts: " + ts);
		System.out.println("try delete 9: " + ts.remove(new R(9)));
//		ts.add(new R(10));
		System.out.println("new ts: " + ts);
		System.out.println("try delete 9: " + ts.remove(new R(9)));
//		���ɾ��
		System.out.println("new new ts: " + ts);
	}
}
