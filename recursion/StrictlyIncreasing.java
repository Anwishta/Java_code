package recursion;

public class StrictlyIncreasing {
    public static boolean strictlyIncreasing(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return strictlyIncreasing(arr, i+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int [] arr = new int[]{3, 6,7, 7,8};
        boolean t = strictlyIncreasing(arr, 0);
        System.out.println(t);
    }
}
