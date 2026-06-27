// sum of n numbers using recurrision
public class code43 {
    static int sum =0;
    public static void sum(int i, int n ){
        if(i>n){
            return;
        }
        sum = sum+i;
        sum(i+1,n);
    }
    public static void main(String[] args) {
        int n =10;
        sum(1, n);
        System.out.println(sum);
    }
    
}
