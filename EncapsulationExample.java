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
        s.setName("Mistu");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
