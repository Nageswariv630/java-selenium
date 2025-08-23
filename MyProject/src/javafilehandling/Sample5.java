package javafilehandling;

import java.io.File;

public class Sample5 {
	public static void main(String[] args) {
		File obj=new File("myfile1.txt");
		if(obj.delete()) {
			System.out.println("Deleted File is: "+obj.getName());
		}else {
			System.out.println("Failed to delete a file..");
		}
	}

}
