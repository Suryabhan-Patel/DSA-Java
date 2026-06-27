// inverted pyramid
public class code10 {
public static void main(String[] args) {
    int n =10;
    for(int i =0; i<n;i++){
        for(int  j = 0; j<n-i;j++){
            System.err.print(" ");
        }
        for(int k =0;k <i+1;k++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
