public class Main {

  public static void main(String[] args) {
    BuyableObject bo1 = new Book(0.1);
    BuyableObject bo2 = new Book(0.1);
    BuyableObject bo3 = new Book(0.1);    
    System.out.println(bo1.pricePlease()
                       +
                       bo2.pricePlease()
                       +
                       bo3.pricePlease()
                       );
  }

}
