package javathreads;
class Task1 implements Runnable{
	Task1(){
		System.out.println("Thread:"+Thread.currentThread().getName()+""+"STATE:NEW");
	}
	public void run() {
		System.out.println("thread:"+Thread.currentThread().getName()+"state:Running");
	for(int i=4;i<0;i--) {
		System.out.println("THread:"+Thread.currentThread().getName()+"next thread");
		
	}
	System.out.println(Thread.currentThread().getName()+"      its zero");
	}
}

public class Threadjoin {
	public static void main(String[] args) throws InterruptedException {
	Thread t=new Thread(new Task1(),"scannning");
	  Thread t1=new Thread(new Task1(),"running");
		Thread t2=new Thread(new Task1(),"connecting");
		t.start();
		t.join();
		
		t1.start();
		t1.join();
		
		t2.start();
	t2.join();
	}
}
