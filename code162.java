public class code162 {
    public static int[] movezero(int[]arr){
        int i=0;
        int j=0;
        for(int k = 0 ; k < arr.length; k++){
            if(arr[k]==0){
                i=k;
                j=k;
                break;
            }
        }
        while(i<arr.length){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j++;
            }
            else i++;
        }
    return arr;}
    public static void main(String[] args) {
    int[] arr={2,4,0,0,3,0,2};
    movezero(arr);
    for(int i = 0 ; i< arr.length;i++){
        System.out.println(arr[i]);
    }
    }
    
}
