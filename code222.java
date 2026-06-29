import java.util.HashMap;
import java.util.Scanner;

public class code222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //sc.nextLine();
        String s = sc.nextLine();
        String[] arr= s.split(",");
        HashMap<String,Integer> map = new HashMap<>();
        for(String ch: arr){
            map.put(ch, map.getOrDefault(ch,0 )+1);
        }
        boolean odd=false;
        for(int i = 0  ; i < arr.length;i++){
            if(map.get(arr[i])%2!=0){
                System.out.println(arr[i]);
                odd=true;
                break;
            }
        }
        if(!odd)System.out.println("ALL ARE EVEN");

        
        
        }

    }
    

