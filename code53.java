// faboccni number
public class code53 {
    public static void main(String[] args) {
        int n =5;
        int[] arr= new int[n];
        arr[0]=0;
        System.out.print(arr[0]+"  "+arr[1]);
        arr[1]=1;
        for(int i =2 ; i<n; i++){
            arr[i] = arr[i-1]+arr[i-2];
            System.out.print( "  "+arr[i]);
        }
    }
    
}
