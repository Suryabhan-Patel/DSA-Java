public class code192 {
    public static int countfactor(int n){
int count=0;
        for(int i =1 ; i *i<=n ;i++){
             if(n/i==i) count++;
             else{
            if(n%i==0) count=count+2;}
            
            
        }
    
    return count;} 
public static void main(String[] args) {
    System.out.println(countfactor(3));
}}
