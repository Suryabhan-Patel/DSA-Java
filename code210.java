public class code210 {
    public static int exceptone(int [] arr){
        int xor = arr[0];
        for(int i = 1 ; i < arr.length;i++){
            xor=xor^arr[i];

        }
        return xor;
    }
    public static void main(String[] args) {
        System.out.println(exceptone(new int[]{2,3,2,4,3}));
    }
}
