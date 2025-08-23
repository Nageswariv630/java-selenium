package javacollections;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer>pQ=new PriorityQueue<Integer>();
		pQ.add(10);
		pQ.add(20);
		pQ.add(15);
		//printing top element of priority queue
		System.out.println(pQ.peek());
		//printing and removing the top element of priority queue
		System.out.println(pQ.poll());
		System.out.println(pQ.peek());
	}

}
