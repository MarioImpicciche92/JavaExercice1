package package1;
    
import java.util.Scanner;

public class Functions {



    public static void main(String[] args) {
                System.out.println("Enter username");

        Scanner inputText=new Scanner(System.in);       

       String userName=inputText.nextLine();
       System.out.println("Username is " + userName);
        if(userName.equals("Mario")){
            System.out.println("Success login");
            inputText.close();
        }
        else
        {
            System.out.println("Please insert correct Username");
            inputText.close();
        }
       
        if(userName.contains("Pa")){
            System.out.println("Element inside");
        }
        else{
            System.out.println("Error Element not inside");
        }
        if(userName.isEmpty()){
            System.out.println("This string is empty");
        }
        else{
            System.out.println("Success");
        }
       inputText.close();  //close text 
    
  
    }
    
}
