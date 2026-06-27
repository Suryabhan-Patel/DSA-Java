// longeset subsrting without repeating charcter
import java.util.*;
public class code123 {
    public static int maxsubstring(String s){
        int high=0;
        int low=0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(high<s.length()){
            char ch = s.charAt(high);
            map.put(ch,map.getOrDefault(ch,0)+1);

            while(map.get(ch)>1){
                char ch1 = s.charAt(low);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0){
                    map.remove(ch1);
                }
                low++;
            }
            max=Math.max(max,high-low+1);
            high ++;
        }
    return max;}
    public static void main(String[] args) {
        String s = "abcabcbbefghij";
        System.out.println(maxsubstring(s));
    }
}
