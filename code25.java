// arrays in java 
import java.util.Scanner;
public class code25 {
    public static void percent(int[] marks,int n){
         int sum =0;
     for(int i =0; i <n; i++){
        sum = sum+marks[i];
     }
     int avg= (sum/n);
     System.err.println(" the perctange of the  student is "+ avg + "% ");
    
    }
    
    public static void main(String[] args) {
        String[] subjects= new String[5];
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i<5;  i++){
            System.out.println(" enter the name of the sujects "+(i+1));
            subjects[i]= sc.nextLine();
            System.out.println(" enter the marks of the "+subjects[i]);
            marks[i]=sc.nextInt();
             sc.nextLine();

        }

        for(int i =0; i<5;i++){
            System.out.println(" marks in "+subjects[i]+" is "+ marks[i]);
        }

        percent(marks,5);

        
    }
}
