public class code134 {
    
    public static void main(String[] args) {
        int count1=1;
        int count2=1;
        for(int i = 0 ; i <  5 ; i++){
            count2=1;
            
            for(int  j = 0; j < 5 ; j++){
                System.out.print(count1);
                System.out.print(count2);
                System.out.print(" ");
                count2++;
            }
            count1++;
            System.out.println();
        }
    }
}
