package Array;

public class TargetSum {
    public static int[] target(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3, 2, 5};
        int temp[] = target(arr, 7);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
