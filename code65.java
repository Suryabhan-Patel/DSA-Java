// selection sort
public class code65 {
    public static int [] sort(int []arr){
        for(int i = 0  ;i  <arr.length-1; i++){
            int index = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j]<arr[index]){
                index=j;
                }}
            int temp = arr[index];
            arr[index] =arr[i];
            arr[i] =temp;}
        return arr;
    }
    public static void main(String[] args) {
        int[]arr={9,3,4,5,1};
        sort(arr);
        for(int i = 0 ; i < arr.length; i ++ ){
            System.out.println(arr[i]);
        }
    }
}
