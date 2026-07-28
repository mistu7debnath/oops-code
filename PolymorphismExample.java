**//Explain polymorphism in Java with a help of a suitable example.**
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Shape s = new Circle();   // upcasting
        s.draw();
    }
}

**/*The output of the code is:
Bike starts with key
 */**
