import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the range: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }System.out.println();
        }

    }
}
