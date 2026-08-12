public class code292{
    public static int fab(int n){
        if(n==1) return  1;
        if(n==0) return  0;
        else{
            int first = fab(n-1);
            int second=fab(n-2);
            return first+second;
        }

        
    }
    public static void main(String[] args) {
        System.out.println(fab(3));
    }

}