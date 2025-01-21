class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Salary: " + this.salary);
    } 
}

public class Level1_Problem1{
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 101, 50000);
        emp1.displayDetails();
    }
}