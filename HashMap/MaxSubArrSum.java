package HashMap;

import java.util.HashMap;

public class MaxSubArrSum {
    public static int maxLength(int arr[], int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen, i+1);
            }
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int len = i-map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;

    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3 , 1,1,1, 1, 3, 3};
        
        System.out.println(maxLength(arr, 3));
        
    }
}
