// Superclass
public class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Honk honk!");
  }
}

// Subclass
class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    // Create a myCar Object
    Car myCar = new Car();

    // Call the honk() method on the myCar object
    myCar.honk();

    // Display the brand attribute from the vehicle class
    System.out.println("Brand: " + myCar.brand);
  }
}

// "$java car" to run the Car class once Vehicle.java is compiled