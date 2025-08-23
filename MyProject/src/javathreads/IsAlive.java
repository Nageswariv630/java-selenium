package javathreads;
public class IsAlive extends Thread {
    public void run() {
        System.out.println("Thread is running");
        try {
        	Thread.sleep(300); 
        	}
        catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Thread execution done");
    }

    public static void main(String[] args) {
        IsAlive obj1 = new IsAlive();
        IsAlive obj2 = new IsAlive();
        obj1.start();
        obj2.start();
        System.out.println(obj1.isAlive());
        System.out.println(obj1.isAlive());
    }
}
