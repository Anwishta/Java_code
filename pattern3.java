import java.util.Scanner;

public class pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i<=n; i++){
            for(int j = n-i+1; j>=1; j--){
                System.out.print("* ");
            }System.out.println();
        }
    }
}
