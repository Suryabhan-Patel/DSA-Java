import java.util.*;
class code261 {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i = 0 ; i <nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i = 0 ;i<nums.length;i++){
            if(map.contains(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
        }
        
    return new int[]{-1,-1};}}
