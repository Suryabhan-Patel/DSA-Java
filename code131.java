public class code131 {

    public static int countfreq(String s , char c){
        int[]arr=  new int[26];
        for(int i = 0; i <  s.length();i++){
            char ch1= s.charAt(i);
            arr[ch1-'a']++;
        }
    return arr[c-'a'];}

    public static void main(String[] args) {
        System.out.println(countfreq("aabbccddd", 'a'));
    }
    
}
