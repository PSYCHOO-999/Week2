import java.util.ArrayList;

// Faculty Class
class Faculty {
    private String name;

    // Constructor
    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Faculty{Name='" + name + "'}";
    }
}

// Department Class
class Department {
    private String deptName;
    private ArrayList<Faculty> faculties;

    // Constructor
    public Department(String deptName) {
        this.deptName = deptName;
        this.faculties = new ArrayList<>();
    }

    // Add Faculty to Department
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println(faculty.getName() + " has been added to the " + deptName + " department.");
    }

    // Display Faculties in Department
    public void displayFaculties() {
        System.out.println("Department: " + deptName);
        if (faculties.isEmpty()) {
            System.out.println("No faculties in this department.");
        } else {
            for (Faculty faculty : faculties) {
                System.out.println(faculty);
            }
        }
    }

    public String getDeptName() {
        return deptName;
    }
}

// University Class
class University {
    private String uniName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    // Constructor
    public University(String uniName) {
        this.uniName = uniName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add Department to University
    public void addDepartment(Department department) {
        departments.add(department);
        System.out.println(department.getDeptName() + " department has been added to " + uniName + ".");
    }

    // Add Faculty to University
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
        System.out.println(faculty.getName() + " has joined " + uniName + " as a faculty member.");
    }

    // Display Details
    public void displayDetails() {
        System.out.println("University: " + uniName);

        System.out.println("\nDepartments:");
        if (departments.isEmpty()) {
            System.out.println("No departments in the university.");
        } else {
            for (Department department : departments) {
                department.displayFaculties();
            }
        }

        System.out.println("\nFaculties:");
        if (faculties.isEmpty()) {
            System.out.println("No faculty members in the university.");
        } else {
            for (Faculty faculty : faculties) {
                System.out.println(faculty);
            }
        }
    }
}

// Main Class
public class problem2_UniversityFacultiesAndDepartments {
    public static void main(String[] args) {
        // Create University
        University university = new University("Techno University");

        // Create Faculties
        Faculty profJohn = new Faculty("Prof. John");
        Faculty profSmith = new Faculty("Prof. Smith");
        Faculty profAlice = new Faculty("Prof. Alice");

        // Add Faculties to University
        university.addFaculty(profJohn);
        university.addFaculty(profSmith);

        // Create Departments
        Department csDept = new Department("Computer Science");
        Department mathDept = new Department("Mathematics");

        // Add Departments to University
        university.addDepartment(csDept);
        university.addDepartment(mathDept);

        // Add Faculties to Departments
        csDept.addFaculty(profJohn);
        mathDept.addFaculty(profAlice);

        // Display University Details
        university.displayDetails();

        // Demonstrate deletion (composition)
        System.out.println("\nDeleting the university...");
        university = null; // Simulating deletion; in real-world scenarios, garbage collection handles object removal.
    }
}
