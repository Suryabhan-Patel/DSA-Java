// find second largest element in an array
public class code57 {
    public static int secondlargest(int arr[]){
        int max= arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i]>max)
            max=arr[i];
        }
      int min = Integer.MAX_VALUE;
      int k =0;
      for(int j =0;j<arr.length;j++){
        if(arr[j]==max)
          continue;
        if(max-arr[j]<min){
             min=max-arr[j];
             k =arr[j];
        }}

      return k;

    }
    public static void main(String[] args) {
        int []arr={2,45,45657,78,8};
        System.out.println(secondlargest(arr));
    }
}
