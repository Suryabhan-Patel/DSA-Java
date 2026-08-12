public class code293{
    public static boolean palindrome(String s, int low, int high){
        int len = high-low+1;     
        if(len==0|| len==1) return true;
        
        if(s.charAt(low)!=s.charAt(high)) return false;
             return   palindrome(s, low+1, high-1);
        

    }
    public static void main(String[] args) {
        System.out.println(palindrome("NAMANu", 0, 5));
    }
}