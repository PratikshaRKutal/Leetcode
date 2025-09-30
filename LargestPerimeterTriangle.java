package solutions;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;

        for(int k = n-1; k >= 2; k--){
            if(nums[k-2]+nums[k-1]>nums[k]){
                return nums[k-2]+nums[k-1]+nums[k];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
       int[] nums={3,2,3,4};
       System.out.println(largestPerimeter(nums));
    }
}
