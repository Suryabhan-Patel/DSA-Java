// intersection of two sorted array using two pointers 
import java.util.*;
public class code77 {
    public static ArrayList<Integer> intersection(int []arr1, int []arr2){
        ArrayList<Integer> li = new ArrayList<>();
        int i=0, j = 0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                li.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                i++;
            }
            else{
                j++;
            } }
            return li;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,5,6,7,7,8,8,9};
        int []arr2={3,3,4,4,5,5,6,6};
        ArrayList<Integer> li = intersection(arr1, arr2);
        System.out.println(li);
    }
}
