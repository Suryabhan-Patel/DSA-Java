// longest sub array wit sum =k , (positive)
public class code82 {
    public static int longestsubarray(int []arr,int k){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int j =i;
            int count =0;
            int sum =0;
            while (sum<k) {
                sum=sum+arr[j];
                j++;
                count++;
                max =Math.max(count, max);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,4,2,3};
             System.out.println(longestsubarray(arr, 3));}
    
}
