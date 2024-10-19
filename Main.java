abstract class Animal {
    // Private field (Encapsulation)
    private String name;

    // Constructor for the abstract class
    public Animal(String name) {
        this.name = name;
    }

    // Getter method for the private field
    public String getName() {
        return name;
    }

    // Setter method for the private field
    public void setName(String name) {
        this.name = name;
    }

    // Abstract method (to be implemented by subclasses)
    public abstract void sound();

    // Non-abstract method
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass 1 (extends Animal class)
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the constructor of the superclass (Animal)
    }

    // Implementation of the abstract method
    @Override
    public void sound() {
        System.out.println(getName() + " says: Woof!");
    }

    // Unique method for Dog class
    public void fetch() {
        System.out.println(getName() + " is fetching the ball.");
    }
}

// Subclass 2 (extends Animal class)
class Cat extends Animal {
    public Cat(String name) {
        super(name); // Call the constructor of the superclass (Animal)
    }

    // Implementation of the abstract method
    @Override
    public void sound() {
        System.out.println(getName() + " says: Meow!");
    }

    // Unique method for Cat class
    public void scratch() {
        System.out.println(getName() + " is scratching the furniture.");
    }
}

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        // Creating objects of Dog and Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Using methods from the abstract class
        dog.sound();     // Buddy says: Woof!
        dog.sleep();     // Buddy is sleeping.
        dog.fetch();     // Buddy is fetching the ball.

        cat.sound();     // Whiskers says: Meow!
        cat.sleep();     // Whiskers is sleeping.
        cat.scratch();   // Whiskers is scratching the furniture.
    }
}
