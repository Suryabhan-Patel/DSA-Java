import java.util.*;
public class code272{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=n;
        int ans=0;
        while (p>0) {
            int rem= p%10;
            ans= ans*10+rem;
            p=p/10;
        }
        System.out.println(ans);
        sc.close();

    }
}