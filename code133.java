public class code133 {
    public static int[] suffexsum(int[] arr){
       int[] suffsum= new int[arr.length];
       int n = arr.length;
       suffsumcode134.java[n-1]=0;
       for(int i = n-2 ; i >=0;i--){
        suffsum[i]= suffsum[i+1]+arr[i+1];
       }
    return suffsum;}
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2};
        int[] arr2 = suffexsum(arr);
        for(int i = 0 ; i  < arr.length; i++){
            System.out.println(arr2[i]);
        }
    }
    
}
