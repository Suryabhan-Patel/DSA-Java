public class code267 {
    public static int consecutiveone(int[] arr){
        int max = Integer.MIN_VALUE;
        int count=0;
         for(int i=0;i < arr.length;i++){
            if(arr[i]==1){
                count=count+1;
                max= Math.max(max, count);
            }
            else{
                count=0;
            }
         }
         return max;
    }
    public static void main(String[] args) {
        System.out.println(consecutiveone(new int[]{1,1,1,1,0,0,1,1,}));
    }
    
}
