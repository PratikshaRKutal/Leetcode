package solutions;

public class FindTheLargestAltitude {
    public static int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude = altitude + gain[i];

            if (altitude > max) {
                max = altitude;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};

        System.out.println(largestAltitude(gain));
    }
}
