package recursion;

public class Substring {
    public static void sub(String s, int idx, String newString){
        if(idx==s.length()){
            System.out.println(newString);
            return;
        }
        //choose
        sub(s, idx+1, newString+s.charAt(idx));
        //don't choose
        sub(s, idx+1, newString);
    }
    public static void main(String[] args) {
        sub("String", 0, "");
    }
}
