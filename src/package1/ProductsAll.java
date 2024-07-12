package package1;

public class ProductsAll {
    
    public static void main(String[] args) {
        
      Shoes nike=new Shoes("shoes","Supersonic", "new", "Nike", 150, 42);
      Shoes puma=new Shoes("shoes","Olymp", "used", "Puma", 40, 40);
      Shoes adidas=new Shoes("shoes","Hight", "new", "Adidas", 60, 41);

      Glass rayban=new Glass("glass","Summer","new","Rayban" , 95);
      Glass gucci=new Glass("glass","Sweet", "new", "Gucci", 300);

      Glass[] Glasses=new Glass[2];
      Glasses[0]=rayban;
      Glasses[1]=gucci;

      for(Glass Glass:Glasses){
        Glass.description();
      }
    
      Shoes[] TheShoes=new Shoes[3];
      TheShoes[0]=nike;
      TheShoes[1]=puma;
      TheShoes[2]=adidas;

      for(Shoes Shoes:TheShoes){
        Shoes.description();
      }

      Phone sansung=new Phone("DualSim", "Galaxy", "new", "Sansung", 180);
      
      sansung.call();
    }
  
}
