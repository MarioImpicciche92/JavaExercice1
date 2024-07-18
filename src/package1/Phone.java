package package1;

public class Phone extends Product implements Calling{
    public Phone(String type,String name, String state, String brand, int price) {
        super(type, name, state, brand, price);
    }
    @Override
    public void call() {
            System.out.println("With my new phone I'm calling my brother");
        
    }

    @Override
    public void call(int manyCalls) {
    System.out.println("The message call are " + manyCalls );        
    }
}
