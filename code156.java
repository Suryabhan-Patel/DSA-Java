public class code156 {
    public static void fabonnci(int n){
        int first = 0;
        int second = 1;
        System.out.print(first +" ");
        System.out.print(second +" ");
        int i = 2;
        while(i <n){
            int third= first+second;
            first=second;
            second=third;
            System.out.print(third +" ");
            i++;
        }

    }
    public static void main(String[] args) {
        fabonnci(10);
    }
    
}
