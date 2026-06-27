//two sum approah by optimal solution
import java.util.*;
class code83{
  public static String twosum(int target, int []arr){
          Arrays.sort(arr);
          int start = 0; 
          int end = arr.length-1;
          while(start<end){
            if(arr[start]+arr[end]==target)
               return "yes";
            if (arr[start]+arr[end]<target) {
               start++;
            } else {
              end--;
              
            }   
          }
  return "no";}
    public static void main(String[] args) {
      int[] arr={2,6,5,11};
      int target = 14;
      System.err.println(twosum(target, arr));
    }}
