public class code148{
    public static String reverse_vowel(String s){
        int low =0;
        int high=s.length()-1;
        while (low<high) {
            while(s.charAt(low)!='a'||s.charAt(low)!='e'||s.charAt(low)!='i'||s.charAt(low)!='o'||s.charAt(low)!='u'){
                low++;
            }
            while(s.charAt(high)!='a'||s.charAt(high)!='e'||s.charAt(high)!='i'||s.charAt(high)!='o'||s.charAt(high)!='u'){
                high--;
            }

            char chlo=s.charAt(low);
            char chhi=s.charAt(high);


            char temp = chlo;
            chlo=chhi;
            chhi=temp;
            low++;
            high--;

    
        }
    return s;}
public static void main(String[] args) {
    String s ="hello";
    System.out.println(reverse_vowel(s));
}
}