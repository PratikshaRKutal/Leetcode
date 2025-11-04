package solutions;

public class ValidPalindrome {
    public static boolean isPalindrome(String str) {
        StringBuilder ReverseStr=new StringBuilder(str);
        ReverseStr.reverse();

        if(ReverseStr.toString().equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");

        System.out.println(isPalindrome(str));
    }
}
