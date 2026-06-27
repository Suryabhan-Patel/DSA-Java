public class code171 {
    public static int maxsumsubarray(int []arr , int k ){
        int low=0;
        int high= 0;
        int sum=0;
        int res = Integer.MIN_VALUE;
        for(high=0; high< arr.length;high++){
            sum= sum+arr[high];
            while (sum>k) {
                sum=sum-arr[low];
                low++;
                
            }
            res= Math.max(res,high-low+1);
        }
    return res;}
    
}
