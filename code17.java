// pyramid pattern numbers
public class code17 {
    
    public static void main(String[] args) {
        int count =1;
        int  n =9;
        for(int i =0; i<n; i++){
            for(int j =0;j<n-i;j++){
                System.err.print(" ");
            }
            for(int j = 0; j <i+1; j++){
                System.err.print(count);
                System.out.print(" ");
            }
            count++;
            System.err.println();
        }
    }
}
