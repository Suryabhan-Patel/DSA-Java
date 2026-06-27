public class code110 {
    public static int table(int n,int a){
        int ans =0;
        if(n==0){
            return  0;
        }
        else
            //System.out.println(n*a);
             ans=table(n-1, a);
            System.out.println(n*a);
            return ans;
        
    }
    public static void main(String[] args) {
        System.out.println(table(10, 5));
    }
    
}
