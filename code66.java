// bubble sort
public class code66 {
    public static int[] sort(int []arr ){
        for(int i = 0 ; i  <arr.length; i++){
            for(int j = 0 ; j< arr.length-i-1; j++ ){
                if(arr[j+1]<arr[j]){
                    int temp =arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    return arr;}
    
 public static void main(String[] args) {
    int[] arr= { 5,6,7,1,3,8};
    sort(arr);
    for(int i =0 ; i  <arr.length;i++){
        System.out.println(arr[i]);
    }
 }}
