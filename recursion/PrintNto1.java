package recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void printNum(int n){
        if(n==0) return;
        System.out.println(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
        sc.close();
    }
}
