import java.util.Arrays;

public class code149{
    public static int anag(String s, String p){
        int[] window= new int[256];
        int[] result=new int[256];
        int low=0;
        int high=0;
        int count=0;
        for(int i =0; i < p.length();i++){
            result[p.charAt(i)-'a']++;
        }
        for( high=0; high<p.length();high++){
            window[s.charAt(high)-'a']++;
        }
        high=p.length()-1;
        while (high<s.length()) {
            if(Arrays.equals(window,result)){
            count++;}
            window[s.charAt(low)-'a']--;
            low++;
            high++;
            if(high<s.length()){
            
            window[s.charAt(high)-'a']++;}
        
            
        }
    return count;}
    public static void main(String[] args) {
        String s = "forxxorfxdofr";
        String p = "for";
        System.out.println(anag(s, p));
    }

}