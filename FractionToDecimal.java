package solutions;

public class FractionToDecimal {
    public static String fractionToDecimal(int numerator, int denominator) {
        StringBuilder decimal = new StringBuilder();

        decimal.append(numerator/denominator);

        return decimal.toString();
    }

    public static void main(String[] args) {
        int num=1;
        int deno=2;

        System.out.println(fractionToDecimal(num,deno));
    }
}
