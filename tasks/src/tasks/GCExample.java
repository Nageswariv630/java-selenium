package tasks;

public class GCExample {
	protected void finalize() {
		System.out.println("Object Collected");
	}
	public static void main(String[] args) { 
		GCExample obj = new GCExample(); 
		obj = null; 
		System.gc(); 
		} 

}
