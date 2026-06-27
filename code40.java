// recurrision : print from n to 1  another method 
public class code40 {
  public static void printrev1(int i , int n){
    if (i<1){
        return;
    }
    System.out.println(i);
    printrev1(i-1,n);
  }  
  public static void main(String[] args) {
    int n =10;
    printrev1(n, n);
  }
}
