

import java.util.ArrayList;
import java.util.Scanner;

class Subset{
    public static void printSet(ArrayList<Integer> set){
        System.out.println(set);
    }

    public static void subset(int n, ArrayList<Integer> set ){
        if(n==0){
            printSet(set);
            return;
        }
        set.add(n);
        subset(n-1, set);
        set.remove(set.size()-1);
        subset(n-1, set);
    }
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        subset(n, set);
        sc.close();;
    }
}

