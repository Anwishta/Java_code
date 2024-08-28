package recursion;

import java.util.Scanner;

public class PrintSum {
    public static int printSum(int n){
        if(n==0) return 0;
        return n + printSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = printSum(n);
        System.out.println(res);
        sc.close();
    }
}
