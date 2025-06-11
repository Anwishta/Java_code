package Array;

public class SumOfTwo {
    public static void main(String[] args) {
        int arr1[] = new int[]{3, 5, 7, 5, 3};
        int arr2[] = new int[]{5, 7, 9 ,1 , 4};
        int sum[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sum.length-1;
        int c = 0;
       while (k >= 0) {
        int d = c;
        if (i >= 0) {
            d += arr1[i];
        }
        if (j >= 0) {
            d += arr2[j];
        }
        
        c = d / 10;
        d %= 10;
        sum[k] = d;
        i--;
        j--;
        k--;
    
       }
       if (c != 0) {
        System.out.print(c);
       }
       for (int val : sum) {
        System.out.print(val);
       }
    }
}
