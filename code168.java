import java.util.*;
public class code168 {
    public static int reverse(int n){
        int res=0;
        while(n>0){
            int rem = n%10;
            res= res*10+rem;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(reverse(123));
    }
    
}
