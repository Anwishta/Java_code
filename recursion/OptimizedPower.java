package recursion;

import java.util.Scanner;

public class OptimizedPower {
    public static int power(int b, int p){
        if(p==0) return 1;
        if(p%2 == 0){
            return power(b, p/2)*power(b, p/2);
        }else{
            return b*power(b, p/2)*power(b, p/2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the base: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the power: ");
        int b = sc.nextInt();
        int res = power(a, b);
        System.out.println(res);
        sc.close();
    }
}
