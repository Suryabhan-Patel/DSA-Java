public class code116 {
    public static void main(String[] args) {

        for(int i=0;i<7;i++){
             int val =(i%2==0)?1:0;
            for(int j=0;j<=i;j++){
                System.out.print(val);
             if(val==1)
                val=0;
            else
                val=1;}
              
        System.out.println();}

        for(int i =0;i<7;i++){
            int val =(i%2==0)?0:1;
            for(int j =0;j<=7-i-1;j++){
                   System.out.print(val);
             if(val==1)
                val=0;
            else
                val=1;}
        System.out.println();}
    }}
    
    
