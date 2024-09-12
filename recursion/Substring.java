package recursion;

public class Substring {
    public static void sub(String s, int idx, String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        char curr = s.charAt(idx);
        //choose
        sub(s, idx+1, newString+curr);
        //don't choose
        sub(s, idx+1, newString);
    }
    public static void main(String[] args) {
        sub("abc", 0, "");
    }
}
