// sum to mn numbers using functional way
public class code44 {
    public static int sum(int n ){
        if (n==0){
            return n;
        }
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        int n =5;
        int sum = sum(n);
        System.out.println(sum);
    }
}
