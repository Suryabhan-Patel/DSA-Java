// number hashing 
public class code63 {
    public static int freq( int []arr, int number){
        int []hash = new int[13];
        for(int i = 0 ; i  <arr.length; i++ ){
            hash[arr[i]] += 1;
        }
        return hash[number];

    }
    public static void main(String[] args) {
        int []arr={ 1,2,3,4,3,3,3,4,5,6,7,8,9,0,12,4,5,6,2,3,5,6};
          for(int i =0; i < arr.length; i++){
            System.out.println(i+" = "+ freq(arr, i));
          }
    }
    
}
