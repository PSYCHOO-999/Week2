import java.util.ArrayList;

// Employee Class
class Employee {
    private String name;
    private String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{Name='" + name + "', Position='" + position + "'}";
    }
}

// Department Class
class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add Employee to Department
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee + " added to " + departmentName + " department.");
    }

    // Display Department Details
    public void displayDepartmentDetails() {
        System.out.println("Department: " + departmentName);
        if (employees.isEmpty()) {
            System.out.println("No employees in this department.");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
}

// Company Class
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add Department to Company
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println(department + " added to company " + companyName + ".");
    }

    // Display Company Details
    public void displayCompanyDetails() {
        System.out.println("Company: " + companyName);
        if (departments.isEmpty()) {
            System.out.println("No departments in this company.");
        } else {
            for (Department department : departments) {
                department.displayDepartmentDetails();
            }
        }
    }

    // Cleanup Resources (Simulates Deletion)
    public void deleteCompany() {
        System.out.println("Deleting company " + companyName + "...");
        departments.clear(); // All departments and employees are removed
        System.out.println("All departments and employees have been deleted.");
    }
}

// Main Class
public class problem3_CompanyAndDepartments {
    public static void main(String[] args) {
        // Create Company
        Company company = new Company("TechCorp");

        // Create Departments
        Department hr = new Department("HR");
        Department it = new Department("IT");

        // Add Employees to Departments
        hr.addEmployee(new Employee("Alice", "HR Manager"));
        hr.addEmployee(new Employee("Bob", "Recruiter"));

        it.addEmployee(new Employee("Charlie", "Software Engineer"));
        it.addEmployee(new Employee("David", "System Analyst"));

        // Add Departments to Company
        company.addDepartment(hr);
        company.addDepartment(it);

        // Display Company Details
        company.displayCompanyDetails();

        // Delete Company (and associated Departments and Employees)
        company.deleteCompany();
    }
}
