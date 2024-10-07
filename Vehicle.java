public class Vehicle {
    private String manufacturer;
    private int year;
    private int numDoors;
    private int numPassengers;

    public Vehicle() {}


    public Vehicle(String manufacturer, int year, int numDoors, int numPassengers) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.numDoors = numDoors;
        this.numPassengers = numPassengers;
    }

    public String getManufacturer() { return manufacturer; }
    public void setManufacturer(String manufacturer) { this.manufacturer = manufacturer; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getNumDoors() { return numDoors; }
    public void setNumDoors(int numDoors) { this.numDoors = numDoors; }

    public int getNumPassengers() { return numPassengers; }
    public void setNumPassengers(int numPassengers) { this.numPassengers = numPassengers; }


    public void displayInfo() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Number xof Passengers: " + numPassengers);
    }
}

