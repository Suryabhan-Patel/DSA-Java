public class code119 {
    public static void main(String[] args) {
        String s ="sutyabhan";
        int countvowels=0;
        int countconstant=0;
        for(int i =0; i <s.length();i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                countvowels++;
            else
                countconstant++;}
            System.out.println("there are total"+countvowels+"in a string");
            System.out.println("there are total"+countconstant+"in a string");
        
    }
    
}
