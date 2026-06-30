import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class code226 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String [] arr= new String[n];
        StringBuilder res = new StringBuilder();
        for(int i =0  ; i < n ;i++){
            arr[i]= sc.nextLine();
        }

        Arrays.sort(arr);
        for(int i =0; i < arr[0].length();i++){
            if(arr[0].charAt(i)!=arr[arr.length-1].charAt(i)) break;
            res.append(arr[0].charAt(i));
        }
        System.out.println(res);
    }
}
