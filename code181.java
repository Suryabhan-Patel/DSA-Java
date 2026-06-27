public class code181 {
    public static StringBuilder compre(String [] arr){
        StringBuilder res= new StringBuilder();
        for(int i = 0 ; i < arr[0].length();i++){
            for(int j =1 ; j < arr.length;j++){
                   if(i >= arr[j].length()){
                    return res;
                  }
                if(arr[j].charAt(i)==arr[0].charAt(i)){
                    
                }
                else{
                    return res;
                }
            }
           res.append(arr[0].charAt(i));
        }
    return res;}
    public static void main(String[] args) {
        String[] s ={"flower","flow","floweer"};
        System.out.println(compre(s));
    }
    
}
