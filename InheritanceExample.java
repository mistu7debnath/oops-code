//Explain Inheritance in Java with a suitable example.

// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class (inherits Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Dog d = new Dog();

        // Calling inherited method
        d.eat();

        // Calling child class method
        d.bark();
    }
}


/* Now the output is:

Dog is barking
 */
