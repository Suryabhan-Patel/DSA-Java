// number of unique character in a string
public class code124 {
    public static int unique(String s){
        String p =s.toLowerCase();
        int[] freq = new int[25];
        for(int i =0; i<p.length();i++){
            char ch = p.charAt(i);
            freq[ch-'a']++;
        }
        int count =0;
        for(int i =0;i<freq.length;i++){
            if(freq[i]==1){
                count++;
            }
        }
    return count;}

    public static void main(String[] args) {
        System.out.println(unique("suryabhan"));
    }
    
}
