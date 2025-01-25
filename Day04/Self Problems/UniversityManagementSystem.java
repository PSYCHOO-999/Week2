import java.util.ArrayList;

// Course Class
class Course {
    private String name;
    private String code;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String name, String code) {
        this.name = name;
        this.code = code;
        this.enrolledStudents = new ArrayList<>();
    }

    // Assign Professor to Course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course " + name + ".");
    }

    // Enroll Student in Course
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println("Student " + student.getName() + " enrolled in course " + name + ".");
    }

    // Getter for course name
    public String getName() {
        return name;
    }

    // Display Course Details
    public void displayCourseDetails() {
        System.out.println("Course: " + name + " (" + code + ")");
        System.out.println("Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("Enrolled Students:");
        if (enrolledStudents.isEmpty()) {
            System.out.println(" - No students enrolled.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println(" - " + student.getName());
            }
        }
    }
}

// Student Class
class Student {
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in Course
    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this);
        } else {
            System.out.println(name + " is already enrolled in " + course.getName());
        }
    }

    // Getter for student name
    public String getName() {
        return name;
    }

    // View Enrolled Courses
    public void viewEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        if (enrolledCourses.isEmpty()) {
            System.out.println(" - No courses enrolled.");
        } else {
            for (Course course : enrolledCourses) {
                System.out.println(" - " + course.getName());
            }
        }
    }
}

// Professor Class
class Professor {
    private String name;
    private int id;
    private ArrayList<Course> assignedCourses;

    // Constructor
    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignedCourses = new ArrayList<>();
    }

    // Assign to Course
    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            course.assignProfessor(this);
        } else {
            System.out.println(name + " is already assigned to " + course.getName());
        }
    }

    // Getter for professor name
    public String getName() {
        return name;
    }

    // View Assigned Courses
    public void viewAssignedCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        if (assignedCourses.isEmpty()) {
            System.out.println(" - No courses assigned.");
        } else {
            for (Course course : assignedCourses) {
                System.out.println(" - " + course.getName());
            }
        }
    }
}

// University Class
class University {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Course> courses;

    // Constructor
    public University(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getName() + " added to " + name + ".");
    }

    // Add Professor
    public void addProfessor(Professor professor) {
        professors.add(professor);
        System.out.println("Professor " + professor.getName() + " added to " + name + ".");
    }

    // Add Course
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course " + course.getName() + " added to " + name + ".");
    }

    // Display University Details
    public void displayUniversityDetails() {
        System.out.println("University: " + name);
        System.out.println("Students:");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
        System.out.println("Professors:");
        for (Professor professor : professors) {
            System.out.println(" - " + professor.getName());
        }
        System.out.println("Courses:");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());
        }
    }
}

// Main Class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create University
        University university = new University("Tech University");

        // Create Students
        Student alice = new Student("Alice", 101);
        Student bob = new Student("Bob", 102);

        // Create Professors
        Professor drSmith = new Professor("Dr. Smith", 201);
        Professor drJohnson = new Professor("Dr. Johnson", 202);

        // Create Courses
        Course javaCourse = new Course("Java Programming", "CS101");
        Course dbmsCourse = new Course("Database Management Systems", "CS102");

        // Add to University
        university.addStudent(alice);
        university.addStudent(bob);
        university.addProfessor(drSmith);
        university.addProfessor(drJohnson);
        university.addCourse(javaCourse);
        university.addCourse(dbmsCourse);

        // Assign Professors
        drSmith.assignCourse(javaCourse);
        drJohnson.assignCourse(dbmsCourse);

        // Enroll Students
        alice.enrollCourse(javaCourse);
        bob.enrollCourse(dbmsCourse);
        alice.enrollCourse(dbmsCourse);

        // Display Details
        university.displayUniversityDetails();
        javaCourse.displayCourseDetails();
        dbmsCourse.displayCourseDetails();
        alice.viewEnrolledCourses();
        drSmith.viewAssignedCourses();
    }
}
