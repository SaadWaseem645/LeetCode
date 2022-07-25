import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Set_Matrix_Zeroes {


    public void setZeroes(int[][] matrix) {

        boolean zrow = false, zcol = false;
        for(int i = 0; i < matrix.length; ++i)
            for(int j = 0; j < matrix[0].length; ++j)
                if(matrix[i][j] == 0){
                    if(i == 0)
                        zrow = true;
                    if(j == 0)
                        zcol = true;
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }

        for(int i = 1; i < matrix.length; ++i)
            for(int j = 1; j < matrix[0].length; ++j)
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }

        if(zrow)
            for(int i = 0; i < matrix[0].length; ++i)
                matrix[0][i] = 0;
        if(zcol)
            for(int i = 0; i < matrix.length; ++i){
                matrix[i][0] = 0;
            }


    }

}
