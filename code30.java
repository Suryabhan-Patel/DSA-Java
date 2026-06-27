// arm strong number = if there is a number , then the sum of the cube of each diagi is equal to the digit
public class code30 {
    public static boolean rev1(int n){
        int org = n;
        int sum =0;
        int digit = String.valueOf(n).length();
     while(n>0){
        int last_digit =n%10;
        n =n/10;
        sum =sum + (int)Math.pow(last_digit, digit);}
        if(sum== org){
            return true;
        }
        else
        return false;
    }

    public static void main(String[] args) {
        int n = 1634;
        boolean i = rev1(n);
        if( i == true){
            System.out.println(" number is armstrong");
        }
        else 
        System.out.println(" number is not armstrong ");

    }
    
}
