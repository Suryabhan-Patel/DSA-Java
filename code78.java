// find missing number in array
public class code78 {
    public static int missnu(int[]arr){
          int n = arr.length+1;
          int total_sum= n*(n+1)/2;
          int array_sum =0;
          for(int i = 0 ; i < n-1 ; i++){
            array_sum+=arr[i];
          }
          return total_sum-array_sum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6};

        System.out.println(missnu(arr));
    }
    
}
