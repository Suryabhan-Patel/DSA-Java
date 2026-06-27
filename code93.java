// square of sorted
public class code93 {
    public static int[] sorted(int []arr){
    int i =0;
    int arr1[]=new int[arr.length];
    while(i<arr.length){
      arr1[i]=(arr[i]*arr[i]);
    i++;}
return arr1;}
public static void main(String[] args) {
    int[] arr={1,2,3,4,5,6,6,7};
    int[] arr1=sorted(arr);
    for(int i =0;i<arr.length;i++){
        System.out.println(arr1[i]);
    }
}}
