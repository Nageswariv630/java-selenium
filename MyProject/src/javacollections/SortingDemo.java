package javacollections;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();

		al.add("Zoe");

		al.add("Clare");

		al.add("Toni");

		al.add("Alen");

		Collections.sort(al);

		System.out.println(al);

		Collections.sort(al, Collections.reverseOrder());

		System.out.println(al);

	}
}
