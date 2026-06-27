// sum of first n natural number using recurision
public class code51 {
    public static int sum(int n){
         if(n<1)
         return 0; 
         return n+sum(n-1);
         
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sum(n));
    }
    
}
