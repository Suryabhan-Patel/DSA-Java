// longest suarray with sum =k
public class code122 {
  public static int longestsub(int[]arr,int k){
    int high=0;
    int low=0;
    int maxlen=0;
    int sum=0;
    while(high<arr.length){
        sum= sum+arr[high];
    
        while(sum>k){
            sum=sum-arr[low];
            low++;
        }
        if (sum == k) {
                maxlen = Math.max(maxlen, high - low + 1);}
        high++;
    }
    return maxlen;
  }    
  public static void main(String[] args) {
    int []arr={1,1,1,1,4,5};
    System.out.println(longestsub(arr, 4));
  }
}
