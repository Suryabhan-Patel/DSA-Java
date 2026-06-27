// solid rhombus
public class code16 {
    public static void main(String[] args) {
        int n = 5;
        for( int  i =0; i <n; i++){
            for(int j =0; j<n-i; j++){
                System.err.print(" ");
            }
            for( int j = 0; j<n;j++){
                System.err.print("*");
            }
            System.err.println();
        }
    }
}
