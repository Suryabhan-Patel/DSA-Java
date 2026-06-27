// reverse a number 
public class code28 {
    public static void main(String[] args) {
        int n =4500;
        int rev =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            rev = (rev*10)+rem;
        
        }
        System.out.println("number is "+rev);
    }
    
}
