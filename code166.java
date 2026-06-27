import java.util.Arrays;

public class code166 {
    public static int[] tripletssum(int[]arr, int target){
        Arrays.sort(arr);
        for(int i=0;i< arr.length;i++){
            int T = target-arr[i];
            int low= i+1;
            int high=arr.length-1;
            while(high>low){
                int sum= arr[high]+arr[low];
                if(sum>T){
                    high--;
                }
                else if(sum<T){
                    low++;

                }
                else{
                    return new int[]{arr[low],arr[high],arr[i]};
                }
            }
        }return new int[]{0};}
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1};
        int []arr1= tripletssum(arr, 8);
        for(int i = 0; i <arr1.length;i++){
            System.out.println(arr1[i]);

        }
    }
    
}
