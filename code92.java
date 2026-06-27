// duplicate elements in sorted array
import java.util.Arrays;
public class code92 {
    public static int[] duplicte(int[]arr){
        int n = arr.length;
        int i = 0;
        int j = 1;
        while(j<n){
            if(arr[i]==arr[j]){
                j++;
            }
            else{
                arr[i+1]=arr[j];
                i++;
                j++;
            }}
            return arr;
        
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3,4};
        System.out.println(Arrays.toString(duplicte(arr)));
    }
}
