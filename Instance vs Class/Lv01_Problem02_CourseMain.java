class Course {
    private String courseName;
    private int duration; // in months
    private double fee;
    private static String instituteName = "ABC Institute"; // Class variable

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " months, Fee: $" + fee + ", Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }
}

class Lv01_Problem02_CourseMain {
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 6, 500.00);
        Course course2 = new Course("Web Development", 4, 400.00);

        course1.displayCourseDetails();
        course2.displayCourseDetails();

        Course.updateInstituteName("XYZ Academy"); // Update institute name for all courses
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
