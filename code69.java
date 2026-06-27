// remove duplicate element of an aaray
public class code69 {
    public static int[] remove(int[]arr){
        int[] result =new int[arr.length];
        int index=0;
        for(int i = 1; i < arr.length;i++){
            if(arr[i-1]==arr[i]&&result[index]!=arr[i]){
                result[index]=arr[i];
                index++;
            }
        } for(int i=0;i<index;i++){
            arr[i]=result[i];
        } System.out.println(" there are "+(index)+" elements are unique");
        return arr;}
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3};
        remove(arr);
        for(int i=0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }}
    

