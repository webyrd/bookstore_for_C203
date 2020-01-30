public abstract class BuyableObject {

  // Information
  // TODO make price non-public
  public double price;
  
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
