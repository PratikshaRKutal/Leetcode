package solutions;
import java.util.*;

public class RemoveDuplicates {
    public static int RemDupEle(int[] nums){
        if(nums.length==0) return 0;

        int j=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int[] num={1, 1, 2, 2, 3, 3, 4};
        int k=RemDupEle(num);
        System.out.println(k);

        for(int i=0;i<k;i++){
            System.out.print(num[i]+" ");
        }
    }
}