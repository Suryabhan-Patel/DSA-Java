public class code151 {
public static void main(String[] args) {
    int[] arr={1,2,3,4};
    int[] prefix = new int[arr.length];
    prefix[0]=0;
    for(int i = 1 ; i < arr.length ; i ++){
        prefix[i]=prefix[i-1]+arr[i-1];
    }
    for(int i = 0 ; i < prefix.length;i++){
        System.out.println(prefix[i]);
    }
}
}