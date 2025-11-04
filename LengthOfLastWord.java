package solutions;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return  words[words.length-1].length();
    }
    public static void main(String[] args) {
        String s="Hello World";

        System.out.println(lengthOfLastWord(s));
    }
}
