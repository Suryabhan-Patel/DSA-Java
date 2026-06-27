// check number is prime or not
public class code23 {
    public static void prime(int n ){
        int sum =0;
        for(int i = 1; i<=n; i++){
            if(n %i == 0){
                sum = sum+1;
            }}
            if(sum==2){
                System.out.println(+n +" is a prime number");
            }
            else
            System.err.println(+n+" is not  a prime number ");
        
    }
    public static void main(String[] args) {
        int n =13;
        prime(n);
    }
    
}
