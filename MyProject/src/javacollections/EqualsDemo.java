package javacollections;

class Emp{
	String emp_name;
	int emp_id;
	
	public Emp(String emp_name , int emp_id) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id ;
	}
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		
		if(obj == null || obj.getClass() != this.getClass()) 
			return false;	
			
		Emp emp = (Emp) obj;
		return this.emp_id == emp.emp_id && this.emp_name.equals(emp.emp_name);
		}
	
	
	
	@Override
	public int hashCode() {
		return this.emp_id;
	}

}

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp emp1 = new Emp("Alex", 101);
		Emp emp2 = new Emp("Alex", 102);
		
		if(emp1.hashCode() == emp2.hashCode()) {
			if(emp1.equals(emp2)) {
				
			System.out.println("Both objectss are equal");
			}
			else {
				System.out.println("Both objectss are not equal");
			}
		}
		else {
			System.out.println("Both objects are not qual");
		}
		
		
	}

}
