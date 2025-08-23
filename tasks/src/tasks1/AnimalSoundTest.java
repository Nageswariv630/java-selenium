package tasks1;

//Base class
class Animal {
 void sound() {
     System.out.println("Animal makes a sound");
 }
}

//Subclass: Dog
class Dog extends Animal {
 @Override
 void sound() {
     System.out.println("Dog barks");
 }
}

//Subclass: Cat
class Cat extends Animal {
 @Override
 void sound() {
     System.out.println("Cat meows");
 }
}

//Subclass: Cow
class Cow extends Animal {
 @Override
 void sound() {
     System.out.println("Cow moos");
 }
}

//Main class to demonstrate polymorphism
public class AnimalSoundTest {
 public static void main(String[] args) {
     // Using dynamic method dispatch
     Animal animal;

     animal = new Dog();
     animal.sound();  // Dog's sound

     animal = new Cat();
     animal.sound();  // Cat's sound

     animal = new Cow();
     animal.sound();  // Cow's sound
 }
}

