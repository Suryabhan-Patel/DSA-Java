import java.util.ArrayList;
import java.util.HashMap;

public class code208 {
    public static ArrayList<Integer> morethanoneele(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i = 0; i < arr.length;i++){
            map.put(arr[i],map.getOrDefault((arr[i]),0)+1);

        }
        for(int i = 0 ; i < arr.length;i++){
            if(!ans.contains(arr[i])){
            if(map.get(arr[i])>1) ans.add(arr[i]);
        }}
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> rs = morethanoneele(new int[]{1,2,2,3,4,4,5,6,6,7,8,8});
        for(int i = 0 ; i <rs.size();i++){
            System.out.println(rs.get(i));
        }
    }
    
}
