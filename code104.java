// minimum subarray with sum >= target
import java.util.*;
public class code104 {
    public static int subarray(int[]arr, int target ){
        int min_diff = Integer.MAX_VALUE;
        int left = 0 ;
        int right = 0 ; 
        int result=0;
         int sum =0;
            for(int i =left;i<=right; i++ ){
                sum = sum+arr[i];}
        while(right<arr.length){
              if(right==arr.length){
                break;
              }
           
                if(sum<target){
                    right++;
                    sum = sum+arr[right];
                }
                else if(sum>target){
                    left++;
                    sum= sum-arr[left];
                    int dif= Math.abs(sum-target);
                    if(dif<min_diff){
                        result= (right-left)+1;}
                    min_diff=Math.min(min_diff, dif);
                
                }
                else{
                    return (right-left)+1;
                
            }
        }
    return result;}
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,2};
    System.out.println(subarray(arr,5));
}    
}