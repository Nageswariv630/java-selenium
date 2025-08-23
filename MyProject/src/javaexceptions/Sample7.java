package javaexceptions;

public class Sample7 {
	public static void main(String[] args) {
		int num=20;
		int div=1;
		try {
			System.out.println(num/0);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured!!");
		}finally {
			System.out.println("Finally block executed");
		}
	}

}
