import java.util.Arrays;
public class code91 {

   public static int[] twosum(int arr[],int target){
        Arrays.sort(arr);
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target)
                j--;
            else if(arr[i]+arr[j]<target)
                i++;
            else
                return new int[]{arr[i],arr[j]};
        }
    return new int[]{-1, -1};}
public static void main(String[] args){
    int[]arr={2,3,6,1,4};
   System.out.println(Arrays.toString(twosum(arr,4)));
    
}
    
}
