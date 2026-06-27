public class code195 {

    public static void swap(int [] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static int[] bubblesort(int []arr){
        for(int i = 0 ;i < arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    return arr;}
    public static void main(String[] args) {
        int []arr1=bubblesort(new int[]{2,5,1,3,4});
            for(int i = 0; i < arr1.length;i++){
                System.out.println(arr1[i]);
            }
    }
    
}
