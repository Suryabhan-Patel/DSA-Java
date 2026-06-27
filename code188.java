public class code188 {
public static StringBuilder longestcommonprefix(String[] arr){
    StringBuilder res = new StringBuilder();
    for(int i = 0 ; i < arr[0].length();i++){
        for(int j = 1; j < arr.length;j++){
            if(arr[j].length()<=i) return res;
            else if(arr[j].charAt(i)!=arr[0].charAt(i)) return res;
        }
        res.append(arr[0].charAt(i));
    }
    return res;
}    
public static void main(String[] args) {
    System.out.println(longestcommonprefix(new String[]{"flower","flavour","flow"}));
}
}
