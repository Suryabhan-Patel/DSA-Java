// backtracking in recurrision print 1 to  n
public class code41 {
    public static void printback(int i, int n){
        if(i<1)
            return;
        printback(i-1, n);
        System.out.println(i);    
        
    }
    public static void main(String[] args) {
        int n =5;
        printback(n, n);
    }
    
}
