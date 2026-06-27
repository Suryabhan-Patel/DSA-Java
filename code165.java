public class code165{
public static void swap(int[] arr,int i,int j){

    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
    public static int[] dnf(int[] arr){
        int high=arr.length-1;
        int low=0;
        int mid=0;
        while(mid<=high){
            if(arr[mid]==0) {
                swap(arr,low,mid);
                mid++;
                low++; 
        }
        else if(arr[mid]==1) mid++;
        else{
            swap(arr,mid,high);
            high--;
        }    }
        return arr;
}
public static void main(String[] args) {
    int[] arr={1,1,0,1,2,1,2};
    int[] arr1= dnf(arr);
    for(int i = 0 ;i <arr1.length;i++){
        System.out.println(arr1[i]);
    }
}}