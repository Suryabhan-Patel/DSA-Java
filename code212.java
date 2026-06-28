//Find Minimum in Rotated Sorted Array
public class code212 {
    public static int Minimum(int []  arr){
        int low=0;
        int high= arr.length-1;
        int Minimum=-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[arr.length-1]){
                low=mid+1;
            }
            else{
             Minimum= mid;
             high=mid-1;
            }
        }
    return Minimum;}
    public static void main(String[] args) {
        System.out.println(Minimum(new int[]{4,5,6,7,1,2,3}));
    }
    
}
