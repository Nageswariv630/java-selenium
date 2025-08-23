package javafilehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Sample3 {
	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("myfile.txt");
			writer.write("Learning file handling in java!!");
			writer.close();
			System.out.println("successfully written..");
		}catch(IOException ex) {
			System.out.println("An error has occured");
			ex.printStackTrace();
		}
	}

}
