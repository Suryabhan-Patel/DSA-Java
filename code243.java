import java.util.*;

public class code243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        String s= sc.nextLine();
        String []arr =s.split(" ");
        
        Stack<Integer> st = new Stack<>();
        for(int i =0; i < N;i++){
            if(arr[i].equals("*")){
               int a = (st.pop());
               int b =(st.pop());
               int c =b*a;
               st.push(c);
            }
            else if(arr[i].equals("+")){
               int a = (st.pop());
               int b =(st.pop());
               int c =b+a;
               st.push(c);
            }
            else if(arr[i].equals("/")){
               int a = (st.pop());
               int b =(st.pop());
               int c =b/a;
               st.push(c);
            }
            else if(arr[i].equals("-")){
               int a = (st.pop());
               int b =(st.pop());
               int c =b-a;
               st.push(c);
            }
            else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        System.out.println(st.pop());
        sc.close();
    }
    
}
