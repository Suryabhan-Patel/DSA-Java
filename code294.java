import java.util.*;
public class code294  {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=1;
        int sum=0;
        int ans=0;
        for(high=1 ; high<nums.length ; high=high+2){
           sum  = Math.min(nums[low],nums[high]);
           ans = ans+sum;
           low=high+1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{1,4,3,2}));
    }
}
    

