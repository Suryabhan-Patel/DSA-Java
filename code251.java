public class code251 {
    public int lengthOfLastWord(String s) {
        int count=0;
        int high=s.length()-1;
         while(s.charAt(high)==' '){
            high--;
         }
        for(int i=high ; i>=0;i--){

            if(s.charAt(i)==' '){
                break;
            }
            count++;

        }
        return count;
    }
} {
    
}
