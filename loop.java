import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        // for(int i =1; i<=10; i++){
        //     System.out.print(i + " ");
        // }%
        System.err.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = i;j<=n;j++){
            System.out.printf("* ");
        }
    System.err.println();}
        sc.close();

    }
}
