// find the number that appears once in the sorted array
public class code80 {
    public static int appearsonce(int []arr){
        int xor=0;
        for(int i = 0  ;  i<arr.length;i++ ){
             xor=xor^arr[i];
        }

    return xor;}
    
 public static void main(String[] args) {
    int[] arr={1,1,2,2,3,3,4};
    System.out.println(appearsonce(arr));
    System.out.println(2^3);
    System.out.println(3^2);
 }}
