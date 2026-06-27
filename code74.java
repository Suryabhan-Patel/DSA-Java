// optimal solution for move all the elements to zero 
public class code74 {
    public static int[] movezero(int []arr){
        int j  = -1;
        for(int i = 0 ; i  <arr.length; i++){
            if(arr[i]==0){
               j = i;
            break;}}
            int i = j+1;
            while(i<arr.length){
                if(arr[i]!=0){
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                    j++;
                    i++;
                }
                else{
                    i++;
                }
            }return arr;}

    public static void main(String[] args) {
        int[] arr={1,0,2,3,0,0,4,5,0,9};
        movezero(arr);
        for(int i =0;i <arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
