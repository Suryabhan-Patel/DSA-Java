// prefix numbers
public class code132 {
    public static int[] prefixsum(int arr[]){
         int prefixsum1[] = new int[arr.length];
         prefixsum1[0]=0; 
         int sum = 0 ;
         System.out.println(" the prefix sum for index  0 is 0");
                 
            for(int i = 0 ; i < arr.length-1; i++){
                sum=sum+arr[i];
                 System.out.println(" the prefix sum for index "+ (i+1)+" is "+ sum);
                 
                 prefixsum1[i+1]=sum;
            }
    return prefixsum1;}
 public static void main(String[] args) {
    int[] arr = { 1,2,1,2};   
    int[] newarr= prefixsum(arr);    
    for(int i = 0; i < newarr.length;i++){
        System.out.println(newarr[i]);
    }
 }}
