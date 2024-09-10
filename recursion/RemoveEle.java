package recursion;

public class RemoveEle {
    public static String counts(String newString, int count, char c){
        for (int i = 0; i < count; i++) {
            newString+=c;
            
        }
        return newString;
    }
    public static String remove(String s, char c,int i, int count, String newString){
        if (i==s.length()-1) {
           return counts(newString, count, c);
           
        }
        if(s.charAt(i)==c){
            return remove(s, c, i+1, count+1, newString);
        }else{
            return remove(s, c, i+1, count, newString+s.charAt(i));
        }
    }
    public static void main(String[] args) {
        String s=remove("Anwaiasaaahata", 'a', 0, 0, "");
        System.out.println(s);
    }
}
