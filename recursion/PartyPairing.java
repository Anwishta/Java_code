package recursion;

public class PartyPairing {
    public static int guest(int n){
        if(n<=1){
            return 1;
        }
        //single guest
        int way1 = guest(n-1);
        //guest in pairs
        int way2 = (n-1)*guest(n-2);
        return way1+way2;
    }
    public static void main(String[] args) {
        int res = guest(4);
        System.out.println(res);
    }
}
