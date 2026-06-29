import java.util.Scanner;

public class code219 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp= s;
        int sum=0;
        int len = s.length();
        while (len>1) {
            int n = Integer.parseInt(temp);
             sum=0;
            while(n>0){
              sum=sum+n%10;
                n= n/10;
            }
            temp= Integer.toString(sum);
            len=Integer.toString(sum).length();

            }
            System.out.println(temp);
    sc.close();}
}
