import java.util.ArrayList;
import java.util.List;

public class My_Calendar_I {

    static class MyCalendar {

        private List<int[]> list;

        public MyCalendar() {
            list = new ArrayList<>();
        }

        public boolean book(int start, int end) {
            for(int i = 0; i  < list.size(); ++i){
                int[] arr = list.get(i);
                if(arr[0] == start || arr[1] == end || (arr[0] < start && arr[1] > start) || (arr[0] < end && arr[1] > end) || (arr[0] > start && arr[1] < end))
                    return false;
            }

            list.add(new int[]{start,end});
            return true;
        }
    }

    public static void main(String[] args) {
        MyCalendar cal = new MyCalendar();
        int[][] arr = new int[][]{{97,100},{33,51},{89,100},{83,100},{75,92},{76,95},{19,30},{53,63},{8,23},{18,37},{87,100},{83,100},{54,67},{35,48},{58,75},{70,89},{13,32},{44,63},{51,62},{2,15}};
        for(int[] a: arr)
            System.out.print(cal.book(a[0], a[1]) + ",");
        System.out.println();
        System.out.println("true,true,false,false,true,false,true,true,false,false,false,false,false,false,false,false,false,false,false,true\n");

    }

}
