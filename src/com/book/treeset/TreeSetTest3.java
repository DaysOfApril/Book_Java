package com.book.treeset;

import java.util.TreeSet;

/**
 * 一旦改变了TreeSet集合可变元素的Field，当试图删除该元素时，会删除失败
 * 甚至集合中原有的，与其Field修改后相等的元素，都无法删除
 * @author 芦庆
 *
 * 当成功删除一个元素之后，TreeSet会对集合中元素重新索引（不是排序）
 * 接下来就可以删除TreeSet中的元素了
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
//		逐个删除
		System.out.println("new new ts: " + ts);
	}
}
