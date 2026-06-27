// reverse a array using recurrsion and single pointer 
public class code48 {
    public static int[] revarray(int []arr, int i ){
        if(i>=arr.length/2)
        return arr;
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1]=temp;
         return revarray(arr, i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,6};
        revarray(arr, 0);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}
