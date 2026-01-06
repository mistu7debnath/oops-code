//Explain abstraction in Java with a suitable example.
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
