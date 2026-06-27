// segerate even and odd
public class code100 {
    public static int[] seg(int[] arr){
        int i=0;
        int j =0;
        while(j<arr.length){
            if(arr[j]%2==0){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
                j++;
                i++;
            }
            else j++;
        }
        return arr;
    }
    
public static void main(String[] args) {
    int[] arr= {3,1,2,4,7,8,9,0,6,5};
    int[] arr1= seg(arr);
    for(int i =0; i < arr1.length; i++){
        System.out.println(arr1[i]);
    }
}}
