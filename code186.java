public class code186{
    public static int[] movezero(int[] arr){
        int j=0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    return arr;}
    public static void main(String[] args) {
        int[] arr={1,0,8,0,901,0,1};
        int[] arr2=movezero(arr);
        for(int num: arr2){
            System.out.println(num);
        }
    }

}