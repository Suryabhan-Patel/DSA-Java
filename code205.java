import java.util.HashMap;

public class code205{
    public static int[] twosum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length;i++){
            if(map.containsKey(target-arr[i])) return new int[]{arr[i],target-arr[i]};
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1,-1};

    }
public static void main(String[] args) {
    int [] arr= twosum(new int[]{1,2,4,6,5},9);
    for(int i = 0; i< arr.length;i++){
        System.out.println((arr[i]));
    }
}}
        