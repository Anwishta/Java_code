import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        System.out.println("Enter the marks of first subject: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Enter the marks of second subject: ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of third subject: ");
        int c = sc.nextInt();
        int sum = 0;
        sum = (a+b+c)/3;
        if (a>=33 && b>=33 && c>=33 && sum>=40)
        System.out.printf("congratualations!! You have passed with %d percentage", sum);
        else{
            System.out.println("You failed!! Better luck next time!");
        }
        sc.close();


    }
    
}
