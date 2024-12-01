package HashMap;

import java.util.HashSet;

public class Union {
    public static void union(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set);

    }
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7,3 ,4, 1};
        int[] arr2 = {8, 9, 2, 1 , 5 ,10};
        union(arr1, arr2);
    }
}
