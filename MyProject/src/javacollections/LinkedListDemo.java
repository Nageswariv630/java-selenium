package javacollections;

import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<Integer> ();
		for(int i= 1; i<= 5; i++)
		{
			l.add(i);
		}
		System.out.println(l);
		
		l.remove(3);
		
		System.out.println(l);
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.print(l.get(i) + " ");
		}
				
	}

}
