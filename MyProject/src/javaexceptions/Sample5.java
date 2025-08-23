package javaexceptions;

public class Sample5 {
	public static void main(String[] args) {
	int marks[]= {20,30,60,40,50,78};
	System.out.println("begin");
	try {
		System.out.println(marks[6]);
	}
	catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("ArrayIndexOutOfBoundsException occured!!");
	}
	System.out.println("end");
	}
}
