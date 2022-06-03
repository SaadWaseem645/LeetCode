public class Pow_X_n {

    public static double myPow(double x, int n) {
        double total = 1;

        if(n == 0 || x == 1)
            return 1;
        else if(n == 1)
            return x;
        else if(x == -1){
            if(n%2==0)
                return 1;
            else return x;
        }
        else if(n <= Integer.MIN_VALUE)
            return 0;


        for(int i = 0; i < Math.abs(n); i++) {
            total *= x;
        }

        if(n < 0)
            return 1/total;
        return total;
    }

    public static double myPowTwo(double x, int n){
        if(n < 0){
            n = -n;
            x = 1 / x;
        }

        double pow = 1;

        while(n != 0){
            if((n & 1) != 0){
                pow *= x;
            }

            x *= x;
            n >>>= 1;

        }

        return pow;
    }
}
