public class code202{
    public static int maxsumonedel(int[] arr){
        int endmaxsum=arr[0];
        int onedel=0;
        int maxsum=Math.max(endmaxsum,onedel);
        for(int i =1; i < arr.length;i++){
            int lastend=endmaxsum;
            endmaxsum= Math.max(arr[i],endmaxsum+arr[i]);
            System.out.println(endmaxsum);
            onedel= Math.max(onedel+arr[i],lastend);
            System.out.println();
            System.out.println(onedel);
            System.out.println();

            maxsum=Math.max(maxsum,Math.max(endmaxsum, onedel));
            System.out.println(maxsum);
        }
return maxsum;
}
public static void main(String[] args) {
    System.out.println(maxsumonedel(new int[]{1, -2, 0, 3}));
}
}