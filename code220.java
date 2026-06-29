import java.util.*;
public class code220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int countstar=0;
        int counhash=0;
        for(int i=0; i < s.length();i++){
            if(s.charAt(i)=='*') countstar++;
            else counhash++;
        }

        if(counhash>countstar){
            System.out.println(countstar-counhash);}
        if(countstar>counhash) System.out.println(countstar-counhash);
        if(counhash==countstar) System.out.println(0);


    }
    
}
