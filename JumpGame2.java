package solutions;

public class JumpGame2 {
    public static int canJump(int[] nums) {
        int n = nums.length;
        int furthest=0;
        int count=0;
        int current_end=0;
        if (nums.length <= 1) {
            return 0;
        }
        for (int i = 0; i <= n - 1; i++) {
            furthest = Math.max(furthest,i+nums[i]);
            if(i==current_end){
                count++;
                current_end=furthest;
                if(current_end>=n-1){
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
