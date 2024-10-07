public class Truck extends Vehicle {
    private int towingWeight;
    private String cargoArea;
    private int numWheels;
    private double originalPrice;

    public Truck(String manufacturer, int year, int numDoors, int numPassengers, int towingWeight, String cargoArea, int numWheels, double originalPrice) {
        super(manufacturer, year, numDoors, numPassengers);
        this.towingWeight = towingWeight;
        this.cargoArea = cargoArea;
        this.numWheels = numWheels;
        this.originalPrice = originalPrice;
    }

    public int getTowingWeight() { return towingWeight; }
    public void setTowingWeight(int towingWeight) { this.towingWeight = towingWeight; }

    public String getCargoArea() { return cargoArea; }
    public void setCargoArea(String cargoArea) { this.cargoArea = cargoArea; }

    public int getNumWheels() { return numWheels; }
    public void setNumWheels(int numWheels) { this.numWheels = numWheels; }

    public double getOriginalPrice() { return originalPrice; }
    public void setOriginalPrice(double originalPrice) { this.originalPrice = originalPrice; }

    public double calculateValue() {
        return originalPrice * 0.8;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("Towing Weight: " + towingWeight);
        System.out.println("Cargo Area: " + cargoArea);
        System.out.println("Number of Wheels: " + numWheels);
        System.out.println("Original Price: " + originalPrice);
    }
}

