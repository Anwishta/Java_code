package HashMap;

import java.util.HashSet;

public class Intersection {
    public static int intersection(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++){
            if(set.contains(arr2[j])){
                
                count++;
                set.remove(arr2[j]);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7,3 ,4, 1};
        int[] arr2 = {8, 9, 2, 1 , 5 ,10};
        int res =  intersection(arr1, arr2);
        System.out.println(res);
    }
}
