public class code200 {
  public static int secondlar(int[] arr){
    int largest=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    for(int num:arr){
        if(num>largest) largest=num;
    }
    for(int num:arr){
        if(num>second&&num<largest) second=num;
    }
    if(second!=Integer.MIN_VALUE) return second;
    return -1;
  }
  public static void main(String[] args) {
    System.out.println(secondlar(new int[]{8,8}));
  }
}