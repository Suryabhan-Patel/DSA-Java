public class code118{
    public static void main(String[] args) {
        int n =7;
        int first=1;
        int second=1;
        int third;
        System.out.print(first);
        System.out.print(" ");
        System.out.print(second);
        for(int i =3;i<=n;i++){
              third=first+second;
              System.out.print(" ");
              System.out.print(third);
              first=second;
              second=third;
              
        }
    }
    
}
