public class code109 {
    public static int fact(int n){
        int ans=0;
        if(n==0)
            return 0;
        
        else {
           //System.out.println(n);
           ans= n+fact(n-1);
           System.out.println(n);
        
    }return ans;}
    public static void main(String[] args) {
        System.out.println(fact(10));
    }
    
}
