public class code152 {
    public static int pivot(int []arr){
        int left=0;
        int sum =0;
        int right=0;
        for(int i =0; i<arr.length;i++){
            sum+=arr[i];
        }
        for(int i =0; i<arr.length;i++){
            if(i!=0){
                 left=left+arr[i-1];
            }
               
                right= sum-arr[i]-left;
                if(left==right){
                    return i;
                }
            
        }
    return -1;}
    public static void main(String[] args) {
        int[]arr={1,7,3,6,5,6};
        System.out.println(pivot(arr));
    }
}
