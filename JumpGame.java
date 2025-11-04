package solutions;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int furthest=0;
        for (int i = 0; i <= n - 1; i++) {
            if(i>furthest){
                return false;
            }
            furthest = Math.max(furthest,i+nums[i]);
            if(furthest>=n-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
