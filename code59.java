// find missimg value in a sequence 
public class code59 {
    public static int missingno(int []arr){
        int n= arr.length+1;
        int total =  n*(n+1)/2;
        int sum =0;
        for( int num: arr){
            sum+=num;
        }
        return total-sum;

    }
    public static void main(String[] args) {
        int []arr={1,5,4,3};
        System.out.println(arr.length);
        System.out.println(missingno(arr));
    }
}
