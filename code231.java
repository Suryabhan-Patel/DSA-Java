import java.util.HashMap;
import java.util.Scanner;

public class code231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        String s = sc.nextLine();
        for(char num: s.toCharArray()){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        char c = sc.nextLine().charAt(0);
        System.out.println(map.get(c));
    sc.close();}
    
}
