// sum of a diit of a number using recur..
public class code50 {
    public static int sum(int n , int sum){
        if(n==0)
        return sum;
        int lastdigit = n%10;
        sum+=lastdigit;
        return sum(n/10,sum);
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(sum(n,0));
    }
    
}
