import java.util.HashMap;

public class code175{
    public static int[] twosum(int[] arr, int target){
         HashMap<Integer, Integer> map = new HashMap<>();
         for(int i =0 ; i < arr.length;i++)
{           if(map.containsKey(target-arr[i])){
    return new int[]{map.get(target-arr[i]),i};
}           else {
    map.put(arr[i],i);
}

}    return new int[]{-1};}
public static void main(String[] args) {
    int[] arr ={2,7,11,15};
    int[] arr1= twosum(arr, 18);
    for(int i = 0 ; i < arr1.length; i++){
        System.out.println(arr1[i]);
    }
}}