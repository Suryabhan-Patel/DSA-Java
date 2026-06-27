// largest element in an array
class code54{
   public static int largestelemn(int []arr){
    int max =arr[0];
    for(int i =1; i< arr.length;i++){
        if(arr[i]>max)
        max =arr[i];
    }
    return max;
   }
   public static void main(String[] args) {
    int []arr ={2,4,787,9,9};
    System.out.println(largestelemn(arr));
   }
} 
