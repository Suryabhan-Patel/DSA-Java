public class code159{
    public static int secondlar(int[] arr){
        int largest= Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i =0 ; i < arr.length; i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest){
                second=arr[i];
            }

        }
    return second;}
    public static void main(String[] args){
        int[]arr={3,4,6,2,7};
        System.out.println(secondlar(arr));
    }

}
