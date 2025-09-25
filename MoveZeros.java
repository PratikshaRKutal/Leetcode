package solutions;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        MoveZeros  obj=new MoveZeros();
        obj.moveZeroes(nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
