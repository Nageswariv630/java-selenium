package tasks1;

//Abstract class
abstract class Appliance {
 abstract void turnOn(); // Abstract method
}

//Interface
interface Connectable {
 void connect(); // Interface method
}

//SmartTV class extending abstract class and implementing interface
class SmartTV extends Appliance implements Connectable {

 @Override
 void turnOn() {
     System.out.println("SmartTV is now ON.");
 }

 @Override
 public void connect() {
     System.out.println("SmartTV is connected to Wi-Fi.");
 }
}

//Main class to test
public class ApplianceTest {
 public static void main(String[] args) {
     SmartTV tv = new SmartTV();
     tv.turnOn();
     tv.connect();
 }
}

