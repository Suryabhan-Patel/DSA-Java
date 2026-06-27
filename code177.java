import java.util.HashMap;

public class code177 {
    public static boolean validanagram(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character, Integer> sfreq= new HashMap<>();
        HashMap<Character, Integer> tfreq= new HashMap<>();

      for(int i = 0 ; i < s.length();i++){
        sfreq.put(s.charAt(i),sfreq.getOrDefault(s.charAt(i),0)+1);
        tfreq.put(t.charAt(i),tfreq.getOrDefault(t.charAt(i),0)+1);
      }
      if(sfreq.equals(tfreq)) return true;
      else return false;

    }
    
}
