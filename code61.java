// rotate the array by k step
class code61{
    public static int[] rotatearr(int k , int arr[]){
        int n = arr.length;
        k =k % n;
        int [] result = new int[n];
        for( int  i= 0; i<n; i++){
            int newindex = (k+i)%n;
            result[newindex]=arr[i];
        }for(int i =0;i<n;i++){
            arr[i]=result[i];
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        rotatearr(3, arr);
        for( int i =0; i<arr.length ; i++){
          System.out.println(arr[i]);
        }

    }

}
