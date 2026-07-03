import java.util.Scanner;

public class code230{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s= sc.nextLine();
        int []arr= new int[26];

        char c = sc.next().charAt(0);

        for(int i=0; i < s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        System.out.println(arr[c-'a']);
        sc.close();
    }
}