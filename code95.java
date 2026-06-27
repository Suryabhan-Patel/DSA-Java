// three sum closest
public class code95 {
    public static int threesum(int[]arr, int target){
        int max_diff= Integer.MAX_VALUE;
        int result = 0;
        for(int i =0; i < arr.length-2;i++){
            int left=i+1;
            int right = arr.length-1;
           
            while(left<right){
                int sum = arr[i]+arr[left]+arr[right];
                     int diff = Math.abs(target-sum);
            if(target>sum){
                if(diff<max_diff){
                    max_diff=diff;
                    result = sum;
                
                }
                left++;
            }
            else if(target<sum){
                if(diff<max_diff){
                    max_diff=diff;
                    result = sum;
                }
                  right--;

            }
            else{
                result= sum;
                return result;
            }}
        }
        return result;
    }
    public static void main(String[] args) {
        int[] ar1= {1,2,3,4,6};
        int answ = threesum(ar1, 5);
        System.err.println(answ);
    }
    
}
