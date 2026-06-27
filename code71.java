// left rotate the element by k places  
import java.util.ArrayList;
public class code71 {
    public static int[] leftrotate(int[] arr, int k ){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < k;  i++){
             list.add(arr[i]);
        }
        for(int i = k ; i < arr.length;i++){
            arr[i-k]= arr[i];

        }
        for(int i = arr.length-k ; i  <  arr.length; i ++){
               arr[i]=list.get(i-(arr.length-k));
        }
        return arr;

    }
    public static void main(String[] args) {
        int [] arr ={ 1,2,3,4,5,6,7};
        leftrotate(arr, 3);
        for(int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
} 
