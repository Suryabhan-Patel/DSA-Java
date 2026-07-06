public class code237{
    public static int[] movezero(int [] arr){
        int zero=0;
           for(int i =0; i < arr.length;i++){
               if(arr[i]!=0){
                //swap
                int temp = arr[i];
                arr[i]=arr[zero];
                arr[zero]=temp;
                zero++;
               }
           }
           return arr;
    }
    public static void main(String[] args) {
        int [] arr= movezero(new int[]{0,3,0,1,5,2});
        for(int num: arr){
            System.out.println(num);
        }
    }
}