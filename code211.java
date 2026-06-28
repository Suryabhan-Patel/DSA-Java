public class code211 {
    public static void fabseries(int n){
        int first=0;
        int second=1;
        System.err.println(first);
        System.err.println(second);
        for(int i = 2 ;i <=n ;i++){
             int third=first+second;
             System.out.println(third);
             first=second;
             second=third;
        }
    }
    public static void main(String[] args) {
        fabseries(5);
    }
    
}
