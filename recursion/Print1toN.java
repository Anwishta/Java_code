package recursion;

import java.util.Scanner;

public class Print1toN {
    public static void printNum(int n){
        if(n==0) return;
        printNum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNum(n);
        sc.close();
    }
}
