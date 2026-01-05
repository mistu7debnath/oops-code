**//Explain Encapsulation in Java with a suitable example.**
class Student {
    // private data members
    private String name;
    private int age;

    // setter methods
    public void setName(String n) {
        name = n;
    }

    public void setAge(int a) {
        age = a;
    }

    // getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Misali");
        s.setAge(25);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}


**/* THe output of the code is:
Name: Misali
Age: 25
 */**
