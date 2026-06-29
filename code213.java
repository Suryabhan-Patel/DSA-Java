public class code213 {
    public static int hour(int k, int[] arr){
        int hour=0;
        for(int i=0; i < arr.length;i++){
        hour=hour+(arr[i]/k);
         if(arr[i]%k!=0) hour++;}
         return hour;
    }
    public static int koko(int[] arr, int H){
        int low=1;
        int high=0;
        int ans=-1;
        for(int num:arr) high=Math.max(num, high);
        while(low<=high){
            int mid=low+(high-low)/2;
            int hours_taken=hour(mid, arr);
            if(hours_taken>H) low=mid+1;
            else{
                ans=mid;
                high=mid-1;
            }
        }
    return ans;}
    public static void main(String[] args) {
        System.err.println(koko(new int[]{3,6,7,11}, 8));
    }
    
}
