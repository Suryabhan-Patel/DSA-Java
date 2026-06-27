// intersection and union of two sorted array
import java.util.*;
public class code75 {
    public static HashSet<Integer> intersection(int [] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i  = 0 ; i  <arr1.length ; i++){
            for(int j = 0 ; j  <arr2.length ; j++){
                 if(arr1[i]==arr2[j]){
                    set.add(arr1[i]);}

            }
        }
        return set;
    } 
    public static void main(String[] args) {
        int[]arr1 ={1,2,3,4,5,5,5,6,6,67,7,8,8};
        int[]arr2={5,6,7,8,9,67};
        HashSet<Integer> set= intersection(arr1, arr2) ;
    System.out.println(set);}
}
