import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Jump_Game_V {

    public static void main(String[] args) {
        System.out.println(maxJumps(new int[]{6,4,14,6,8,13,9,7,10,6,12}, 2));
        System.out.println(maxJumps(new int[]{3, 3, 3, 3, 3}, 3));
        System.out.println(maxJumps(new int[]{7, 6, 5, 4, 3, 2, 1}, 1));
    }

    private static int[] currentMaxJumps;
    private static int totalMax = 1;

    public static int maxJumps(int[] arr, int d) {

        totalMax = 1;
        currentMaxJumps = new int[arr.length];

        for (int i = 0; i < arr.length; i++)
            jump(arr, d, i);

        return totalMax;
    }

    public static void jump(int[] arr, int d, int index) {

        if (index < 0 || index >= arr.length || currentMaxJumps[index] != 0)
            return;

        int maxJump = 0, min = index - d, max = index + d + 1, minRange =  Math.max(0, min), maxRange = Math.min(arr.length,max );

        for (int i = index - 1; i >= minRange; --i) {
            if (arr[i] >= arr[index]) {
                break;
            }

            maxJump = Math.max(maxJump, currentMaxJumps[i]);
        }

        for (int i = index + 1; i < maxRange; ++i) {
            if (arr[i] >= arr[index])
                break;

            if (currentMaxJumps[i] == 0)
                jump(arr, d, i);
            maxJump = Math.max(maxJump, currentMaxJumps[i]);
        }

        int maxNum = maxJump + 1;
        currentMaxJumps[index] = maxNum;
        totalMax = Math.max(maxNum, totalMax);
    }

}
