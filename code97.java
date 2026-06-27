import java.util.*;
public class code97 {
    public static int threesum(int[] arr, int sum, int n ){
        Arrays.sort(arr);
        int count =0;
        for(int i = 0 ; i < n-2; i++){
            int left= i+1;
            int right= n-1;
            while(left<right){
                int total = arr[i]+arr[left]+arr[right];
                if(total>=sum){
                    right--;
                }
                else if(total<sum){
                    count= count+(right-left);
                    left++;
                }
               /*  else{
                    right--;
                }*/
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1={-2,0,1,3};
        System.out.println(threesum(arr1, 2, 4));
    }
    
}
