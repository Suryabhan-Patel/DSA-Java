// find majority element in the array using brutte froce approach
public class code84 {
    public static int majorityelement(int []arr){
        for(int i =0; i < arr.length; i++){
            int element= arr[i];
            int count =1;
            for(int j =0; j <arr.length; j++){
                if(arr[j]==element){
                    count++;
                }}
                if(count>(arr.length/2))
                return element;
        }
        return-1;
    }
 public static void main(String[] args) {
    int[] arr={3,3,3,3,1,2,2};
 System.out.println("the majority elemnet is "+ majorityelement(arr));
}}
