package javacollections;

import java.util.*;

class Student {
	int rollNo;
	String name;

	Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
// TODO Auto-generated method stub
		return rollNo + " " + name;
	}
}

class SortByRoll implements Comparator<Student> {
//Compare by roll number in ascending order
	@Override
	public int compare(Student ol, Student o2) {
// TODO Auto-generated method stub
		return ol.rollNo - o2.rollNo;
	}
}

public class ComparatorInterfceDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> sobj = new ArrayList<>();
		sobj.add(new Student(111, "Maya"));
		sobj.add(new Student(131, "Alex"));
		sobj.add(new Student(110, "Clare"));
		sobj.add(new Student(101, "Jack"));
		Collections.sort(sobj, new SortByRoll());
		System.out.println("Sorted by Roll Number: ");
		Iterator<Student> itr = sobj.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
	}
}
