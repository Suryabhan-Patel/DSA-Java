// find two elements whose difernece is minimum;
import java.util.*;
public class code96 {
public static int[] min(int[] arr){
    Arrays.sort(arr);
    int a= 0;
    int b =0;
    int Min_diff= Integer.MAX_VALUE;
    for(int i = 0 ; i  <arr.length-1;i++){
         for(int j =i+1; j < arr.length;j++){
            int diff= arr[i]-arr[j];
            if(Math.abs(diff)<Min_diff){
                Min_diff= Math.abs(diff);
                a =i;
                b = j;
            }
         }
    }
    return new int[]{arr[a],arr[b]};

}
public static void main(String[] args) {
    int [] arr1= {10,23,11,34,54};
    int[] arr2 = min(arr1);
    for(int i = 0; i < arr2.length; i++){
        System.out.println(arr2[i]);
    }
}
    
}
