public class code107 {
 public static String el(String s){
    int low=0;
    int high = s.length-1;
    while(low<high){
        char temp = s.charAt(low);
        s.charAt(low)=s.charAt(high);
        s.charAt(high)=temp;
        low++;
        high--;}
    return s;
 }
    public static void main(String[] args) {
        String s = "suryabhan";
        System.out.println(el(s));
    }
    
}
