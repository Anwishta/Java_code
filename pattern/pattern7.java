import java.util.Scanner;

public class pattern7 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=i;j++){
                if(i == 1|| j == 1 || j == i || i == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }sc.close();
    }
}
