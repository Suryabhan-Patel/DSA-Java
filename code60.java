// shift al the zerso in end of the array
public class code60 {
public static int[] shift(int [] arr){
    int pos= 0;
    for(int i = 0; i  <arr.length ; i++){
        if(arr[i]!=0){
         arr[pos]=arr[i];
         pos++;
        }}
        for(int j=pos; j<arr.length;j++){
             arr[j]=0;
        }
        return arr;}
        public static void main(String[] args) {
            int [] arr ={1,2,3,0,0,78,9,9,0};
            shift(arr);
            for(int num: arr){
                System.out.println(num);
            }
        }
}