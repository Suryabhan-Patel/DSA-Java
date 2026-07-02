import java.util.Scanner;

public class code229 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first=5;
        int second=6;
        System.out.println(first);
        System.out.println(second);
        for(int i =3; i <=n;i++){
           int third=first+second;
           System.out.println(third);
           
           first=second;
           second=third;
        }
        sc.close();
     }
}