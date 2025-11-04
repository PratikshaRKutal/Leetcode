package solutions;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n==0) return;
        k=k%n;
        if(k==0) return;

        int[] tmp=new int[n];
        for(int i=0;i<n;i++){
            tmp[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=tmp[i];
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k=3;

        rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
