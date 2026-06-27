// rearranging 0 ,1 and 2 in place
public class code98 {
public static int[] rearrange(int[]arr){
    int high=arr.length-1;
    int low=0;
    for(int i =0; i < arr.length; i++){
        if(arr[i]==0){
            arr[low]=0;
            low++;
        }
        else if(arr[i]==2){
            arr[high]=2;
            high--;
        }
        else 
            continue;
    }
    for(int i = low; i <=high;i++){
        arr[i]=1;
    }
return arr;}
    
public static void main(String[] args) {
    int[] arr1 ={1,2,2,1,0,1,2,2,1,0,0,2,1,0,1,2,2};
    int[] arr2= rearrange(arr1);
    for(int i = 0 ; i  < arr2.length; i++){
        System.out.println(arr2[i]);
    }
}}
