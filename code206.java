import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;

public class code206 {
    public static int[] threesum(int []arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length-2;i++){
                 int low = i+1 ; 
                 int high =arr.length-1;
                 while(low<=high){
                    if(arr[low]+arr[high]==-1*arr[i]) return new int[]{arr[i],arr[low],arr[high]};
                    else if(arr[low]+arr[high]<-1*arr[i]){
                        low++;}
                        else{
                            high--;
                        }
                    }
                 }
            
        return new int[]{-1,-1,-1};}    
    
    public static void main(String[] args) {
        int [] res = threesum(new int[]{-1,1,1,-2});
        for(int num: res){
            System.out.println(num);
        }
        
    }
    
}
