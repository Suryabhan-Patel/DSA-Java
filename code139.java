public class code139{
    public static int[] removezero(int[] arr){
        int index= 0;
        for(int i = 0 ; i <  arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
        } 
        while(index < arr.length){
            arr[index]=0;
            index++;
        }
         
    return arr;}
    public static void main(String[] args) {
        int[] arr= {6,0,7,6,0,0,0,9,90,0,0};
        int[] arr2= removezero(arr);
        System.out.print("[");
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]);
            if(i<arr.length-1){
            System.out.print(",");}

        }
    System.out.print("]");}
}
