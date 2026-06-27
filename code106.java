public class code106 {

    public static int maxel(int []arr){
           int max = Integer.MIN_VALUE;
           int secmax= Integer.MIN_VALUE;
           for(int i =0; i < arr.length; i++){
            if(arr[i]>max){
                secmax=max;
                max=arr[i];}
            else if(arr[i]<max && arr[i]>secmax){
                secmax=arr[i];
            }}
           return secmax;}
    
    public static void main(String[] args) {
        int []arr={8,4,5,2,1};
        System.out.println(maxel(arr));
    }
    
}
