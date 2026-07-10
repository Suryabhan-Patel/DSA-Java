public import java.util.Scanner;

public class code232{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int first=a;
        int second=b;


        while(b!=0){
            int temp =b;
            b = a%b;
            a=temp;
        }
        System.out.println("GCD OF THE PAIRS IS "+a);
        System.out.println("LCM OF PAIR IS "+(first*second)/a);
    }
} {
    
}
