// remove duplicates in place
public class code101 {
    public static int[] dup(int[] arr){
        int i=0;
        int j =1;
        while(j < arr.length){
            if(arr[j]==arr[j-1]){
                j++;
            }
            else{
                arr[i+1]=arr[j];
                i++;
                j++;}
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,3,4,4,5,5};
        int[]arr2= dup(arr);
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
