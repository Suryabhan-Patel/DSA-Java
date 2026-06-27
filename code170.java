public class code170 {
    public static double avgmaxsub(int[] arr, int k){
        int low=0;
        int high= k-1;
        int sum=0;
        for(int i = 0; i <=high;i++){
            sum=sum+arr[i];
        }
         double res= (double)sum;
        for(high=k; high< arr.length;high++){
            res= Math.max(sum, res);
            sum=sum-arr[low];
            low++;
            sum=sum+arr[high];
        }
        return res/k;
    }
     public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        System.out.println(avgmaxsub(arr, 3));
    }
    
}
