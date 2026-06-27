// switch statemennts 
import java.util.Scanner;
public class code03 {
    public static void main(String[] args) {
      int choice;
      Scanner sc = new Scanner(System.in);
       System.out.println("1 for name \n2 for age \n3 for occupation \n ");
       System.out.println(" enter your choice ");
       choice =sc.nextInt();
      switch (choice) {
        case 1:
            System.out.println("name is suryabhan patel");
            break;
        case 2:
           System.out.println(" my age is 21");
           break;
        case 3:
        System.out.println("my occupation is data scientist");       
      
        default:
        System.out.println(" invalid syntax is mention");
            break;
      }

    }

    
}
