//7️⃣ Minimum Size Subarray Sum
public class code150 {
  public static int minsub(int[] arr,int target){
    int low=0;
    int high=0;
    int sum=0;
    int res = Integer.MAX_VALUE;
    while(high<arr.length){
        sum=sum+arr[high];
        while ((sum>=target)) {
            res=Math.min(res,high-low+1);
            sum=sum-arr[low];
            low++; }
            high++;
    }

  return res;}
    
}
