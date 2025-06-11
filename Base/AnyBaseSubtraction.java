public class AnyBaseSubtraction {
    public static void main(String[] args) {
        int n1 = 1000, n2 = 50,c =0, b = 10, p = 1, ans = 0;
        while(n1 > 0 ){
            int r1 = n1 % 10;
            n1 /= 10;
            int r2 = n2 % 10;
            n2 /= 10;
            r1 += c;
            int d = 0;
            if (r1>= r2) {
                c = 0;
                d = r1 - r2;
            }else{
                c = -1;
                d = r1 + b - r2;
            }
            ans += d*p;
            p *= 10;
        }
        System.out.println(ans);
    }
}
