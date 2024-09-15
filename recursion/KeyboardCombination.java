package recursion;

public class KeyboardCombination {
    public static String arr[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "wxyz"};
    public static void printCombination(String str, int idx, String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(idx);
        String mapping = arr[curr-'0'];
        for (int i = 0; i < mapping.length(); i++) {
            printCombination(str, idx+1, combination+mapping.charAt(i));
            
        }
            
        }
    public static void main(String[] args) {
        printCombination("23", 0, "");
    }
}
