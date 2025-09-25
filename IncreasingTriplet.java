package basicconcepts;

public class IncreasingTriplet {
    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int n : nums) {
            if (n <= first) {
                first = n;
            } else if (n <= second) {
                second = n;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, 5, 0, 4, 6};
        int[] nums2 = {5, 4, 3, 2, 1};
        int[] nums3 = {1, 2, 3, 4, 5};

        System.out.println(increasingTriplet(nums1));
        System.out.println(increasingTriplet(nums2));
        System.out.println(increasingTriplet(nums3));
    }
}