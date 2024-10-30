package recursion;
import java.util.Scanner;
public class MinMax {
    public static int[] array(int []arr){
        int n = arr.length;
        int min=0, max=0;
        for(int i=0; i<n; i++){
            if(arr[i]<arr[min]){
                min = i;
            }
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return new int[]{arr[min], arr[max]};
    }
    public static void main(String[] args){
        System.out.println("Enter number elements of the array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        int []minmax = array(arr);
        for(int i=0; i<minmax.length; i++){
            System.out.println(minmax[i]);
        }
        sc.close();
    }
}