public class code141 {
public static int[] prefix_sum(int []arr){
    int[] result= new int[arr.length];
    int sum=0;
    result[0]=0;
    for(int i = 0 ; i < arr.length;i++){
        sum=0;
        for(int j =0;j<i;j++){
            sum=sum+arr[j];
        }
        result[i]=sum;
    }
 return result;}
    
}
