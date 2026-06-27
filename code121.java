public class code121 {
    public static int maxsumarr(int []arr,int k){
        int low=0;
        int high = k-1;
        int maxsum= Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<=high;i++){
            sum+=arr[i];
        }
        while(high<arr.length){
            maxsum=Math.max(maxsum, sum);
            sum=sum-arr[low];
            low++;
            high++;
            if(high<arr.length){
                sum=sum+arr[high];
            }
        }
    return maxsum;}
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(maxsumarr(arr, 3));
    }
}
