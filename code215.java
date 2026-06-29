public class code215 {
    public static int stid(int[] studentid, int[] score, int x, int k){
        int times=0;
        int index=-1;
        for(int num: score){
            if(num==x) times++;
        }

        if(times>=k){
            for(int i=0; i < studentid.length;i++){
                if(score[i]==x) times--;
                if(times==0){
                    index=i;
                    break;
                }
            }
        }
     if(index!=-1) return studentid[index];
    return index;}

    public static void main(String[] args) {
        System.out.println(stid(new int[]{101,102,103,104,105},new int[]{80,90,80,70,80},80,2));
    }
    
}
