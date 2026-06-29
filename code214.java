import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class code214{
    public static int[] maxfreq(int [] arr, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        ArrayList<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort((a,b)->b.getValue()-a.getValue());
        int[] ans = new int[k];
        for(int i=0; i < k;i++){
            ans[i]=list.get(i).getKey();
        }
return ans;
    }
    public static void main(String[] args) {
        int [] y = maxfreq(new int[]{1,1,1,2,2,3}, 2);
        for(int  num: y){
            System.out.println(num);
        }
    }
}