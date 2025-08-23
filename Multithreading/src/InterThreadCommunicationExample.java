class Buffer {
    private int data;
    private boolean hasData = false;

    // Producer puts data
    public synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // Wait if buffer is full
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // Notify consumer
    }

    // Consumer gets data
    public synchronized int consume() throws InterruptedException {
        while (!hasData) {
            wait(); // Wait if buffer is empty
        }
        hasData = false;
        System.out.println("Consumed: " + data);
        notify(); // Notify producer
        return data;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.produce(i); // Produce number
                Thread.sleep(100); // Small delay
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                buffer.consume(); // Consume number
                Thread.sleep(150); // Small delay
            } catch (InterruptedException e) {
            }
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Producer(buffer).start(); // Start producer
        new Consumer(buffer).start(); // Start consumer
    }
}

