package package1;

public class ProductsAll {
    
    public static void main(String[] args) {
        
      Shoes nike=new Shoes("shoes","Supersonic", "new", "Nike", 150, 42);
      Shoes puma=new Shoes("shoes","Olymp", "used", "Puma", 40, 40);
      Shoes adidas=new Shoes("shoes","Hight", "new", "Adidas", 60, 41);

      Glass rayban=new Glass("glass","Summer","new","Rayban" , 95);
      Glass gucci=new Glass("glass","Sweet", "new", "Gucci", 300);
      Phone sansung=new Phone("DualSim", "Galaxy", "new", "Sansung", 180);

      Glass[] glasses=new Glass[2];
      glasses[0]=rayban;
      glasses[1]=gucci;

      printProductDescription(glasses);
    
      Shoes[] theShoes=new Shoes[3];
      theShoes[0]=nike;
      theShoes[1]=puma;
      theShoes[2]=adidas;

      printProductDescription(theShoes);
      
      sansung.call();
      sansung.call(10);
    }

    private static void printProductDescription(Product[] products) {
      for(Product product:products){
        product.description();
      }
    }
  
}
