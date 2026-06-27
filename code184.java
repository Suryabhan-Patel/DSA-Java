public class code184 {
    public static boolean palin(String s){
        int low=0;
        int high= s.length()-1;
        int ex=0;
        while (low<high) {
            if(s.charAt(high)==s.charAt(low)){
                low++;
                high--;
            }
            else {
                ex++;
                   if(s.charAt(low+1)==s.charAt(high)){
                    low++;}
                    else if(s.charAt(high-1)==s.charAt(low)){
                        high--;
                    }
                   }
                   if(ex>1) return false;
            }
        
            return true;

            
        }
        public static void main(String[] args) {
            System.out.println(palin("abca"));
        }
    }
    

