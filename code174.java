public class code174 {
    public static boolean palindrone(int n){
         String s = Integer.toString(n);
         int low=0;
         int high = s.length()-1;
         while(low<high){
            if(s.charAt(low)==s.charAt(high)){
                high--;
                low++;
            }
            else { return false;}
         }
         return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrone(12332));
    }
    
}
