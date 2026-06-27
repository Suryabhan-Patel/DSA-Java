public class code137{
    public static int second_largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int Second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ;i++ ){
            if(arr[i]> largest){
                third=Second;
                Second =largest;
                largest=arr[i];
            }
            else if (arr[i]>Second && arr[i]!=largest){
                   third=Second;
                   Second =arr[i];                
            }
            else if (arr[i]>third && arr[i]!=Second && arr[i]!=largest){
                   third =arr[i];                
            }
        }
    return third;}
     public static void main(String[] args) {
       int[]arr = { 2,6,5,5,9,14};
       System.out.println(second_largest(arr));    
    }
}