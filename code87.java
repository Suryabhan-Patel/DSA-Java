// left rotate the array by one place
public class code87 {
    public static int[] rotate(int[] arr){
        int temp = arr[0];
        for(int i = 1; i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotate(arr);
        for(int i = 0; i  <arr.length ;i++){
            System.err.println(arr[i]);
        }
    }
}
