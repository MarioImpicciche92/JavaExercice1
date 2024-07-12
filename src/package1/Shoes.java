package package1;

public class Shoes extends Products {

    public Shoes(String type,String name, String state, String brand, int price,int size){
        super(type,name,state,brand,price);
    }
    @Override
    public void description() {
        System.out.println("this Shoes have");
        super.description();
    }
}
