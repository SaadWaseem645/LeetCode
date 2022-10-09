public class Can_Place_Flowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {


        for (int i = 0; i < flowerbed.length; ++i)
            if (flowerbed[i] != 1)
                if ((i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                    --n;
                    ++i;
                }

        return n <= 0;

    }

}
