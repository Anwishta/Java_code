package recursion;
public class TowerOfHanoi {
    public static void tower(int n, String src, String help, String dest){
        if (n==1){
            System.out.println("transfer "+n+" from "+src+" to "+dest);
            return;
        }
        tower(n-1, src, dest, help);
        System.out.println("transfer "+n+" from "+src+" to "+help);
        tower(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        tower(3,  "A", "B", "C");
    }
}
