// factorial 
public class code22 {
    public static int fact(int n){
        int sum =n;
        for(int i =n-1; i>=1;i--){
            sum = sum*i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n =10;
        System.err.println(" factorial of "+n +" is "+fact(n));
    }
}
