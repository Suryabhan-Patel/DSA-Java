import java.util.HashMap;

public class code176 {
    public static boolean containsdup(int[] arr){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(int i =0; i < arr.length;i++){
            if(map.get(arr[i])>1){
                return false;
            }
        }
    return true;}
    
}
