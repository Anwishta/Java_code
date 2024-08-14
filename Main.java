import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter marks of Physics: ");
        int a = sc.nextInt();
        System.out.println("Enter marks of Maths: ");
        int b = sc.nextInt();
        System.out.println("Enter marks of chemistry: ");
        int c = sc.nextInt();
        System.out.println("Enter marks of biology: ");
        int d = sc.nextInt();
        System.out.println("Enter marks of computer science: ");
        int e = sc.nextInt();
        int sum = ((a+b+c+d+e)/5);
        System.out.print("The percentage is :" +sum);
        sc.close();

    }
}