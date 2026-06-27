// find container with most water
public class code102 {
   
    public static int area(int[]arr){
         int max = Integer.MIN_VALUE;
        int i = 0 ; 
        int j = arr.length-1; 
        while(i<j){
            int width = j-i;
            int height= Math.min(arr[i], arr[j]);
            int Area = width*height;
            if(Area>max){
                max = Area;}
           if(arr[i]<arr[j])
                  i++;
           else if(arr[i]>arr[j]){
            j--;}
            else{
                i++;
                j--;}

           

        }

    return max;}
    
}
