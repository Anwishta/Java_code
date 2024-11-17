package String;

public class Palindrome {
    public Boolean palindrome(String s){
        int left = 0;
        int right = s.length()-1;
        while(left<=right/2){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
                
            }else{
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        Palindrome res = new Palindrome();
        res.palindrome("madam");
        System.out.println(res);
    }
}
