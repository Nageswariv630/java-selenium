package javaexceptions;

public class Sample3 {
	public static void main(String[] args) {
		int num=20;
		int div=0;
		try {
			int res=num/div;
			System.out.println(res);
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception occured!!");
		}
	}

}
