import java.util.*;
public class code160 {
    public static int occuranceone(int[] arr){
        int res=0;
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0 ; i < arr.length; i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
   for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
     if(entry.getValue()==1) res= entry.getKey();
}
    return res;}
    
public static void main(String[] args) {
    int [] arr={1,2,3,4,3,4,5};
    System.out.println(occuranceone(arr));
}}
