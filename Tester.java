public class Tester {
  public static void main(String[] args) {
    Vehicle v = new Vehicle("Toyota", 2020, 4, 5);
    v.displayInfo();
    System.out.println();
    Truck t = new Truck("Nissan", 2021, 4, 12, 10000, "large", 4, 50000.0);
    t.displayInfo();
  }
}