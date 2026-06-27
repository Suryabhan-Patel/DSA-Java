//  maximum consecutive ones in an array
public class code79 {
    public static int maxone(int []arr){
        int max=0;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(max<count){
                    max=count;
                }}
            else
              count=0;  
            }
        return max;}
        public static void main(String[] args) {
            int[] arr={1,1,0,1,1,1,0,0,1};
            System.out.println(maxone(arr));
        }
    }
    

