// find intersection of an array
import java.util.*;
 public class code62{
    public static ArrayList<Integer> inter(int arr1[],int arr2[]){
        ArrayList<Integer> list = new ArrayList<>();
     for(int i = 0; i<arr1.length; i++){ 
        for(int j = 0 ; j < arr2.length;j++){
            if(arr1[i] == arr2[j]){
            list.add(arr1[i]);
            }
        }}
        return list;}
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int [] arr2= {3,4,5,6,7};
        ArrayList<Integer> li =new ArrayList<>();
        li =inter(arr, arr2);
        for(int num: li){
            System.out.println(num);
        };
        }

    }

