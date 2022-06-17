import java.util.Arrays;

public class Rotate_Image {

    public static void main(String[] args) {
        int[][] arr =  {{1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11,12,13,14,15},
                        {16,17,18,19,20},
                        {21,22,23,24,25}};
        rotate(arr);
        for(int i = 0; i < arr.length; i++)
            System.out.println(Arrays.toString(arr[i]));
    }

    public static void rotate(int[][] matrix) {
        int len = matrix[0].length - 1;
        int tempLen = matrix[0].length - 1;
        int offset = 0;
        int[] tl = {0, 0}, tr = {0, tempLen}, bl = {tempLen, 0}, br = {tempLen, tempLen};


        while (offset * 2 <= len) {
            int temp = matrix[tl[0]][tl[1]];
            matrix[tl[0]][tl[1]] = matrix[bl[0]][bl[1]];
            matrix[bl[0]][bl[1]] = matrix[br[0]][br[1]];
            matrix[br[0]][br[1]] = matrix[tr[0]][tr[1]];
            matrix[tr[0]][tr[1]] = temp;

            tl[1]++; tr[0]++; br[1]--; bl[0]--;
            if (tl[1] >= tempLen) {
                tempLen -= 1;
                offset++;
                tl[0]++; tr[1]--; br[0]--; bl[1]++;
                tl[1] = offset; tr[0] = offset; br[1] = len - offset; bl[0] = len - offset;

            }
        }

    }

}
