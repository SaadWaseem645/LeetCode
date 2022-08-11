import java.util.ArrayList;

public class Longest_Increasing_Subsequence {

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{-813,82,-728,-82,-432,887,-551,324,-315,306,-164,-499,-873,-613,932,177,61,52,1000,-710,372,-306,-584,-332,-500,407,399,-648,290,-866,222,562,993,-338,-590,303,-16,-134,226,-648,909,582,177,899,-343,55,629,248,333,1,-921,143,629,981,-435,681,844,349,613,457,797,695,485,15,710,-450,-775,961,-445,-905,466,942,995,-289,-397,434,-14,34,-903,314,862,-441,507,-966,525,624,-706,39,152,536,874,-364,747,-35,446,-608,-554,-411,987,-354,-700,-34,395,-977,544,-330,596,335,-612,28,586,228,-664,-841,-999,-100,-620,718,489,346,450,772,941,952,-560,58,999,-879,396,-101,897,-1000,-566,-296,-555,938,941,475,-260,-52,193,379,866,226,-611,-177,507,910,-594,-856,156,71,-946,-660,-716,-295,-927,148,620,201,706,570,-659,174,637,-293,736,-735,377,-687,-962,768,430,576,160,577,-329,175,51,699,-113,950,-364,383,5,748,-250,-644,-576,-227,603,832,-483,-237,235,893,-336,452,-526,372,-418,356,325,-180,134,-698}));
    }

    private static int max;

    public static int lengthOfLIS(int[] nums) {
        max = 0;
        generateList(nums, 0, new ArrayList<>());
        return max;
    }

    public static void generateList(int[] nums, int index, ArrayList<Integer> sequence){
        if(index == nums.length) {
            max = Math.max(sequence.size(), max);
//            System.out.println(sequence);
        }
        else{
//            if((nums.length-index) > max) {
                if (sequence.size() == 0 || sequence.get(sequence.size() - 1) < nums[index]) {
                    sequence.add(nums[index]);
                    generateList(nums, index + 1, sequence);
                    sequence.remove(sequence.size() - 1);
                }
                generateList(nums, index + 1, sequence);
//            }
        }
    }

//    private static int[] memo;
//
//    public static int lengthOfLIS(int[] nums) {
//        memo = new int[nums.length];
//        return generateList(nums, nums.length-1, new ArrayList<>());
//
//    }
//
//    public static int generateList(int[] nums, int index, ArrayList<Integer> sequence){
//        if(index == -1) {
//            System.out.println(sequence);
//            return sequence.size();
//        }else if(memo[index] != 0){
//            return memo[index];
//        }
//        else{
//            memo[index] = Math.max(generateList(nums, index-1, sequence), memo[index]);
//            if(sequence.size() == 0 || sequence.get(sequence.size()-1) > nums[index]) {
//                sequence.add(nums[index]);
//                memo[index] = Math.max(generateList(nums, index-1, sequence), memo[index]);
//                sequence.remove(sequence.size() - 1);
//            }
//            return memo[index];
//        }
//    }


}
