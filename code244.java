import java.util.*;
class Mystack{
 private Stack<Integer> st;


Mystack(){
    st= new Stack<>();}
public void push(String s){
     st.push(Integer.parseInt(s));
}
public int pop(){
    return st.pop();
}
public int evaluate(String[] s){
    for(String token : s){
        if(token.equals("*")|| token.equals("/")||token.equals("+")||token.equals("-")){
            int a = pop();
            int b = pop();
            int res=0;
            switch (token) {
                case "+":
                    res=b+a;
                    break;
                case "-":
                    res=b-a;
                    break;
                case "/":
                    res=b/a;
                    break;
                case "*":
                    res=b*a;
                    break;
                default:
                    break;
            }
            st.push(res);
        }
        else{
            st.push(Integer.parseInt(token));
        }
    }
return st.pop();}
}
public class code244 {public static void main(String[] args) {
     Mystack obj = new Mystack();
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     sc.nextLine();
     String s = sc.nextLine();
     String[] res = s.split(" ");
    System.out.println(obj.evaluate(res));
}

    
}
