package Array;

public class BarChart {
    public static void main(String[] args) {
        int arr[] = new int[]{9, 5, 7, 1, 3, 6};
    int max = arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i] > max){
            max = arr[i];
        }
    }
    for(int k=max; k>=1; k--){
        for(int j=0; j<arr.length; j++){
            if (arr[j]>=k) {
                System.out.print(" * ");
            }else{
                System.out.print("   ");
            }
        }
        System.out.println();
    }
    }
}
