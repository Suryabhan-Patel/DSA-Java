public class code154 {
    public static boolean palin(int n){
        String s= String.valueOf(n);
        int low=0;
        int high=s.length()-1;
        while(low<high){
           if(s.charAt(low)==s.charAt(high)){
            high--;
            low++;
           }
           else return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 123321;
        int y = 12321;
        int z = 123456;
        System.err.println(palin(n));
        System.err.println(palin(y));
        System.err.println(palin(z));
    }
    
}
