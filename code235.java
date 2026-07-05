public class code235 {
    public static void reverse(int[] arr, int low, int high){
        while(low<=high){
            int temp=arr[low];
             arr[low]= arr[high];
             arr[high]=temp;
             low++;
             high--;

        }
    }

    public static int[]  rightrotate(int[] arr, int  k){
        k = k%arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
        reverse(arr, 0, arr.length-1);
  return arr;
    }

    public static void main(String[] args) {
        int [] ne= rightrotate(new int[]{1,2,3,4,5}, 2);
        for(int num: ne) System.out.println(num);
    }
}