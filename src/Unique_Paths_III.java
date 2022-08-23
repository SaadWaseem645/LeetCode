import java.util.Arrays;

public class Unique_Paths_III {

    static int tot = 0;
    public static void main(String[] args) {
        System.out.println(uniquePathsIII(new int[][]{{1,0,0,0},{0,0,0,0},{0,0,2,-1}}));
    }

    public static int uniquePathsIII(int[][] grid) {

        int totalSum = 1, ii = 0, jj = 0;
        for (int i = 0; i < grid.length; ++i)
            for (int j = 0; j < grid[0].length; ++j)
                if (grid[i][j] == 0)
                    ++totalSum;
                else if(grid[i][j] == 1){
                    ii = i;
                    jj = j;
                }


        System.out.println(totalSum);
        return recurse(ii,jj,0,totalSum, grid);
    }

    public static int recurse(int i, int j, int steps, int totalSteps, int[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1)
            return 0;
        else if(grid[i][j] == 2)
            if(steps == totalSteps) {
                tot++;
                return 1;
            }
            else return 0;

        grid[i][j] = -1;

        for (int[] o: grid) {
            System.out.println(Arrays.toString(o));
        }

        System.out.println("\n");

        int total = recurse(i+1, j, steps+1, totalSteps, grid) + recurse(i, j+1, steps+1, totalSteps, grid)
                + recurse(i, j-1, steps+1, totalSteps, grid) + recurse(i-1, j, steps+1, totalSteps, grid);

        grid[i][j] = 0;
        return total;
    }
}
