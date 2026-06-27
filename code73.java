// move all the zero to the end of the aaray
public class code73 {
    public static int[] zero(int []arr){
        int pos= 0;
        for(int i = 0 ; i  <arr.length; i++){
            if(arr[i]!=0){
              arr[pos]=arr[i];
              pos++;
            }}
            while(pos<arr.length){
                arr[pos]=0;
                pos++;
            }
            return arr;
        }
        public static void main(String[] args) {
            int[] arr={1,0,0,9,4,5,6,8,0,9,8};
            zero(arr);
            for(int i =0; i<arr.length; i++){
                  System.out.println(arr[i]);
            }
        }
    }

