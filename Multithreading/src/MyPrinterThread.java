
public class MyPrinterThread extends Thread {

	    // Override the run method
	    public void run() {
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Hello from Thread!");
	            try {
	                Thread.sleep(1000); 
	            } catch (InterruptedException e) {
	                e.printStackTrace(); // Handle any interruption
	            }
	        }
	    }

	    // Main method to run the thread
	    public static void main(String[] args) {
	        MyPrinterThread thread = new MyPrinterThread(); // Create an instance
	        thread.start(); 
	    }
	}

