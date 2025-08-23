class CountdownTimer extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i); // Print current number
            try {
                Thread.sleep(1000); // Wait 1 second
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
        System.out.println("Time’s up!"); // Final message
    }
}

public class Timer {
    public static void main(String[] args) {
        CountdownTimer timer = new CountdownTimer(); // Create thread
        timer.start(); // Start countdown
    }
}

