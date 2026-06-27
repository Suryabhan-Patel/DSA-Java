public class code191 {
    public static int gcd(int a, int b){
        int ans=0;
        for(int i = 2 ; i<= Math.min(a, b) ;i++  ){
                if(a%i==0 && b%i==0) ans=Math.max(ans, i);
        }
        if(ans!=0) return ans;
     return 1;}
public static void main(String[] args) {
    System.out.println(gcd(120,10));
}    
}
