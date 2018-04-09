package com.book.list;

import java.util.PriorityQueue;

/**
 * 这是一个比较标准的实现队列
 * 因为这是按队列元素的大小进行重新排序
 * 这已经违反了队列的最基本的规则
 * （FIFO）先进先出
 * @author 芦庆
 * 
 * 其中不允许插入null元素
 * 因为还需要对队列排序
 */

public class PriorityQueueTest 
{
	public static void main(String[] args)
	{
		PriorityQueue<Object> pq = new PriorityQueue<>();
		
		pq.offer(5);
		pq.offer(2);
		pq.offer(-1);
		pq.offer(7);
		pq.offer(-6);
		
//		受到了PriorityQueue的toString()方法的返回值的影响，元素并没有很好的排序
		System.out.println("pq: " + pq);
		
//		但是多次调用集合对象的poll方法时，可以看到元素从小到大输出
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
