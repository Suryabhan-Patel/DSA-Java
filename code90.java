// move allthe zero to the end
public class code90 {
    public static int[] move(int arr[]){
        int pos=0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]!=0){
                arr[pos]=arr[i];
              pos++;}
        }
        for(int i =pos; i<arr.length; i++){
            arr[i]=0;
        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr={1,3,0,9,0,9,5,0};
        move(arr);
        for(int i =0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
