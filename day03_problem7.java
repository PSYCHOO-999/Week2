public class day03_problem7 {

    static class Patient {
        private static String hospitalName = "City General Hospital"; // Shared hospital name
        private static int totalPatients = 0; // Count of total admitted patients

        private final String patientID; // Unique and immutable patient ID
        private String name;
        private int age;
        private String ailment;

        // Constructor
        public Patient(String name, int age, String ailment, String patientID) {
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            this.patientID = patientID;
            totalPatients++;
        }

        // Static method to display the total number of patients
        public static void getTotalPatients() {
            System.out.println("Total Patients Admitted: " + totalPatients);
        }

        // Static method to display the hospital name
        public static void displayHospitalName() {
            System.out.println("Hospital Name: " + hospitalName);
        }

        // Method to display patient details
        public void displayPatientDetails() {
            if (this instanceof Patient) { // Check if the object is an instance of Patient
                System.out.println("Patient ID: " + patientID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
            } else {
                System.out.println("Invalid patient object.");
            }
        }
    }

    public static void main(String[] args) {
        // Displaying hospital name
        System.out.println("--- Hospital Details ---");
        Patient.displayHospitalName();

        // Creating Patient objects
        Patient patient1 = new Patient("Alice Green", 30, "Flu", "P001");
        Patient patient2 = new Patient("Bob White", 45, "Fracture", "P002");

        // Displaying patient details
        System.out.println("\n--- Patient Details ---");
        patient1.displayPatientDetails();
        patient2.displayPatientDetails();

        // Displaying total patients admitted
        System.out.println("\n--- Total Patients ---");
        Patient.getTotalPatients();
    }
}
