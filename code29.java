// checjing the palindore
public class code29 {
    
    public static int checkpal(int n){
        int rev =0;
        int org = n;
        while(n>0){
       int last_digit = n%10;
       n=n/10;
       rev = (rev*10)+last_digit;}
       if(rev == org){
        return 1 ;
       }
       else return 0;

    }

    public static void main(String[] args) {
        int n = 1267762;
        int i =checkpal(n);
        if( i ==1){
            System.out.println(" number is palindore");
        }
    else
    System.out.println(" number is not palindore ");
}
    
}
