import java.util.*;
public class code274{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr= new int[n];
        for(int i=0 ; i < n ;i++){
            arr[i]=sc.nextInt();
        }
        int ans=arr[0];
        int be=arr[0];
        int low=0;
        int high=0;
        int templow=0;
        for(int i=1;i< n;i++){
            if(arr[i]>arr[i]+be){
                templow=i;
            }
            
             be=Math.max(be+arr[i],arr[i]);
            if(be>ans){
                low=templow;
                high=i;
            }
             ans=Math.max(ans,be);
        }
        int neg=0;
        for(int i=low;i<=high;i++){
            if(arr[i]<0) neg++;
        }
        System.out.println(ans);
        System.out.println("no of neg are "+ neg);
        sc.close();
    }
}