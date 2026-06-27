import java.security.KeyStore.Entry;
import java.util.*;
public class code120 {
    public static char nonrepeat(String s){
      HashMap<Character,Integer> freMap= new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        freMap.put(ch,freMap.getOrDefault(ch, 0)+1);
      }
       for(int i=0;i<s.length();i++){
        char ch =s.charAt(i);
        if(freMap.get(ch)==1)
            return ch;
       }
        
          return '\0';
    }

    

public static void main(String[] args) {
    System.out.println(nonrepeat("aabbcd"));
}}

