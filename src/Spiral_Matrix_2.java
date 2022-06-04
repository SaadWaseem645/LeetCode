import java.util.Arrays;

public class Spiral_Matrix_2 {

    public static void main(String[] args) {
        generateMatrix(1);
    }


    public static int[][] generateMatrix(int n) {

        int total = n*n, vert = 0, hor = 0, current = 1;
        int[][] mat = new int[n][n];
        int[] offsets = {1,0,0,0};

        while(current <= total){

            for (int i = hor + ((vert == 0 && hor == 0) ? 0 : 1); i < n - offsets[1]; i++) mat[vert][i] = current++;
            hor = n - offsets[1] - 1;

            for (int i = vert + 1; i < n - offsets[2]; i++) mat[i][hor] = current++;
            vert = n - offsets[2] - 1;

            for (int i = hor - 1; i >= offsets[3]; i--) mat[vert][i] = current++;
            hor = offsets[3];

            for (int i = vert - 1; i >= offsets[0]; i--) mat[i][hor] = current++;
            vert = offsets[0];

            offsets[0]++; offsets[1]++; offsets[2]++; offsets[3]++;
        }

        return mat;

    }
}
