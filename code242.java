import java.util.Scanner;

public class code242{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A<0 || B<0) System.out.println("Invalid Input");
        else if(A==B) System.out.println("prices equal");
        else{
        System.out.println(Math.max(A, B)+" is more expensive");}
        sc.close();
    }
}