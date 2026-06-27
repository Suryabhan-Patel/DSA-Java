import java.util.*;
public class code190{
   public static ArrayList<Integer> factor(int n){
    ArrayList<Integer> ans= new ArrayList<>();
    for(int i = 1; i*i <=n; i++){
        if(n%i==0) {ans.add(i);
            if(i!=(n/i)){
            ans.add(n/i);}
        }
    }
    return ans;

   }
   public static void main(String[] args) {
    ArrayList<Integer> list = factor(120);
      for(int num: list){
        System.out.println(num);

    }
   }
}