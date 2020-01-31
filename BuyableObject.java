public abstract class BuyableObject {

  // Information
  protected double price;
  
  // Behavior
  // Messages

  public double pricePlease() {
    return price;
  }

  public String toString() {
    return getClass().getName() + " price: " + price;
  }
  
  public static void main(String[] args) {

  }
  
}
