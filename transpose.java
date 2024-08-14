import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        int [][] arr = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
        for(int i =0; i<r;i++){
            for(int j =0; j<c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The transpose of the array is: ");
        for (int j = 0; j < c; j++) {
            for (int i = 0; i < r; i++) {
                    System.out.print(arr[i][j] + " ");
            }System.out.println();
        }sc.close();
    }
    
}
