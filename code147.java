public class code147{

 public static boolean ispalindrome(String s1){
     String s=s1.toLowerCase();
    int low=0;
    int high = s.length()-1;
    while(high>low){
        char ch1= s.charAt(low);
        char ch2= s.charAt(high);

        while(!Character.isAlphabetic(ch1)){
            low++;
            ch1=s.charAt(low);
        }
        while ((!Character.isAlphabetic(ch2))) {
            high--;
            ch2= s.charAt(high);
        }

        if(ch1!=ch2){
            return false;
        }
        else{
            low++;
            high--;
        }
    }
 return true;
}
public static void main(String[] args) {
    String s ="A man, a plan, a canal: Panama";
    System.err.println(ispalindrome(s));
}
}