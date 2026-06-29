import java.util.Scanner;

public class code224{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k=sc.nextInt();
        int j=sc.nextInt();
        int m=sc.nextInt();
        int p= sc.nextInt();
        int n=sc.nextInt();
        int monkeybanana=m/k;
        if(m%k!=0) monkeybanana++;
        int monkeypeanuts= j/p;
        if(j%p!=0) monkeypeanuts++;
        int total = monkeybanana+monkeypeanuts;
        System.out.println(n-total);
        sc.close();
    }
}