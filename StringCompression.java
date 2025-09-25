package basicconcepts;

public class StringCompression {
    public static int compress(char[] chars) {
        int write = 0, i = 0;
        while (i < chars.length) {
            char current = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','b','b','c','c','c'};
        int newLength = compress(chars);
        char[] result = new char[newLength];
        for (int i = 0; i < newLength; i++) {
            result[i] = chars[i];
        }
        System.out.println(java.util.Arrays.toString(result));
    }
}
