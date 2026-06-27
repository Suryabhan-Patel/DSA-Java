public class code203{
   public static int binary(int[]arr, int target){
      int low=0;
      int high= arr.length-1;
      int mid= 0;
      while(low<=high){
          mid = low + (high - low) / 2;
         if(arr[mid]<target){
            low=mid+1;
         }
         else if(arr[mid]>target){
            high=mid-1;
         }
         else{
            return mid;
         }
      }
   return -1;}
   public static void main(String[] args) {
      System.out.println(binary(new int[]{1,4,7,9,15}, 17));
   }
}