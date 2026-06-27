public class code189 {
    public static boolean primecheck(int n){
        int count=0;
        for(int i= 1 ; i <=n;i++){
            if(count>2)return false;
            else if(n%i==0) count++;
        }
     if(count>2) return false;
    return true;}
    public static void main(String[] args) {
        System.out.println(primecheck(4));
    }
    
}
