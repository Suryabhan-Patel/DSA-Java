// better approach for finding a number that appears only onces and others is appearing two times 
public class code81 {
    public static int find(int[] arr){
        int max = 0;
        for(int i =0; i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }
        int []hash =new int[max+1];
        for(int i = 0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        for(int i =0 ;i <hash.length;i++){
              if(hash[i]==1)
              return i;
        }
        return-1;
    }
    public static void main(String[] args) {
        int[]arr={1,1,2,3,3,4,4};
        System.out.println(find(arr));
    }
}
