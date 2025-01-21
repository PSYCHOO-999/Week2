public class day03_problem5 {

    static class Student {
        private static String universityName = "Global University"; // Shared across all students
        private static int totalStudents = 0; // Count of total enrolled students

        private final int rollNumber; // Unique and immutable roll number for each student
        private String name;
        private String grade;

        // Constructor
        public Student(String name, int rollNumber, String grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.grade = grade;
            totalStudents++;
        }

        // Static method to display total number of students
        public static void displayTotalStudents() {
            System.out.println("Total Students Enrolled: " + totalStudents);
        }

        // Static method to display university name
        public static void displayUniversityName() {
            System.out.println("University Name: " + universityName);
        }

        // Method to display student details
        public void displayStudentDetails() {
            if (this instanceof Student) { // Check if the object is an instance of the Student class
                System.out.println("Roll Number: " + rollNumber);
                System.out.println("Name: " + name);
                System.out.println("Grade: " + grade);
            } else {
                System.out.println("Invalid student object.");
            }
        }

        // Method to update student grade
        public void updateGrade(String newGrade) {
            if (this instanceof Student) { // Check if the object is an instance of the Student class
                this.grade = newGrade;
                System.out.println("Grade updated successfully for Roll Number: " + rollNumber);
            } else {
                System.out.println("Invalid student object.");
            }
        }
    }

    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student("Alice", 101, "A");
        Student student2 = new Student("Bob", 102, "B");

        // Displaying university name
        System.out.println("--- University Details ---");
        Student.displayUniversityName();

        // Displaying total students enrolled
        System.out.println("\n--- Total Students ---");
        Student.displayTotalStudents();

        // Displaying details of each student
        System.out.println("\n--- Student Details ---");
        student1.displayStudentDetails();
        student2.displayStudentDetails();

        // Updating grade for a student
        System.out.println("\n--- Updating Grades ---");
        student1.updateGrade("A+");

        // Displaying updated student details
        System.out.println("\n--- Updated Student Details ---");
        student1.displayStudentDetails();

        // Displaying total students again to ensure the count is correct
        System.out.println("\n--- Total Students Recheck ---");
        Student.displayTotalStudents();
    }
}
