import java.util.HashMap;

public class code146 {
    public static int longsub(String s, int k){
        int low=0;
        HashMap<Character,Integer> map = new HashMap<>();
        int max=0;
        for(int high=0; high< s.length();high++){
            char ch = s.charAt(high);
             map.put(ch,map.getOrDefault(high, 0)+1);
             while(map.size()>k){
                char chlow = s.charAt(low);
                map.put(chlow, map.get(chlow)-1);
                if(map.get(chlow)==0){
                    map.remove(chlow);
                }
                low++;
             }
             max=Math.max(max, high-low+1);
        }
    return max;}
    
}
