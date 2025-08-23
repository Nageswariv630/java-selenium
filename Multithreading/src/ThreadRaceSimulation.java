import java.util.Random;

class Racer extends Thread {
    private String name;
    private Random random = new Random();

    public Racer(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " running... (" + i + ")");
            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
            }
        }
    }
}

public class ThreadRaceSimulation {
    public static void main(String[] args) {
        Thread tortoise = new Racer("Tortoise");
        Thread rabbit = new Racer("Rabbit");
        Thread dog = new Racer("Dog");

        tortoise.start();
        rabbit.start();
        dog.start();
    }
}

