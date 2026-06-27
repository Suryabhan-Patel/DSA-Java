// function to add 2 numbers
import java.util.Scanner;
public class code21 {
    public static int sum(int a, int b ){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println(" print first number");
        a= sc.nextInt();
        System.out.println(" print second number");
        b= sc.nextInt();
        int s = sum(a,b);
        System.err.println(" sum of two numbers is "+s);

     }
    
}
