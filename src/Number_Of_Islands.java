public class Number_Of_Islands {
    public static void main(String[] args) {

        char[][] arr = new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(numIslands(arr));

    }

    //First Solution

//    public static int numIslands(char[][] grid) {
//        boolean[][] visited = new boolean[grid.length][grid[0].length];
//        int total = 0;
//
//        for(int i = 0; i < grid.length; ++i)
//            for(int j = 0; j < grid[0].length; ++j){
//                if(grid[i][j] == '1' && !visited[i][j]) {
//                    traverseLand(i, j, grid, visited);
//                    ++total;
//                }
//            }
//
//        return total;
//    }
//
//    public static void traverseLand(int i, int j, char[][] grid, boolean[][] visited){
//        if(i < 0 || j < 0 || i > grid.length || j > grid[0].length || grid[i][j] == '0' || visited[i][j])
//            return;
//
//        visited[i][j] = true;
//
//        traverseLand(i+1, j, grid, visited);
//        traverseLand(i-1, j, grid, visited);
//        traverseLand(i, j+1, grid, visited);
//        traverseLand(i, j-1, grid, visited);
//    }


    //Second Solution

    public static int numIslands(char[][] grid) {
        int total = 0;

        for(int i = 0; i < grid.length; ++i)
            for(int j = 0; j < grid[0].length; ++j){
                if(grid[i][j] == '1') {
                    traverseLand(i, j, grid);
                    ++total;
                }
            }

        return total;
    }

    public static void traverseLand(int i, int j, char[][] grid){
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        traverseLand(i+1, j, grid);
        traverseLand(i-1, j, grid);
        traverseLand(i, j+1, grid);
        traverseLand(i, j-1, grid);
    }
}
