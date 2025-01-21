public class day03_problem3 {

    static class Employee {
        private static String companyName = "Tech Solutions Ltd."; // Shared across all employees
        private static int totalEmployees = 0; // Tracks the total number of employees

        private final int id; // Final variable for unique employee ID
        private String name;
        private String designation;

        // Constructor
        public Employee(String name, int id, String designation) {
            this.name = name;
            this.id = id; // Using 'this' to initialize unique identifier
            this.designation = designation;
            totalEmployees++; // Increment total employees count
        }

        // Static method to display company name
        public static void displayCompanyName() {
            System.out.println("Company Name: " + companyName);
        }

        // Static method to display total number of employees
        public static void displayTotalEmployees() {
            System.out.println("Total Employees: " + totalEmployees);
        }

        // Static method to update company name
        public static void updateCompanyName(String newCompanyName) {
            companyName = newCompanyName;
        }

        // Method to display employee details
        public void displayEmployeeDetails() {
            if (this instanceof Employee) { // Using 'instanceof' to verify type
                System.out.println("Employee ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Designation: " + designation);
            } else {
                System.out.println("Invalid employee object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("Alice", 101, "Software Engineer");
        Employee emp2 = new Employee("Bob", 102, "Project Manager");

        System.out.println("--- Company Details ---");
        Employee.displayCompanyName();

        System.out.println("\n--- Employee Details ---");
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        System.out.println("\n--- Total Employees ---");
        Employee.displayTotalEmployees();

        // Updating company name
        String newCompanyName = "Innovative Tech Corp.";
        Employee.updateCompanyName(newCompanyName);

        System.out.println("\n--- Updated Company Details ---");
        Employee.displayCompanyName();
    }
}
