// 2d array
import java.util.Scanner;
public class code27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" row number ");
        int row= sc.nextInt();
        System.out.println("column number ");
        int col =sc.nextInt();
        int [][]arr1= new int[row][col];
        for(int i =0; i < row; i++){
            for(int j =0; j<col; j++){
                System.out.println("arr1  "+i +" "+j);
            arr1[i][j]= sc.nextInt();
            System.out.println();
            }
        }
    for(int i =0; i < row; i++){
        for(int j = 0;j< col; j++){
            System.out.print(arr1[i][j] +" ");
        }
        System.out.println();}    
    }
}
