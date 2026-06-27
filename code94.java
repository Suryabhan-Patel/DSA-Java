// two sum with duplicate
import java.util.*;
public class code94 {
    public static int[] twosum(int[]arr, int target){
        List<Integer>list=new ArrayList<>();
        int i =0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]<target){
                i++;
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                list.add(arr[i]);
                list.add(arr[j]);
                i++;
                j--;
                while(i<arr.length && arr[i]==arr[i-1]){
                    i++;
                }
                while ((j>=0&& arr[j]==arr[j+1])) {
                    j--;
                    
                }
            }
        }
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,2,2,3,3};
        int []arr1= twosum(arr, 4);
        for(int i =0; i < arr1.length;i++){
            System.err.println(arr1[i]);
        }
    }
    
}
