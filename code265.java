import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class code265 {
    public static int[] twosum(int []arr, int tar){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0; i < arr.length;i++){
          if(map.containsKey(tar-arr[i])) return new int[]{map.get(tar-arr[i]),i};
          map.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]arr= twosum(new int[]{2,7,11,15}, 9);
        for(int num: arr) System.out.println(num);
    }
    
}
