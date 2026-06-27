// check if the array is sorted or not
public class code68 {
    public static boolean issorted(int []arr){
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]&&arr[i+1]<arr[i]){
                return false;
            }}
            return true;
    }
    
}
