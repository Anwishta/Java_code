package recursion;


public class Permutation {
    public static void print(String s, String permutation){
        if(s.length()==0){
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            String newString = s.substring(0, i) + s.substring(i+1);
            print(newString, permutation+curr);
        }
    }
    public static void main(String[] args) {
        print("abc", "");
    }
}