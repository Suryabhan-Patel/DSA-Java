// count frequency of an element in an array
public class code56 {
    public static int  countfreq(int [] arr, int element){
        int count =0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]==element)
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,8,7,7,7,8,9,7};
        System.out.println(countfreq(arr,8));
    }
    
}
