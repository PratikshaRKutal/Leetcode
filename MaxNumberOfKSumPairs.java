package logicbuilding;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0,count=0;
        int i=0, j=nums.length-1;
        while(i<j){
            sum=nums[i]+nums[j];
            if(sum==k){
                count++;
                i++;
                j--;
            }
            else if(sum<k){
                i++;
            }
            else{
                j--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={3,1,3,4,3};
        int k=6;

        System.out.println(maxOperations(nums,k));
    }
}
