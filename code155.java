public class code155 {
    public static int largest(int []arr){
        int largest1= Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i]>largest1) largest1=arr[i];

        }
        return largest1;
    }
    public static void main(String[] args) {
        int []arr={1,1017,18,8};
        System.out.println(largest(arr));
    }
    
}
