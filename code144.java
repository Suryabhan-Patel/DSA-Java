public class code144 {
    public static int sumsub(int []arr,int k){
        int sum=0;
        int count=0;
        for(int i = 0; i < arr.length;i++){
            for(int j = i;j<arr.length;j++){
                sum=sum+arr[j];
            }
            if(sum==k){
                count++;
            }
            sum=0;
        }
    return count;}
    
}
