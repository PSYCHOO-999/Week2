import java.util.ArrayList;

// Doctor Class
class Doctor {
    private String name;
    private String specialization;
    private ArrayList<Patient> patients;

    // Constructor
    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Consult a Patient
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // Establish two-way association
        }
        System.out.println(name + " (Specialization: " + specialization + ") is consulting " + patient.getName());
    }

    // Display Patients
    public void displayPatients() {
        System.out.println("Doctor: " + name + " (Specialization: " + specialization + ")");
        if (patients.isEmpty()) {
            System.out.println("No patients under consultation.");
        } else {
            System.out.println("Patients under consultation:");
            for (Patient patient : patients) {
                System.out.println(" - " + patient.getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}

// Patient Class
class Patient {
    private String name;
    private int age;
    private ArrayList<Doctor> doctors;

    // Constructor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor); // Ensure unique entries
        }
    }

    // Display Doctors Consulted
    public void displayDoctors() {
        System.out.println("Patient: " + name + " (Age: " + age + ")");
        if (doctors.isEmpty()) {
            System.out.println("No doctors consulted.");
        } else {
            System.out.println("Doctors consulted:");
            for (Doctor doctor : doctors) {
                System.out.println(" - " + doctor.getName());
            }
        }
    }

    public String getName() {
        return name;
    }
}

// Hospital Class
class Hospital {
    private String name;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    // Constructor
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
        System.out.println("Doctor " + doctor.getName() + " has joined " + name + ".");
    }

    // Add Patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient " + patient.getName() + " has been admitted to " + name + ".");
    }

    // Display Hospital Details
    public void displayDetails() {
        System.out.println("Hospital: " + name);

        System.out.println("\nDoctors:");
        if (doctors.isEmpty()) {
            System.out.println("No doctors in the hospital.");
        } else {
            for (Doctor doctor : doctors) {
                doctor.displayPatients();
            }
        }

        System.out.println("\nPatients:");
        if (patients.isEmpty()) {
            System.out.println("No patients in the hospital.");
        } else {
            for (Patient patient : patients) {
                patient.displayDoctors();
            }
        }
    }
}

// Main Class
public class problem3_HospitalDoctorsAndPatients {
    public static void main(String[] args) {
        // Create Hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create Doctors
        Doctor drSmith = new Doctor("Dr. Smith", "Cardiology");
        Doctor drJones = new Doctor("Dr. Jones", "Neurology");

        // Create Patients
        Patient johnDoe = new Patient("John Doe", 45);
        Patient janeDoe = new Patient("Jane Doe", 38);

        // Add Doctors and Patients to Hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(johnDoe);
        hospital.addPatient(janeDoe);

        // Consultations
        drSmith.consult(johnDoe);
        drJones.consult(johnDoe);
        drJones.consult(janeDoe);

        // Display Hospital Details
        hospital.displayDetails();
    }
}
