package recursion;

import java.util.HashSet;

public class UniqueSubstring {
    public static void print(String s, int idx, String newString, HashSet<String> set){
        if(idx==s.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                set.add(newString);
                System.out.println(newString);
                return;
            }
            
        }
        char curr = s.charAt(idx);
        print(s, idx+1, newString+curr, set);
        print(s, idx+1, newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        print("aaa", 0, "", set);
    }
}
