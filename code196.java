public class code196 {
    public static int[] swap(int []arr,int a , int b){
        //System.out.println(arr[a]+"  "+ arr[b]);
             int temp= arr[a];
             arr[a]=arr[b];
             arr[b]= temp;
             return arr;
    }
    public static int[] insertion(int []arr){
        for(int i  = 1; i < arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j-1,j);
            }
        }
    return arr;}

    public static void main(String[] args) {
        int [] arr={5,1,2,3,4,6};
        int [] arr2 = insertion(arr);
        int [] arr3 = insertion(new int[]{4,1,4,5,9});
        for(int i = 0 ; i < arr3.length;i++){
            System.out.println(arr3[i]);
            System.out.println();
            System.out.println(arr2[i]);
        }
    }
    
}
