public class code194 {
    public static boolean armstrong(int n ){
        int nu=n;
        int ans=0;
        String  s= Integer.toString(n);
        int len = s.length();
        while(n>0){
            int rem=n%10;
            System.out.println(rem);
            ans=ans+(int)Math.pow(rem, len);
            System.out.println(ans);
            n=n/10;
            System.out.println(n);
            
        }
        System.out.println(ans);
    return nu==ans;}
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
