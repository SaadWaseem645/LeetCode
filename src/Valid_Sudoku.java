import javax.print.attribute.SetOfIntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class Valid_Sudoku {

    public static void main(String[] args) {
//        String[][] board = {{"5", "3", ".", ".", "7", ".", ".", ".", "."}
//                , {"6", ".", ".", "1", "9", "5", ".", ".", "."}
//                , {".", "9", "8", ".", ".", ".", ".", "6", "."}
//                , {"8", ".", ".", ".", "6", ".", ".", ".", "3"}
//                , {"4", ".", ".", "8", ".", "3", ".", ".", "1"}
//                , {"7", ".", ".", ".", "2", ".", ".", ".", "6"}
//                , {".", "6", ".", ".", ".", ".", "2", "8", "."}
//                , {".", ".", ".", "4", "1", "9", ".", ".", "5"}
//                , {".", ".", ".", ".", "8", ".", ".", "7", "9"}};

        char[][] board = {{'8','3','.','.','7','.','.','.','.'},{'6','.','.','1','9','5','.','.','.'},{'.','9','8','.','.','.','.','6','.'},{'8','.','.','.','6','.','.','.','3'},{'4','.','.','8','.','3','.','.','1'},{'7','.','.','.','2','.','.','.','6'},{'.','6','.','.','.','.','2','8','.'},{'.','.','.','4','1','9','.','.','5'},{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++)
            if (!checkHorizontal(i, board) || !checkVertical(i, board) || !searchMatrix(i, board))
                return false;
        return true;
    }

    public static boolean checkHorizontal(int i, char[][] board) {
        List<Character> list = new ArrayList<>();
        for (int j = 0; j < 9; j++) {
            if (board[i][j] == '.')
                continue;
            else if (list.contains(board[i][j]))
                return false;
            else list.add(board[i][j]);
        }


        return true;
    }

    public static boolean checkVertical(int i, char[][] board) {
        List<Character> list = new ArrayList<>();
        for (int j = 0; j < 9; j++) {

            if (board[j][i] == '.')
                continue;
            else if (list.contains(board[j][i]))
                return false;
            else list.add(board[j][i]);
        }

        return true;
    }

    public static boolean searchMatrix(int index, char[][] board) {
        List<Character> list = new ArrayList<>();
        int i = index % 3;
        int j = index / 3;

        i = i * 3;
        j = j * 3;

        int tempI = i + 3;
        int tempJ = j + 3;

        while (i != tempI || j != tempJ) {
            if (i == tempI) {
                i = i - 3;
                j++;
            }

            if (j == tempJ)
                break;

            if (board[j][i] == '.') {
                i++;
                continue;
            } else if (list.contains(board[j][i]))
                return false;
            else list.add(board[j][i]);
            i++;
        }

        return true;
    }

}
