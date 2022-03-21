import java.util.ArrayList;
import java.util.List;

public class N_Queens {

    public static List<List<String>> boards = new ArrayList<>();
    public static StringBuilder defRow = new StringBuilder();

    public static void main(String[] args) {
        System.out.println(solveNQueens(9));
    }

    public static List<List<String>> solveNQueens(int n) {
        for(int i = 0; i < n; i++)
            defRow.append(".");
        solve(new ArrayList<>(), 0, n);
        return boards;
    }

    public static void solve(ArrayList<String> placement, int index, int n){

        for(int i = 0; i < n; i++){
           StringBuilder row = new StringBuilder(defRow);
           row.setCharAt(i, 'Q');
           int tempI = i-1;
           int tempJ = index-1;
           boolean overlap = false;

           while (tempI > -1 && tempJ > -1){
               if(placement.get(tempJ).charAt(tempI) == 'Q') {
                   overlap = true;
                   break;
               }
               tempI--;
               tempJ--;
           }

           if(overlap)
               continue;

           tempJ = index-1;
           tempI = i + 1;

            while (tempI < n && tempJ > -1){
                if(placement.get(tempJ).charAt(tempI) == 'Q'){
                    overlap = true;
                    break;
                }
                tempI++;
                tempJ--;
            }

            if(overlap)
                continue;

            tempJ = index - 1;
            while (tempJ > -1){
                if(placement.get(tempJ).charAt(i) == 'Q') {
                    overlap = true;
                    break;
                }
                tempJ--;
            }

            if(overlap)
                continue;

            ArrayList<String> tempPlacement = new ArrayList<>(placement);
            tempPlacement.add(row.toString());
            if(index == n-1) {
                boards.add(tempPlacement);
            }
            else solve(tempPlacement, index+1, n);
        }
    }


}
