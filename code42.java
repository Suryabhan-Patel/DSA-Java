// backtravkimg in recurrision print  from n to 1
public class code42 {
   public static void print(int i , int n){
    if(i>n){
        return;
    }
    print(i+1, n);
    System.out.println(i);
   } 
   public static void main(String[] args) {
    int n  =10;
    print(1, n);
   }
}
