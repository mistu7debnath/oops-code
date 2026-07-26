//Explain the abstraction in Java with a easy suitable example.
abstract class Vehicle {
    abstract void start();
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with key");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}

/*The output of the code is:
Bike starts with key
 */
