public class code275 {
    public static int kadnes(int[]arr){
        int low=0;
        int high=0;
        int templow=0;
        int be=arr[0];
        int ans=arr[0];
        for(int i=1; i < arr.length;i++){
            if(be+arr[i]>arr[i]){
                be=be+arr[i];
            }
            else{
                templow=i;
                be=arr[i];
            }

            if(be>ans){
                ans=be;
                high=i;
                low=templow;
            }
        }
        int neg=0;
        for(int i=low; i<=high;i++){
              if(arr[i]<0) neg++;
        }
        return neg;
    }
    public static void main(String[] args) {
        System.out.println(kadnes(new int[]{2 ,-1 ,3 ,4 ,-2 ,5 ,-6}));
    }
    
}
