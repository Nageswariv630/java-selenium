package javawrapperclass;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive datatype
         int number;
         //integer wrapper type
         Integer number1;
         number1=200;
         //auto boxing:converting primitive int to Interger object
         number=number1;
         System.out.println("The primitive int number is: "+number);
         System.out.println("The Integer object number1 is: "+number1);
	}

}
