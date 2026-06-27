// palindore numbers
public class code18 {
    public static void main(String[] args) {
        int n =5;
        for(int i =0; i <n; i++){
            for(int j =0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j =i+1; j>0;j--){
                System.out.print(j);
            }
            if(i!=0){
             for(int j=2;j<=i+1;j++){
            System.err.print(j);}}

            System.err.println();
        }
       
        }
        
    }
    

