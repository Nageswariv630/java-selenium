package javacollections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo{
	
public static void main(String[] args) {
	
	Stack<String> s = new Stack<String> ();
	s.push("V"); 
	s.push("Jimin");
	s.push("Jin");
	s.push("RM");
	s.push("J hope");
	s.push("JK"); //add
	
	Iterator<String> i = s.iterator();
	
	while(i.hasNext())
	{
		System.out.print(i.next() + " ");
}
	
	System.out.println("");
	s.pop();
	s.pop();//remove
	System.out.println("------------------");
	i=s.iterator();
	
	while(i.hasNext())
	{
		System.out.println(i.next() + " ");
	}
}
}
