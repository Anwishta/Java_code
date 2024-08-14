import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Enter the %d number: ", i + 1);
            arr[i] = sc.nextInt();
        }
        sc.close();

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.printf("The maximum number in the array is: %d",max);
    }
}

