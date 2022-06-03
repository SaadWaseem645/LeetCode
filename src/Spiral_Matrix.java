import java.util.LinkedList;
import java.util.List;

public class Spiral_Matrix {

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new LinkedList<>();
        int[] offsets = {0,0,0,0};

        char dir = 'r';
        int vert = 0;
        int hor = 0;
        int max = matrix.length * matrix[0].length;

        int count = 0;

        while(true){
            switch (dir) {
                case 'r' -> {
                    for (int i = hor + ((vert == 0 && hor == 0) ? 0 : 1); i < matrix[vert].length - offsets[1]; i++) {
                        list.add(matrix[vert][i]);
                        count++;
                    }
                    hor = matrix[vert].length - offsets[1] - 1;
                    offsets[0]++;
                    dir = 'd';
                }
                case 'd' -> {
                    for (int i = vert + 1; i < matrix.length - offsets[2]; i++) {
                        list.add(matrix[i][hor]);
                        count++;
                    }
                    vert = matrix.length - offsets[2] - 1;
                    offsets[1]++;
                    dir = 'l';
                }
                case 'l' -> {
                    for (int i = hor - 1; i >= offsets[3]; i--) {
                        list.add(matrix[vert][i]);
                        count++;
                    }
                    hor = offsets[3];
                    offsets[2]++;
                    dir = 'u';
                }
                case 'u' -> {
                    for (int i = vert - 1; i >= offsets[0]; i--) {
                        list.add(matrix[i][hor]);
                        count++;
                    }
                    vert = offsets[0];
                    offsets[3]++;
                    dir = 'r';
                }
            }

            if(count >= max)
                return list;
        }

    }

}
