// conditional statements 
import java.util.Scanner;
public class code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter number 1 ");
        a= sc.nextInt();
        System.out.println("enter number 2 ");
        b = sc.nextInt();
        if(a==b){
            System.out.println(" a is equals to b");
        }
        else{
            if(a>b)
                System.out.println(" a is greater than b");
            else
                System.out.println(" a is lesser than b");
            
            
        }
    }
    
}
