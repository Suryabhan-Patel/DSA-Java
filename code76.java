// union of two arrays
import java.util.*;
public class code76 {
    public static HashSet<Integer> union (int[]arr1, int []arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i <arr2.length; i++){
            set.add(arr2[i]);
        }
        return set;
    }
    public static void main(String[] args) {
        int [] arr1={1,1,2,2,3,3,4,4,5,5,7,7,8,8,9,9};
        int [] arr2={1,1,2,2,3,3,4,4,5,5,7,7,8,9,9,10,11,11,23,23,233};
             HashSet<Integer> set = union(arr1,arr2);
             System.out.println(set);
    }
    
}
