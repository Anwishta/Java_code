package recursion;

import java.util.Scanner;

public class FirstAndOccurance {
    public static int first = -1;
    public static int last = -1;
    public static void occur(String s, int i, char ele){
        
        if(i==s.length()){
            System.out.println(first);
            System.out.println(last);;
            return;
        }
        if (s.charAt(i)==ele) {
            if (first==-1) {
                first = i;
            }
            {
                last = i;
            }
        }
        occur(s, i+1, ele);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        occur(s, 0, c);
        sc.close();
    }
}
