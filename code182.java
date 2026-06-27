public class code182 {
    public static void freq(String s){
        int[] frequency=new int[26];
        
        for(int i = 0 ; i < s.length();i++){
            frequency[s.charAt(i)-'a']++;
        }
        System.out.print(s.charAt(0)+"->");
        System.out.println( frequency[s.charAt(0)-'a']);
        for(int i = 1; i< s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                 System.out.print(s.charAt(i)+"->");
                System.out.println( frequency[s.charAt(i)-'a']);
            }
        }
    }
    
public static void main(String[] args) {
    freq("aabccdeaa");
}}
