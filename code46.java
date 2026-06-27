// parameter way to solving factorial
public class code46 {
  public static int fact(int i, int fact){
    if ( i < 1){
     return fact;
    }
    return fact(i-1,fact*i);
  }  
  public static void main(String[] args) {
    int n =5;
    System.out.println(fact(n, 1));
  }
}
