import java.util.*;
class codee247 {
    public int lengthOfLongestSubstring(String s) {
       int left=0;
       int right=0;
       int res=0;
       HashMap<Character,Integer> map= new HashMap<>();
       for(right=0;right<s.length();right++){
              char ch= s.charAt(right);
              map.put(ch,map.getOrDefault(ch,0)+1);
              while(right-left+1>map.size()){
                char ch1 = s.charAt(left);
                map.put(ch1,map.get(ch1)-1);
                if(map.get(ch1)==0){
                    map.remove(ch1);
                }
                left++;}
              res=Math.max(res,right-left+1);}
        return res;}

        
    }
