import java.util.Arrays;

public class Merge_Sorted_Array {

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,0,0,0};
        merge(a,3, new int[]{2,5,6}, 3);
        System.out.println(Arrays.toString(a));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int indexm = 0, indexn = 0, i = 0, total = m+n;
        int[] nums3 = Arrays.copyOfRange(nums1,0,m);

        while (indexm + indexn != total){
            if(indexn == n || (indexm != m && nums3[indexm] < nums2[indexn]))
                nums1[i++] = nums3[indexm++];
            else nums1[i++] = nums2[indexn++];
        }
    }

}
