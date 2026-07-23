class code260 {
    public boolean ispalindrome(String d){
        int low=0;
        int high=d.length()-1;
        while(high>low){
            if(d.charAt(low)!=d.charAt(high)) return false;
            high--;
            low++;
        }
    return true;}
    public String longestPalindrome(String s) {
         if(s.length()==1) return s;
        String res= new String();
        res= s.substring(0,1);
        int maxi=Integer.MIN_VALUE;
        for(int i = 0 ; i < s.length();i++){
            for(int j = i+1; j < s.length();j++){
                if(ispalindrome(s.substring(i,j+1))){
                    if(j-i>=maxi){
                        maxi=j-i;
                        res=s.substring(i,j+1);
                    }
                }
            }
        }
        return res;
    }
}