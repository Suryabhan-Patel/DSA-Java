import java.util.Scanner;

public class code218 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();

        if(s.startsWith("{") && s.endsWith("}")){
            s = s.substring(1, s.length()-1);
        }

        String []ch = s.split(",");
        int [] arr = new int[ch.length];
        for(int i =0; i < arr.length;i++){
            arr[i]=Integer.parseInt(ch[i]);
        }
        for(int num: arr) System.out.print(num+" ");
        sc.close();;
    }
    
}
