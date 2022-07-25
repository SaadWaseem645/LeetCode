public class Out_of_Boundary_Paths {

    public static void main(String[] args) {
        System.out.println(findPaths(8, 7, 16, 1, 5));
    }

    private static int[][] memo;

    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {

        memo = new int[m][n];
        return paths(m, n, maxMove, startRow, startColumn);

    }


    public static int paths(int m, int n, int maxMove, int startRow, int startColumn) {

        if (maxMove == -1)
            return 0;
        else if (startRow < 0 || startRow >= m || startColumn < 0 || startColumn >= n)
            return 1;
        else if (memo[startRow][startColumn] != 0)
            return memo[startRow][startColumn];

        maxMove -= 1;


        int right = findPaths(m, n, maxMove, startRow + 1, startColumn);
        int left = findPaths(m, n, maxMove, startRow - 1, startColumn);
        int up = findPaths(m, n, maxMove, startRow, startColumn + 1);
        int down = findPaths(m, n, maxMove, startRow, startColumn - 1);

        memo[startRow][startColumn] = right + left + up + down;

        return memo[startRow][startColumn];

    }

}
