public class code240 {
    public static void main(String[] args) {
        int count=0;
        int j =2;
        int sum=0;
        boolean isprime=false;

        while(count!=10){
             isprime=true;;
             for(int i = 2; i <=Math.sqrt(j);i++){
                if(j%i==0){
                    isprime=false;
                    break;
                }
             }
             if(isprime){
                System.out.println(j);
                sum=sum+j;
                count++;
             }
             j++;
        }
        System.out.println(sum);
    }
    
}
