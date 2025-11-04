package solutions;

public class EqualRowAndColumnPairs {
    public static int equalPairs(int[][] grid) {
        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                boolean equal=true;
                for(int k=0;k<grid.length;k++){
                    if(grid[i][k]!=grid[k][j]){
                        equal=false;
                    }
                }
                if(equal){count++;}
            }
        }
        return count;
    }
    public static void main (String[]args){
        int[][] grid={{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};
        System.out.println(equalPairs(grid));
    }
}
