// linearly print numnber from 1 to n;
public class code38 {
    public static void printnu(int i,int n ){
        if(i>n){
           return;
        }
        System.out.print(i+  " ");
        printnu(i+1, n);
    }
    public static void main(String[] args) {
        int n =10;
        printnu(1, n);
    }
    
}
