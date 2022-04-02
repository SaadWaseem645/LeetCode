import java.util.Arrays;

public class Boats_To_Save_People {

    //For getting the minimum number of boats

//    public static int numRescueBoats(int[] people, int limit) {
//        int ships = 0;
//        Arrays.sort(people);
//        System.out.println(Arrays.toString(people));
//        int i = 0;
//        int j = people.length-1;
//        while(i <= j){
//            if(people[j] == limit){
//                ships++;
//                j--;
//            }else{
//                if(people[j]+people[i] > limit || i == j){
//                    j--;
//                    ships++;
//                }else
//                    people[j] += people[i++];
//            }
//        }
//
//        return ships;
//
//    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        int ships = j;
        while (i <= j) {
            if (people[j] + people[i] <= limit)
                ++i;
            --j;
        }

        return ships-j;

    }

}
