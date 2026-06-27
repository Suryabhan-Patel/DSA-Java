public class code167 {
    public static StringBuilder reverse(String s){
        StringBuilder res = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--){
            res.append(s.charAt(i));
        }
        return res;

    }
    public static void main(String[] args) {
        String s = "AJAY";
     System.out.println(reverse(s));
    }
    
}
