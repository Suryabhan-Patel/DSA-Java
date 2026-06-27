import java.util.Stack;

public class code204{
    public static int[] nextgreater(int[] arr){
           Stack<Integer>st = new Stack<>();
           int[] res = new int[arr.length];
           res[res.length-1]=-1;
           st.push(arr[arr.length-1]);

           for(int i = arr.length-2; i >=0;i--){
            if(st.peek()>arr[i]){
                res[i]=st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()<=arr[i]){
                         st.pop();
                }
                if(st.isEmpty()){
                    res[i]=-1;
                    st.push(arr[i]);
                }
                else{
                    res[i]=st.peek();
                    st.push(arr[i]);
                }
            }
           }

    return res;}
    public static void main(String[] args) {
        int [] ans = nextgreater(new int[]{2,1,9,3,6,8,1});
        for(int num: ans){
            System.out.println(num);
        }
    }
}