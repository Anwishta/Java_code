import java.util.Scanner;

public class DecimalToAny {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int ans = 0, p =1;
        while(n != 0){
            int r = n % b;
            n /= b;
            ans += r*p;
            p *= 10;
            
        }
        System.out.println(ans);
    }
}
