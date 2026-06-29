import java.util.Scanner;

public class code216 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr= s.split(" ");
        int [] arr1= new int[arr.length];
        for(int i =0; i < arr.length;i++){
            arr1[i]= Integer.parseInt(arr[i]);
        }
        for(int i =0 ; i < arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

    }
    
}
