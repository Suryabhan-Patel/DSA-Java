import java.util.Scanner;

public class code241 {

    public static boolean isprime(int n ){
        for(int i=2; i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2; i <=n;i++){
           boolean prime = isprime(i);
           if(prime){
            System.out.println(i);
            sum=sum+i;
           }
        }
        System.out.println(sum);
    }
    
}
