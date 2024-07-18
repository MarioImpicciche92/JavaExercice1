package package1;

/**
 * Products
 */
public class Product {

   String type; 
   String name;
   String state;
   String brand;
   int price;

   public Product(String type,String name, String state, String brand, int price) {
    this.type=type;
    this.name = name;
    this.state = state;
    this.brand = brand;
    this.price = price;

   
    } 
    
    public void description(){
        System.out.println("For the sold I bought different thinghs as the " + type + " " + brand + " " + name
        + " and the new version of " + brand + " with the sold I payed " + price + "$");
        }
}
   

