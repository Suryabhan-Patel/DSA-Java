class code153{
    public static int reverse(int n){
        int result=0;
        double power = String.valueOf(n).length()-1;
        while(n>0){
            int rem = n%10;
            int place= (int)Math.pow(10,power)*rem;
            result= result+place;
            power--;
            n=n/10;
        }
        return result;
        
        

    
}
public static void main(String[] args) {
    System.out.println(reverse(1234));
}}