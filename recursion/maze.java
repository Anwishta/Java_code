package recursion;

import java.util.Scanner;

public class maze {
    public static int mazes(int i, int j, int m, int n) {

        if (i == m || j == n) {
            return 0;
        }
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        int rightways = mazes(i, j + 1, m, n);
        int downways = mazes(i + 1, j, m, n);
        return rightways + downways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int totalpaths = mazes(0, 0, m, n);
        System.out.println(totalpaths);
        sc.close();
    }
}
