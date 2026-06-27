import java.util.HashMap;

public class code185 {
  public static boolean isomperic(String s,String t){
        HashMap<Character,Character> map = new HashMap<>();
        map.put(s.charAt(0),s.charAt(0));
        for(int i = 1 ;  i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
            if(map.get(s.charAt(i))!=t.charAt(i)){
                return false;
            }}
            map.put(s.charAt(i), t.charAt(i));
        }
        return true;
  }   
  public static void main(String[] args) {
    System.out.println(isomperic("paper", "titie"));
  } 
}
