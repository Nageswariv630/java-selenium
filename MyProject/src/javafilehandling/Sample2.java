package javafilehandling;

import java.io.File;
import java.io.IOException;

public class Sample2 {
	public static void main(String[] args) {
		File obj=new File("myfile1.txt");
		try{
			if(obj.createNewFile()) {
				System.out.println("File created: "+obj.getName());
			}else {
				System.out.println("File already exist");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
