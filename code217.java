import java.util.*;
public class code217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String [] arr= s.split(" ");
        int[] nums = new int[n];
        for(int i =0 ; i < nums.length;i++){
            nums[i]=Integer.parseInt(arr[i]);
        }
        int first= Integer.MIN_VALUE;
        int second= Integer.MIN_VALUE;

        for(int i =0 ; i < nums.length;i++){
            if(nums[i]>first){
                second=first;
                first=nums[i];
            }
            else if(nums[i]>second && nums[i]!=first){
                second=nums[i];
            }
        }
    System.out.println(second);}
}