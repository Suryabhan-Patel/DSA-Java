import java.util.Scanner;

public class code225 {
    public static void swap(int[] arr, int i  ,  int j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0 ; i < n ;i++){
            arr[i]= sc.nextInt();
        }
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(arr[mid]==0){ 
                swap(arr,low,mid);
                low++; mid++;
        }
        else if(arr[mid]==1) mid++;
        else {
            swap(arr, mid,high);
            high--;
        }
    }
    for(int num:arr)System.out.println(num);
    
sc.close();}
}
