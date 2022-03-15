public class Counting_Bits {

    public static void main(String[] args) {

        System.out.println(countBits(5));

    }

    public static int[] countBits(int n) {
        int[] ones = new int[n+1];
        for(int i = 0; i <= n; i++)
            ones[i] = Integer.toBinaryString(i).replace("0","").length();
        return ones;
    }

}
