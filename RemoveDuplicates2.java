package solutions;

public class RemoveDuplicates2 {
    public static int removeDuplicates(int[] nums) {
        int write=0;
        for(int i=0;i<nums.length;i++){
            if(write<2 || nums[i]!=nums[write-2]){
                nums[write]=nums[i];
                write++;
            }
        }
        return write;
    }
    public static void main(String[] args) {
        int[] nums={1,1,1,2,2,3};

        System.out.println(removeDuplicates(nums));
    }
}
