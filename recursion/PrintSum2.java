package recursion;

import java.util.Scanner;

public class PrintSum2 {
        public static void printSum(int i, int n, int sum){
            if(i==n){
                sum+=i;
                System.out.println(sum);
                return;
            }
            sum += i;
            printSum(i+1, n, sum);
        }
        public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(0, n, 0);
        sc.close();
    }
}
