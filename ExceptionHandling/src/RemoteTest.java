interface RemoteControl {
    void turnOn();

    default void batteryStatus() {
        System.out.println("Battery is at 80%.");
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
    }
}

