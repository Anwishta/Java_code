package Array;

public class SubTwoArr {
    public static void main(String[] args) {
        int arr1[] = new int[]{2, 5, 6, 4, 8};
        int arr2[] = new int[]{5, 6, 4, 8};
        int sub[] = new int[arr1.length > arr2.length ? arr1.length : arr2.length];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = sub.length-1;
        int c = 0;
        while (k >= 0) {
            int d = 0;
            d += c;
            if (arr1[i] > arr2[j]) {
                c = 0;
                d = arr1[i] - arr2[j];
            } else {
                c = -1;
                d = arr1[i] + 10 - arr2[j];
            }
            sub[k] = d;
            i--;
            j--;
            k--;
        }
       
        for (int l : sub) {
            System.out.print(l);
        }
    }
}
