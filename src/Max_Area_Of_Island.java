import java.util.HashSet;
import java.util.Set;

public class Max_Area_Of_Island {

    public static boolean[][] visited;

    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        visited = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                max = Math.max(max, traverseLand(grid, i, j));
            }
        }

        return max;

    }

    public static int traverseLand(int[][] grid, int x, int y){
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[x].length || visited[x][y] || grid[x][y] == 0)
            return 0;
        visited[x][y] = true;
        return 1+traverseLand(grid, x+1, y) + traverseLand(grid, x-1, y) + traverseLand(grid, x, y+1) + traverseLand(grid, x+1, y-1);
    }
}
