public class code180{
    public static int majorele(int[] arr){
        int count=1;
        int element=arr[0];
        for(int i = 1; i < arr.length;i++){
            if(arr[i]==element){
                count++;
            }
            else count--;
            if(count==0){
                element=arr[i];
                count++;
            }}
        return element;
    }
    public static void main(String[] args) {
        System.out.println(majorele(new int[]{1,1,1,2,2,3,3,1,1,1}));
    }
}