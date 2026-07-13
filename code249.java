import java.util.*;
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high =0;
        int sum =0;
        int res= Integer.MAX_VALUE;
        while(high<nums.length){
            sum = sum +nums[high];
            while(sum>=target){
                int length = high-low+1;
                res = Math.min(length,res);
                sum=sum-nums[low];
                low++;
            }
            high++;
        }
       return res == Integer.MAX_VALUE ? 0 : res;

        
    }
}