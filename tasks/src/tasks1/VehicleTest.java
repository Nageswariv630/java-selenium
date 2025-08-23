package tasks1;

//Base class
class Vehicle {
 String brand;
 int speed;

 Vehicle(String brand, int speed) {
     this.brand = brand;
     this.speed = speed;
 }

 void showDetails() {
     System.out.println("Vehicle Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
 }
}

//Derived class: Car
class Car extends Vehicle {
 int numDoors;

 Car(String brand, int speed, int numDoors) {
     super(brand, speed);
     this.numDoors = numDoors;
 }

 @Override
 void showDetails() {
     System.out.println("Car Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
     System.out.println("Number of Doors: " + numDoors);
 }
}

//Derived class: Bike
class Bike extends Vehicle {
 boolean hasCarrier;

 Bike(String brand, int speed, boolean hasCarrier) {
     super(brand, speed);
     this.hasCarrier = hasCarrier;
 }

 @Override
 void showDetails() {
     System.out.println("Bike Brand: " + brand);
     System.out.println("Speed: " + speed + " km/h");
     System.out.println("Has Carrier: " + (hasCarrier ? "Yes" : "No"));
 }
}

//Main class to test
public class VehicleTest {
 public static void main(String[] args) {
     Car car = new Car("Toyota", 180, 4);
     Bike bike = new Bike("Yamaha", 120, true);

     System.out.println("=== Car Details ===");
     car.showDetails();

     System.out.println("\n=== Bike Details ===");
     bike.showDetails();
 }
}

