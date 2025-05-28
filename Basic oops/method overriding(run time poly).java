// Parent class
class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Overriding the makeSound method of the parent class @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass inheriting from Animal
class Cat extends Animal {
    // Overriding the makeSound method of the parent class @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Animal reference, but Dog object
        Animal animal2 = new Cat(); // Animal reference, but Cat object
        
        animal1.makeSound(); // Calls the makeSound method of Dog class
        animal2.makeSound(); // Calls the makeSound method of Cat class
    }
}
