package recursion;

import java.util.Scanner;

public class Reverse {
    public static void rev(String s, int i){
        if(i==s.length()-1){
            System.out.print(s.charAt(i));
            return;
        }
        rev(s, i+1);
        System.out.print(s.charAt(i));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // int n = s.length()-1;
        rev(s, 0);
        sc.close();
    }
}
