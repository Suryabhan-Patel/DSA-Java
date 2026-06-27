// check palindrome using reurision
public class code49 {
    public static boolean ispalindrome(String s, int i){
        int n = s.length();
        if(i>n/2)
        return true;
        if(s.charAt(i)!=s.charAt(n-i-1))
        return false;
        return ispalindrome(s, i+1);
    }
    public static void main(String[] args) {
        int n = 12344321;
        String s = String.valueOf(n);
        System.out.println(ispalindrome((String)(s), 0));
    }
}
