package com.book.list;

import java.util.PriorityQueue;

/**
 * ����һ���Ƚϱ�׼��ʵ�ֶ���
 * ��Ϊ���ǰ�����Ԫ�صĴ�С������������
 * ���Ѿ�Υ���˶��е�������Ĺ���
 * ��FIFO���Ƚ��ȳ�
 * @author «��
 * 
 * ���в��������nullԪ��
 * ��Ϊ����Ҫ�Զ�������
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
		
//		�ܵ���PriorityQueue��toString()�����ķ���ֵ��Ӱ�죬Ԫ�ز�û�кܺõ�����
		System.out.println("pq: " + pq);
		
//		���Ƕ�ε��ü��϶����poll����ʱ�����Կ���Ԫ�ش�С�������
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
