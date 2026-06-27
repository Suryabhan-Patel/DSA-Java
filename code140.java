public class code140 {
    public static int[] negativepositive(int[] arr){
        int [] result= new int[arr.length];
        negative=0;
        positive=arr.length-1;
        for(int i = 0 ; i , arr.length;i++){
            if(arr[i]<0){
                result[negative]=arr[i];
                negative++;
            }
            else{
                result[positive]=arr[i];
                positive++;
            }
        }
    return result;}
    
}
