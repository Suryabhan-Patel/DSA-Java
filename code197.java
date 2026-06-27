import java.util.Scanner;

public class code197 {
    public static int[] reverse(int[] arr, int a,int b){
        int i = a;
        int j =b;
        while ((i<j)) {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
            
        }
        return arr;

    }
    public static int[] rotate(int[] arr,int k,int rotate){
        if(rotate==1){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr,0,arr.length-1);}
        else{
            reverse(arr,0,arr.length-1);
            reverse(arr, 0, k-1);
             reverse(arr, k, arr.length-1);
        }

    return arr;}
    public static void main(String[] args) {
        System.out.println(" for right rotation enter 0 ");
        System.out.println(" for left rotation enter 1 ");
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the rotation");
        int n = sc.nextInt();
         System.out.println(" enter the rotation");
        int []arr1=rotate(new int[]{1,2,3,4,5}, 2,n);
        for(int i = 0 ; i < arr1.length;i++){
           System.out.println(arr1[i]);
    }
    }
    
}
