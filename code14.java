// print pyramid of 0 and 1
public class code14 {
    public static void main(String[] args) {
        int b =1;
        int n = 30;
        for( int i=0; i<n; i++){
            for(int j =0; j<i+1;j++){
                int sum =i+j;
                if(sum %2 ==0){
                System.out.print(1);
                System.err.print(" ");}
                else
                System.err.print(0);
                System.err.print(" ");
                
            }
        System.out.println();}
    }
    
}
