import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashSet;

public class code179 {
    public static ArrayList<Integer> intersection(int[]arr1, int[]arr2){
        HashSet<Integer> f1=new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num: arr1){
            f1.add(num);
        }
        for(int num: arr2){
            if(f1.contains(num)){
                if(!list.contains(num)){
                list.add(num);}
            }
        }
    return list;}
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4};
        int[] arr2 ={5,4,3,4};
        ArrayList<Integer> list = intersection(arr1, arr2);
    for(int num: list){
        System.err.println(num);
    }    }
    
}
