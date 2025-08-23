
interface Controllable {
    void turnOn();

    default void status() {
        System.out.println("Device is operational.");
    }

    static void deviceInfo() {
        System.out.println("Controllable devices can be turned on/off and report status.");
    }
}


class SmartLight implements Controllable {
    public void turnOn() {
        System.out.println("SmartLight is now ON.");
    }
}

class SmartFan implements Controllable {
    public void turnOn() {
        System.out.println("SmartFan is now ON.");
    }
}
public class SmartDeviceSystem {
    public static void main(String[] args) {
        SmartLight light = new SmartLight();
        SmartFan fan = new SmartFan();

        light.turnOn();
        light.status();

        fan.turnOn();
        fan.status();

        Controllable.deviceInfo(); 
    }
}

