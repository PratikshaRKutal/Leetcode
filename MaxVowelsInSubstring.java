package logicbuilding;

public class MaxVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int n = s.length();
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
        }
        maxCount = currentCount;

        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                currentCount++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentCount--;
            }
            maxCount = Math.max(maxCount, currentCount);
            if (maxCount == k) return k;
        }
        return maxCount;
    }

    private static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
    }
}
