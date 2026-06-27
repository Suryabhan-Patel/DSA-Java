// butterfly patterns
public class code15 {
    public static void main(String[] args) {
        int n =10;
        for(int i =0; i<n;i++){
            for(int j =0;j<i+1;j++){
                System.err.print("*");
            }
            for(int k =0; k<((n-1)*2-2*i);k++){
                System.err.print(" ");
            }
            for(int m=0; m<i+1; m++){
                System.err.print("*");
            }
         System.err.println();}
         for(int i =0; i<n;i++){
           // if(i !=0){
            for(int j =0;j<n-i;j++){
                System.err.print("*");
            }
            for(int j =1; j<=2*i;j++){
                System.err.print(" ");
            }
            for(int j =0; j<n-i;j++){
                System.err.print("*");
            }
            System.err.println();//}
         }
    }
    
}
