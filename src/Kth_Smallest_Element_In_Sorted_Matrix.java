import java.util.Comparator;
import java.util.PriorityQueue;

public class Kth_Smallest_Element_In_Sorted_Matrix {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,5,9},{10,11,13},{12,13,15}};
        System.out.println(kthSmallest(arr, 8));
    }

    public static int kthSmallest(int[][] matrix, int k){
        int n = matrix.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((o1, o2) -> Integer.compare(o2, o1));

        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j){
                pq.add(matrix[i][j]);
                if(pq.size() > k)
                    pq.poll();
            }

        return pq.poll();

    }

//    public static int kthSmallest(int[][] matrix, int k) {
//        int n = matrix.length;
//        int[] current = new int[n];
//        int res = 0;
//        for(int i = 0; i < k; ++i){
//            int j = 0, min = 1000000001, minInd = 0;
//            for(; j < n; ++j){
//                if(current[j] == n)
//                    continue;
//                int val = matrix[j][current[j]];
//                if(val < min){
//                    min = val;
//                    minInd = j;
//                }
//            }
//            ++current[minInd];
//            res = min;
//        }
//
//        return  res;
//    }
}
