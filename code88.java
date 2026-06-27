// rotate the array by k places
public class code88 {
    public static int[] rotate(int[]arr, int k){
        int n = arr.length;
         k = k%n;
        int[]result= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int newindex = (i-k+n)%n;
            result[newindex]=arr[i];
        }
        for(int i =0;i <arr.length;i++){
            arr[i]=result[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        int k  =3;
        rotate(arr, k);
        for(int i = 0 ; i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
