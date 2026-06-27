// majority element of array using better solution
import java.util.*;
public class code85 {
    public static int majorityelement(int []arr){
           HashMap<Integer,Integer> map = new HashMap<>();
           for( int num : arr){
             map.put(num, map.getOrDefault(num, 0)+1);
           }
           for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>(arr.length/2))
                return entry.getKey();
           }
       return-1;}
    public static void main(String[] args) {
        int [] arr= {2,2,3,3,1,2,2};
        System.out.println(majorityelement(arr));
    }
}
