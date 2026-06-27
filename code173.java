import java.util.HashMap;
import java.util.Map;

public class code173 {
    public static int nonrepeat(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        char c=' ';
        boolean hasvalue= false;
        for(int i = 0 ;  i< s.length(); i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0)+1);
        }
       for(Map.Entry<Character, Integer> entry : map.entrySet()){

    if(entry.getValue() == 1){
        c= entry.getKey();
        hasvalue=true;
        break;
    }
}
if(hasvalue){
for(int i = 0 ; i < s.length();i++){
    if(s.charAt(i)==c) return i;
}}

    
return -1;}
}