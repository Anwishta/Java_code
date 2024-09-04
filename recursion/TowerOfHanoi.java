package recursion;

public class TowerOfHanoi {
    public static void tower(int n, String src, String helper, String dest){
         if (n==1) {
            System.out.println("transfer disk no "+n+" from "+src+" to "+dest);
            return;
         }
         tower(n-1, src, dest, helper);
         System.out.println("transfer disk no "+n+" from "+src+" to "+dest);
         tower(n-1, helper, src, dest);
        //  System.out.println("transfer disk no "+n+" from "+src+" to "+dest);
    }
    public static void main(String[] args) {
        tower(3, "A", "B", "C");
    }
    
}
