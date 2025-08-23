package task2;

interface RemoteControl {
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery is at 80%.");
    }

    static void info() {
        System.out.println("RemoteControl: Used to control electronic devices remotely.");
    }
}

class TV implements RemoteControl {
    public void turnOn() {
        System.out.println("TV is turned ON.");
    }
}

public class RemoteTest {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.batteryStatus();

        RemoteControl.info(); // Static method called using interface name
    }
}

