class Person {
    private String name;
    private int age;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Lv01_Problem03_PersonMain{
    public static void main(String[] args) {
        Person defaultPerson = new Person();
        defaultPerson.displayDetails();

        Person customPerson = new Person("John Doe", 30);
        customPerson.displayDetails();

        Person copyPerson = new Person(customPerson);
        copyPerson.displayDetails();
    }
}
