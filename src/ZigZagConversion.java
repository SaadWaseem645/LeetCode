import java.util.Arrays;

public class ZigZagConversion {


    public static void main(String[] args) {

        convert("PAYPALISHIRING", 3);

    }

    public static String convert(String s, int numRows){
        char[] arr = s.toCharArray();
        int nextChar = numRows + (numRows - 2);
        int len = s.length();

        char[] newArr = new char[len];
        int index = 0;

        if(len <= numRows || numRows == 1)
            return s;

        for(int i = 0; i < numRows; i++){
            int tempIndex = i;
            while (tempIndex < len){
                newArr[index++] = arr[tempIndex];
                tempIndex += nextChar;
                if(i != 0 && i != numRows-1 && tempIndex-(i*2) < len)
                    newArr[index++] = arr[tempIndex-(i*2)];
            }
        }


        return String.valueOf(newArr);
    }

}
