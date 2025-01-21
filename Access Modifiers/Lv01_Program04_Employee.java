class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManagerDetails() {
        System.out.println("Manager - Employee ID: " + employeeID + ", Department: " + department + ", Team: " + team);
    }
}

class Lv01_Program04_Employee {
    public static void main(String[] args) {
        Employee emp = new Employee(1001, "IT", 50000.00);
        emp.displayEmployeeDetails();

        Manager manager = new Manager(1002, "Finance", 70000.00, "Accounts Team");
        manager.displayManagerDetails();
    }
}
