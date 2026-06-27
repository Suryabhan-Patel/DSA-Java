// reverse an array
public class code99 {
    public static int[] reverse(int[]arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2 = reverse(arr1);
        for(int i = 0 ; i  <arr2.length; i ++){
            System.out.println(arr2[i]);
        }
    }
    
}
