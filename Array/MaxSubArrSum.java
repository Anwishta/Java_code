package Array;

public class MaxSubArrSum {
    public static int maxLen(int arr[], int k){
        int maxLen = 0;
        int n = arr.length;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        while(right<n){
            while(left <= right && sum > k){
                sum -= arr[left];
                left++;
            }
            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }
            right++;
            if(right<n){
                sum += arr[right];
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        /**
         * Example usage of maxLen.
         * 
         * Input array {1, 2, 3 , 1,1,1, 1, 3, 3}
         * Target sum 3
         * Max length of such subarray is 3
         */
        int arr[] = {1, 2, 3, 1, 1, 1, 1, 3, 3};
        
        System.out.println(maxLen(arr, 3));
    }
}
