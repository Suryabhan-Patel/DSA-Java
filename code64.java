// character hashing
public class code64 {
public static int freq(String s , char c){
    int [] hash = new int[26];
    for(int i =  0; i  <s.length() ; i++){
        hash[s.charAt(i)-'a']++;

    }
    return hash[c-'a'];
}
    public static void main(String[] args) {
      String s = "suryabhan";
      System.out.println(freq(s,'a'));
}}
