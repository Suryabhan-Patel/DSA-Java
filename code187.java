import java.util.HashSet;

public class code187 {
public static int longestsubstring(String s){
    int low=0;
    int res=0;
    int high=0;
    HashSet<Character> set= new HashSet<>();
    for(high=0;high<s.length();high++){
        set.add(s.charAt(high));
        while((high-low+1)>set.size()){
              set.remove(s.charAt(low));
              low++;
        }
        res= Math.max(res, high-low+1;);
    }
return res;}    
}
