import java.util.Scanner;

public class Parity {
    public static int xor(String s) {
        int count = 0;
        for(char c : s.toCharArray()) {
            if(c == '1') {
                count++;
            }
        }
        return count % 2;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number: ");
        String s = sc.nextLine();
        int parityBit = xor(s);
        String transmittedString = s + parityBit;
        System.out.println(transmittedString);

        System.out.println("Enter the received string: ");
        String receivedString = sc.nextLine();

        int calculatedParity = xor(receivedString.substring(0, receivedString.length() - 1));
        int receivedParity = xor()
        
    }
}
