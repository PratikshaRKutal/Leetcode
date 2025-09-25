package solutions;
import java.util.*;

public class RemoveEle {
    public static int RemoveElement(int[] nums, int val){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] num={3,2,2,3};
        int val=3;
        int newLength=RemoveElement(num,val);
        System.out.println(newLength);

        for(int i=0;i<newLength;i++){
            System.out.print(num[i]+" ");
        }
    }
}