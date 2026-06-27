// another method of divisor
import java.util.ArrayList;
import java.util.Collections;
public class code32 {
    public static void main(String[] args) {
      ArrayList<Integer> list = new ArrayList<>();
  int n =72;
  for(int i = 1; i<=(int)(Math.sqrt(n));i++){
    if(n%i ==0){
        //System.out.print( i+ " ");
        list.add(i);
        if(i!=n/i){
           // System.out.print(n/i+ " ");
            list.add(n/i);
        }
    }
  }
Collections.sort(list);
System.err.println(list); }
}
