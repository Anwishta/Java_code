package Array;
public class Span{
    public static void main(String[] args) {
        int arr[] = new int[]{22, 44, 55, 11, 1};
        int min = arr[0];
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int res = max - min;
        System.out.println(res);
    }
}