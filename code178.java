import java.util.HashMap;

public class code178 {
    public static int major(int[] arr){
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int num: arr){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(int i = 0 ; i < arr.length;i++){
        if(map.get(arr[i])>arr.length/2) return arr[i];
    } 
    return -1;
    }
    public static void main(String[] args) {
      int[]  nums = {2,2,1,1,1,2,2};
      System.out.println(major(nums));
    }
    
}
