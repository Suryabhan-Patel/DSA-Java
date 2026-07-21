class code257 {
    public boolean isPalindrome(String s) {
        int low=0;
        int high= s.length()-1;
        while(low<high){
            while(low<high&& !Character.isLetterOrDigit(s.charAt(low))){
                low++;
            }
            while(low<high &&!Character.isLetterOrDigit(s.charAt(high))){
                high--;
            }
            if(Character.toLowerCase(s.charAt(high))!=Character.toLowerCase(s.charAt(low))){
                return false;
            }
        high--;
        low++;}
    
    return true;}
}