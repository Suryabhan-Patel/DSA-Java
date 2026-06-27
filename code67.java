// Insertion sort
public class code67 {
    public static int[] Insertionsort(int []arr){
        for( int i  =0; i  <arr.length; i++){
            int j = i;
            while(j>0&& arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] =temp;
                j--;
            }
        }
    return arr;}
    public static void main(String[] args) {
        int [] arr = { 8,7,6,5,45,78,4};
        Insertionsort(arr);
        for( int i = 0 ; i < arr.length ; i ++){ 
           System.out.println(arr[i]);
        }
    }
}
