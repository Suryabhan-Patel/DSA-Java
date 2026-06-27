//next smaller 

import java.util.*;

public class code207{
    public static int[] nextsmaller(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] res = new int[arr.length];
        st.push(arr[arr.length-1]);
        res[arr.length-1]=-1;
        for(int i =  arr.length-2;i>=0;i--){
            if(st.peek()<arr[i]){ res[i]=st.peek();
                st.push(arr[i]);
            }
            else{
                while(!st.isEmpty() && st.peek()>=arr[i]){
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
        int[] arr= nextsmaller(new int[]{1,2,1,9,1,5,4});
        for(int num : arr){
            System.out.println(num);
        }

    }
}