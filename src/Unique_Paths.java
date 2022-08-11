import java.math.BigInteger;

public class Unique_Paths {

    public static void main(String[] args) {
        System.out.println(uniquePaths(2,100));
    }

    public static int uniquePaths(int m, int n) {
        int total = m+n-2, r = Math.min(m,n) - 1;
        double val = 1;
        for(int i=1; i<=r; ++i, total--) val = (val * total) / i;
        return (int) val;
    }

}
