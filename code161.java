public class code161 {
 public static int countzero(int arr[]){
    int count=0;
    for(int i =0 ; i < arr.length;i++){
        if(arr[i]==0) count++;
    }
    return count;
 }   
public static void main(String[] args) {
    int []arr={1,4,5,6,0,0,0,07,8,0,0,0};
    System.err.println(countzero(new int[]{1,20,0,0,0}));
}}
