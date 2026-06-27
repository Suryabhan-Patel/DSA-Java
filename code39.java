// recurrision : print from n to 1 
public class code39 {
    public static void printrev(int n){
      if(n==0){
        return ;
      }
      System.out.println(n);
      printrev(n-1);
    } 
 public static void main(String[] args) {
    int n =10;
    printrev(n);
 }}
