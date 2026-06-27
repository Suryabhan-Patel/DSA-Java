// highest common factor 
public class code35 {
    public static void main(String[] args) {
        int n1=20;
        int n2 =40;
        int hcf =0;
        for(int i =1; i<=n1;i++){
           if(n1%i==0 && n2%i == 0){
            hcf=i;
           }
        }
    System.out.println(hcf+" is the highest common factor ");}
}
