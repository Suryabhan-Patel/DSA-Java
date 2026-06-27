public class code169 {
    public static int maxarray(int[] arr, int k ){
        int low=0;
        int high=k-1;
        int sum=0;
       
        for(int i = 0 ; i <=high;i++){
            sum=sum+arr[i];
        }
         int res = sum;
        for(high=k;high<arr.length;high++){
            res= Math.max(res,sum);
            low++;

            sum=sum-arr[low-1];
            
            sum= sum+arr[high];
               
            
            
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,1,3,2};
        System.out.println(maxarray(arr, 3));
    }
    
}
