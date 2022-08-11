public class Mirror_Reflection {

    public static void main(String[] args) {
        System.out.println(mirrorReflection(5,2));
    }

    public static int mirrorReflection(int p, int q) {

        int newRef = q, horFlip = 0, verFlip = 0;
        while(newRef%p != 0){
            newRef = newRef + q;
            horFlip = horFlip + 1;
            if(newRef > p) {
                verFlip = verFlip + 1;
                newRef = newRef - p;
            }
        }

        System.out.println("Hor " + horFlip + " Ver " + verFlip);

        if(verFlip%2 == 1)
            return 0;

        if(horFlip%2 == 0)
            return 1;

        return 2;

    }


}
