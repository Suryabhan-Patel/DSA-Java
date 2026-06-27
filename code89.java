// 0ptimal rottaion problem 
public class code89 {
    public static int[] reverse(int arr[], int start, int end){
        while(start<end){
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
       end--;}
        return arr;
    }
    public static int [] rotate(int []arr, int k){
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return arr;
    }
   public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k  =3;
        rotate(arr, k);
        for(int i = 0 ; i <arr.length;i++){
            System.out.println(arr[i]);
       
    }
    
}}
