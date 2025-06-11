import java.util.Scanner;

public class AnyBaseMult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int b = sc.nextInt();
        int res = mult(n1, n2, b);
        System.out.println(res);
        sc.close();
        
    }
    public static int mult(int n1, int n2, int b){
        int ans = 0, p = 1;
        while (n2 != 0) {
            int d2 = n2 % 10;
            n2 /= 10;
            int m = singleDigitMult(n1, d2, b);
            ans = sum(ans, m*p, b);
            p *= 10;
        }
        return ans;
    }
    public static int singleDigitMult(int n1, int d2, int b){
        int c = 0, p = 1, ans = 0;
        while(n1 != 0 || c > 0){
            int r = n1 % 10;
            n1 /= 10;
            int d = r*d2 + c;
            c = d / b;
            d = d % b;
            ans += d*p;
            p *= 10;
        }
        return ans;
    }
    public static int sum(int n1, int n2, int b){
        int c = 0, p = 1, ans = 0;
        while (n1 != 0 || n2 != 0 || c > 0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int d = r1 + r2 + c;
            c = d / b;
            d = d % b;
            ans += d * p;
            p *= 10;
        }
        return ans;
    }
}
