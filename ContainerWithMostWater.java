package solutions;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int n=height.length;
        if(n<2) return 0;

        int left=0;
        int right=n-1;
        int maxArea=0;
        while(left<right){
            int lHeight=height[left];
            int rHeight=height[right];
            int width=right-left;
            int area=Math.min(lHeight,rHeight)*width;
            if(area>maxArea){
                maxArea=area;
            }

            if (lHeight<rHeight) {
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}
