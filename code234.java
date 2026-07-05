import java.util.HashMap;

public class code234 {
    public static boolean containsdup(int []arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
            if(map.get(num)>1) return true;
        }
return false;
    }
    
}
