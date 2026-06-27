// reverse  a array
class code33{
     
    public static int[] reverse(int []arr){
        int start= 0;
        int end = arr.length-1;
        while(end>start){
          int temp= arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;

        }
        return arr;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,5,6};
        reverse(arr);
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}