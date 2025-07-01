import java.util.ArrayList;

public class SubsequenceSum {
    public static void sumK(int arr[], ArrayList<Integer> l, int idx, int sum, int n, int k){
        if(idx >= n){
            if(sum == k){
                System.out.println(l);
            }
            return;
        }
        l.add(arr[idx]);
        sum += arr[idx];
        sumK(arr, l, idx+1, sum, n, k);
        l.remove(l.size()-1);
        sum -= arr[idx];
        sumK(arr, l, idx+1,sum,  n, k);
    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int arr[] = new int[]{1, 2, 1};
        sumK(arr, l, 0, 0, 3, 2);
    }
}
