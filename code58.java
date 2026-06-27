// find missing number in sequence of array :- this is only valid for sorted array and array musat be start from  1
public class code58 {
    public static int missingno(int [] arr){
        for(int i =0; i<arr.length;i++){
            if(arr[i]!=i+1)
            return i+1;
        }
    return -1;}
        public static void main(String[] args) {
            int [] arr ={1,2,4,5};
            if(missingno(arr)==-1){
                System.out.println(" no number is missing in question ");
            }
            else
            System.out.println(missingno(arr));
        }
}
