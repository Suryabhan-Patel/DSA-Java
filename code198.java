public class code198 {
    public static int[] fabser(int n){
        if(n==2){
            return new int[]{0,1};
        }
        if(n==1) return new int[]{0};
        int [] ans = new int[n];
        ans[0]=0;
        int first = ans[0];
        int second= 1;
        ans[1]=1;
        for(int i= 2; i < n ; i++){
            int third= first+second;
            ans[i]=third;
            first=second;
            second=third;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr2= fabser(6);
        for(int i =0 ; i < arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    
}
