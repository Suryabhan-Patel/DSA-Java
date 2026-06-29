import java.util.Scanner;

public class code223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        char []ch= new char[n];
        for(int i=0; i < ch.length;i++){
            ch[i]=sc.next().charAt(0);
        }
        char XOR=ch[0];
        for(int i=1;i < n;i++){
            XOR=(char)(XOR^ch[i]);
        }
        if(XOR!=0) System.out.println(XOR);
        else{System.out.println("ALL ARE EVEN");}
    }
    
}
