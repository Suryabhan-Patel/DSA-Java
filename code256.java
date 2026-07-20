class code256 {
    public int searchInsert(int[] nums, int target) {
        if(target<nums[0]) return 0;
        int low =0;
        int high= nums.length-1;
        int mid =-1;
        while(low<=high){
             mid = low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high =mid-1;
            else{
                low=mid+1;
            }
        }
        if(nums[mid]>target) return mid;
        return mid+1;
    }
}