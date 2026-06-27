import java.util.*;
public class code103{
    public static int subarray(int[] arr,int k){
        int max_sum= Integer.MIN_VALUE;
        int sum =0;
        int left =0;
        int right = k-1;
        for(int i = 0 ; i  <=right;i++){
            sum= sum+arr[i];
        }
        while(right<arr.length){
               max_sum= Math.max(sum,max_sum);
               left++;
               right++;
                if(right==arr.length)
                break;
               sum= sum-arr[left-1]+arr[right];
          
         
        }
        return max_sum;
    }
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,2};
    System.out.println(subarray(arr,3));
}    
}