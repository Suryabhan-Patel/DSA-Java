import java.util.Stack;

public class code239 {
    public static int[] previoussmaller(int[] arr){
        int []res = new int[arr.length];
        Stack<Integer> st = new Stack<>();
    st.push(arr[0]);
    res[0]=-1;
    for(int i =1 ; i < arr.length;i++){
        if(st.peek()<arr[i]){
            res[i]=st.peek();
            st.push(arr[i]);
            continue;
        }
        else{
              while(!st.isEmpty() && st.peek()>=arr[i]) st.pop();
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
    
    return res;}

    public static void main(String[] args) {
        int [] arr = previoussmaller(new int[]{1,2,4,4,5});
        for(int num: arr) System.out.println(num); 
    }
}
