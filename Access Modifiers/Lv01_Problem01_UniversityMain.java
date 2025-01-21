class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    // Constructor
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displaySpecialization() {
        System.out.println("Postgraduate Student: " + name + ", Specialization: " + specialization);
    }
}

class Lv01_Problem01_UniversityMain {
    public static void main(String[] args) {
        Student student = new Student(101, "Alice", 9.5);
        student.displayDetails();

        PostgraduateStudent pgStudent = new PostgraduateStudent(102, "Bob", 8.9, "Machine Learning");
        pgStudent.displayDetails();
        pgStudent.displaySpecialization();
    }
}
