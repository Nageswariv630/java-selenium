package javaexceptions;

public class Sample4 {
	public static void main(String[] args) {
		String name=null;
		System.out.println("begin");
		try {
			System.out.println(name.length());
		}catch(NullPointerException ex){
			System.out.println("Exception occured!!");
		}
		System.out.println("end");
	}

}
