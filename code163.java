public class code163 {
    public static int removedup(int[] arr){
        int j =0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i]!=arr[j]){
                arr[j+1]=arr[i];
                j++;
            }
        }
    return j;}
    public static void main(String[] args) {
        int[]arr={1,1,2,2,3,4,4};
        int n = removedup(arr);
        for(int i=0; i <=n;i++){
            System.out.println(arr[i]);
        }
    }
}
