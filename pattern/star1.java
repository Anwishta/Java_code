import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {
        int n, i, j;
        System.out.print("Enter the number of rows you want: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (i =0; i<n; i++){
            for(j=0;j<i;j++){
                System.out.printf(" %d", j+1);
            }
            System.err.println();
        }
    }
}
