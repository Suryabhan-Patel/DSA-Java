// remove duplicate from sorted array
public class code86 {
     public static int removedup(int []arr){
        if(arr.length==0){
            return 0;
        }
        int index = 1;
        for(int i =1; i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                arr[index]=arr[i];
                index++;}}
                return index;
            
        }
public static void main(String[] args) {
    int[] arr={1,1,2,2,2,3,3};
    System.out.println(removedup(arr));
}
     }

