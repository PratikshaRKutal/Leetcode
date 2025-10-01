package solutions;

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int emptyBottles = numBottles;
        int totalDrank = numBottles;

        while (emptyBottles >= numExchange) {
            int newFull=emptyBottles/numExchange;
            totalDrank+=newFull;
            emptyBottles=emptyBottles%numExchange+newFull;
        }
        return totalDrank;
    }
    public static void main(String[] args) {
        int numBottles = 15;
        int numExchanges = 4;

        System.out.println(numWaterBottles(numBottles, numExchanges));
    }
}
