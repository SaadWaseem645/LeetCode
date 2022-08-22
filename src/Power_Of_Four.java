public class Power_Of_Four {
    public boolean isPowerOfFour(int n) {

        if(n <= 0 || n%4 != 0)
            return false;

        for(int i = 0; i < 16; ++i){
            if(n == Math.pow(4, i))
                return true;
        }
        return false;
    }
}
