package Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static int[] removeDup(int arr[]){
        int j=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return Arrays.copyOf(arr, j);
    }
    public static void main(String[] args) {
        int arr[] = {11, 22, 22, 33, 44, 66};
        int temp[] = removeDup(arr);
        for (int i = 0; i < temp.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
