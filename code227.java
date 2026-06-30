import java.util.Scanner;

public class code227{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int R= sc.nextInt();
      int C= sc.nextInt();
      int countone=-1;
      int rowindex=-1;
      int maxone=-1;
      int res[][]= new int[R][C];
      for(int i=0; i<R ;i++){
        for(int j=0; j<C;j++){
            res[i][j]= sc.nextInt();
 }}

      for(int k=0;k<R;k++){
        countone=0;
        for(int l =0;l<C;l++){
            if(res[k][l]==1){
                countone++;
            }}
            if(countone>maxone){
                rowindex=k;
                maxone=countone;
            }
        
      }
      System.out.println(rowindex);
sc.close();
      }
    }
