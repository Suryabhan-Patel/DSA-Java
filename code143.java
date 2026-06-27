// count prefeqency of elemnts
import java.util.*;
public class code143 {

    public static HashMap<Integer,Integer> count(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i <arr.length ; i++){
            map.put((arr[i]), map.getOrDefault(arr[i], 0)+1);
        }
    return map;}
    
    public static void main(String[] args) {
        int[] arr = { 1,2,1,1,1,2,3,4,5,3,05};
        HashMap map = count(arr);
        System.out.println(map.get(3));
    }
}
