//  check if the array is sorted or not
public class code55 {
   public static boolean issorted(int [] arr){
     for(int i =0; i< arr.length-1; i++){
        if(arr[i]>arr[i+1])
        return false;
     }
     return true;
   } 
public static void main(String[] args) {
    int []arr1 ={1,5,9,11};
    int[] arr2={7,9,10};
    System.out.println(issorted(arr1));
    System.out.println(issorted(arr2));
}}
