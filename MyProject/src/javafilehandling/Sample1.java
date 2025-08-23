package javafilehandling;

import java.io.File;

public class Sample1 {
	public static void main(String[] args) {
		File obj=new File("info.txt");
		System.out.println("File Created!!");
		System.out.println(obj.getAbsolutePath());
	}

}
