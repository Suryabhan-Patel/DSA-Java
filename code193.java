public class code193 {
    public static boolean perfectnumner(int n ){
        int sum=0;
          for(int i = 1; i*i<=n;i++){
            if(i*i==n){ sum=sum+i;
            System.out.println(sum);}
            else{
                if(n%i==0){
                    sum=sum+i;
                    sum=sum+n/i;
                    System.out.println(i+" and"+n/i);
                    System.out.println(sum);
                }
            }
            
          }
          System.out.println(sum);
    return sum-n==n; }
    public static void main(String[] args) {
        System.out.println(perfectnumner(28));

        
    }
}

    

