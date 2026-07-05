public class code236 {
    public static int majorityele(int []arr){
        int count=1;
        int maj=arr[0];
        for(int i =0 ; i < arr.length;i++){
            if(arr[i]==maj)count++;
            else count--;

            if(count==0){
                maj=arr[i];
                count=1;
            }

        }
        return maj;
    }
    public static void main(String[] args) {
        System.out.println(majorityele(new int[]{2,2,3,3,3,2,2,3,3}));
    }
}
