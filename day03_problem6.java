public class day03_problem6 {

    static class Vehicle {
        private static double registrationFee = 5000.0; // Shared registration fee for all vehicles
        private static int totalVehicles = 0; // Count of total registered vehicles

        private final String registrationNumber; // Unique and immutable registration number
        private String ownerName;
        private String vehicleType;

        // Constructor
        public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
            this.registrationNumber = registrationNumber;
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
            totalVehicles++;
        }

        // Static method to update the registration fee
        public static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
            System.out.println("Registration fee updated to: " + registrationFee);
        }

        // Static method to display the registration fee
        public static void displayRegistrationFee() {
            System.out.println("Current Registration Fee: " + registrationFee);
        }

        // Method to display vehicle details
        public void displayVehicleDetails() {
            if (this instanceof Vehicle) { // Check if the object is an instance of Vehicle
                System.out.println("Registration Number: " + registrationNumber);
                System.out.println("Owner Name: " + ownerName);
                System.out.println("Vehicle Type: " + vehicleType);
            } else {
                System.out.println("Invalid vehicle object.");
            }
        }

        // Static method to display total number of registered vehicles
        public static void displayTotalVehicles() {
            System.out.println("Total Registered Vehicles: " + totalVehicles);
        }
    }

    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("John Doe", "Car", "ABC123");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle", "XYZ789");

        // Displaying current registration fee
        System.out.println("--- Registration Fee Details ---");
        Vehicle.displayRegistrationFee();

        // Displaying details of each vehicle
        System.out.println("\n--- Vehicle Details ---");
        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Updating the registration fee
        System.out.println("\n--- Updating Registration Fee ---");
        Vehicle.updateRegistrationFee(6000.0);

        // Displaying updated registration fee
        System.out.println("\n--- Updated Registration Fee ---");
        Vehicle.displayRegistrationFee();

        // Displaying total registered vehicles
        System.out.println("\n--- Total Registered Vehicles ---");
        Vehicle.displayTotalVehicles();
    }
}
