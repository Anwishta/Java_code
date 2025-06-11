public class AnyToDecimal {
    public static int anyToDecimal(int n, int b, int tb){
        int p = 1, ans = 0;
        while (n != 0) {
            int r = n%tb;
            n /= tb;
            ans += r*p;
            p *= b;
        }
        return ans;
    }
    public static void main(String[] args) {
        int ans = anyToDecimal(1100, 2, 10);
        System.out.println(ans);
    }
}
