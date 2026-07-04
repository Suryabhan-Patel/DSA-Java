import java.util.Arrays;
import java.util.Scanner;

public class code233 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();

        int[] freqs1= new int[26];
        int[] freqs2= new int[26];
        for(int num : s1.toCharArray()){
            freqs1[num-'a']++;
        }
        for(int num : s2.toCharArray()){
            freqs2[num-'a']++;
        }

        if(Arrays.equals(freqs1, freqs2)){System.out.println("yes true anagrams");}
        else{System.out.println("false anagrrams not present");}
        sc.close();
    }
    }
    

