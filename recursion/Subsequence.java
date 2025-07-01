import java.util.ArrayList;

class Subsequence{
    public static void sub(int arr[], ArrayList<Integer> l, int idx, int n){
        
        if(idx >= n){
            System.out.println(l);
            return;
        }
        l.add(arr[idx]);
        sub(arr,l, idx+1, n);
        l.remove(l.size()-1);
        sub(arr,l, idx+1, n);

    }
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        int arr[] = new int[]{3, 1, 2};
        sub(arr,l, 0, 3);

    }
}