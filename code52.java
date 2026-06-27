// reverse a number using recurision
public class code52 {
    public static int rev(int n ,int ans){
        if (n==0)
        return ans;
        int lastdigit =n%10;
        return rev(n/10,(ans*10)+lastdigit);
    }
    public static void main(String[] args) {
        int n =12;
        System.out.println(rev(n,0));
    }
    
}
