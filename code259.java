class code259 {
    public double findMaxAverage(int[] nums, int k) {
        int maxi= Integer.MIN_VALUE;
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i = 0 ;i <=high;i++){
            sum=sum+nums[i];
        }
        maxi=Math.max(maxi,sum);
        for(high=high+1; high<nums.length; high++){
            sum=sum-nums[low];
            low++;
            sum=sum+nums[high];
            maxi=Math.max(maxi,sum);
        }
        return (double)maxi/k;
        
    }
}