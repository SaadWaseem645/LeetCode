import java.util.Arrays;

public class N_Queens_II {

    public static void main(String[] args) {
        System.out.println(totalNQueens(1));
    }

    public static int totalNQueens(int n) {

        boolean[][] board = new boolean[n][n];
        int total = 0;

        for(int i = 0; i < n; ++i){
            board[0][i] = true;
            total += solve(board, n,  1);
            board[0][i] = false;
        }

        return total;
    }

    public static int solve(boolean[][] board, int n, int index){

        int total = 0;
        if(n == index) {
            return 1;
        }

        for(int i = 0; i < n; ++i){
            if(!checkVertical(index, i, board) || !checkDiagonal(index, i, board))
                continue;

            board[index][i] = true;
            total += solve(board, n,  index + 1);
            board[index][i] = false;
        }

        return total;

    }

    private static boolean checkVertical(int index, int x, boolean[][] board){
        for(int i = index; i > -1; --i){
            if(board[i][x])
                return false;
        }

        return true;
    }

    private static boolean checkDiagonal(int index, int x, boolean[][] board){
        int tempY = index - 1, tempX = x - 1;
        while(tempY >= 0 && tempX >= 0){
            if(board[tempY--][tempX--])
                return false;
        }

        tempY = index - 1;
        tempX = x + 1;

        while(tempY >= 0 && tempX < board.length){
            if(board[tempY--][tempX++])
                return false;
        }


        return true;
    }


}
