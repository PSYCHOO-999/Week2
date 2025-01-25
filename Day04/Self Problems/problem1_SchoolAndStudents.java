import java.util.ArrayList;

// Course Class
class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    // Add Student to Course
    public void addStudent(Student student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " has enrolled in " + courseName + ".");
    }

    // Display Enrolled Students
    public void displayEnrolledStudents() {
        System.out.println("Course: " + courseName);
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students enrolled in this course.");
        } else {
            for (Student student : enrolledStudents) {
                System.out.println(student.getName());
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a Course
    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        course.addStudent(this);
    }

    // Display Enrolled Courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course course : enrolledCourses) {
                System.out.println(course.getCourseName());
            }
        }
    }

    public String getName() {
        return name;
    }
}

// School Class
class School {
    private String schoolName;
    private ArrayList<Student> students;

    // Constructor
    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    // Add Student to School
    public void addStudent(Student student) {
        students.add(student);
        System.out.println(student.getName() + " has been added to " + schoolName + ".");
    }

    // Display Students in School
    public void displayStudents() {
        System.out.println("School: " + schoolName);
        if (students.isEmpty()) {
            System.out.println("No students in this school.");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }
}

// Main Class
public class problem1_SchoolAndStudents {
    public static void main(String[] args) {
        // Create School
        School school = new School("Greenfield Academy");

        // Create Students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Add Students to School
        school.addStudent(alice);
        school.addStudent(bob);

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll Students in Courses
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);

        bob.enrollInCourse(math);

        // Display Details
        school.displayStudents();
        math.displayEnrolledStudents();
        science.displayEnrolledStudents();
        alice.displayEnrolledCourses();
        bob.displayEnrolledCourses();
    }
}
