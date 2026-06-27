// recrussion 1. print name 5 times
import java.util.Scanner;
public class code37 {
    public static void print(int i, int n){
        if(i>n)
        return;
    System.out.println(" surya");
    print(i+1,n);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" enter the value of times");
    int n = sc.nextInt();
    print(1, n);
}}
