class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Unknown Model";
        this.rentalDays = 1;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void calculateTotalCost(double ratePerDay) {
        double totalCost = rentalDays * ratePerDay;
        System.out.println("Customer Name: " + customerName + ", Car Model: " + carModel + ", Total Cost: $" + totalCost);
    }
}

public class Lv01_Problem05_CarRentalMain{
    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        defaultRental.calculateTotalCost(50.0);

        CarRental customRental = new CarRental("Bob", "Tesla Model 3", 5);
        customRental.calculateTotalCost(100.0);
    }
}
