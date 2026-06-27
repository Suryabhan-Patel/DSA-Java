import java.util.Arrays;

public class code127 {
  public static  int removeduplicate(int[]arr){
       Arrays.sort(arr);
        int low=0;
        int high= low+1;
        while(high<arr.length){
            if(arr[low]==arr[high]){
                high++;
            }
            else{
                arr[low+1]=arr[high];
                low++;
                high++;
            }
        }
    return low+1;}
public static void main(String[] args) {
    int[]arr={1,-1,3,3,-2,4,5,5,0};
    int n =removeduplicate(arr);
    String s= "SUTYAB @:<,,,BHAN";
    System.out.println(s.charAt(15)-'A');
       System.out.println(s.toLowerCase());
       String t = s.toLowerCase();
    for(int i =0 ; i < n;i++){
        System.out.println(arr[i]);
    }
}
    
}
