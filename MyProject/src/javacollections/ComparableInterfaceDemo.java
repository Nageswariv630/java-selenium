package javacollections;

import java.util.Arrays;

class Number implements Comparable<Number>{
	int v;

	public Number(int v) {
		// TODO Auto-generated constructor stub
		this.v=v;
	}
	@Override
	public int compareTo(Number o) {
		// TODO Auto-generated method stub
		//ascending order
		return this.v - o.v;
	} 
	@Override
	public String toString() {
		return String.valueOf(v);
		
	}
	
}

public class ComparableInterfaceDemo {
	public static void main(String[] args) {
		Number[] n= {new Number(4),new Number(1),new Number(7),new Number(2)};
		System.out.println("Before Sorting:"+Arrays.toString(n));
		Arrays.sort(n);
		System.out.println("After sorting: "+Arrays.toString(n));
		}
	}


