public class AnyBaseAddition {
    public static void main(String[] args) {
        int n1 = 11100, n2 = 10101, b = 2,  c = 0, ans = 0, p = 1;
        while (n1 != 0 || n2 != 0 || c>0) {
            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 /= 10;
            n2 /= 10;
            int d = r1 + r2 + c;
            c = d / b;
            d =d % b;
            ans += d*p;
            p *= 10;
        }
        System.out.println(ans);
    }
}
