import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String formatted_name = name.replace( ' ', '_');
        System.out.println(formatted_name);
        sc.close();
    }
}
