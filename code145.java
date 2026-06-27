import java.util.*;
public class code145 {

    public static ArrayList<Integer> negative(int []arr, int k){
        int low =0;
        int high= k-1;
        ArrayList<Integer> list = new ArrayList<>();
        while(high < arr.length){
            int found_neg=0;
            for(int i=low ; i<=high;i++){
                if(arr[i]<0){
                    found_neg =1;
                    list.add(arr[i]);
                    break;
                }}
                if(found_neg==1){
                    list.add(0);
                }
                low++;
                if(high<arr.length){
                high++;}
            
        }
    return list;}
}