import java.util.*;

public class The_Number_Of_Weak_Characters_In_The_Game {

    public int numberOfWeakCharacters(int[][] properties) {
        int weak = 0;
        int[] strong = new int[100002];
        for(int[] property: properties) strong[property[0]] = Math.max(strong[property[0]], property[1]);
        for(int i = 100000; i > -1; --i) strong[i] = Math.max(strong[i+1], strong[i]);
        for(int[] property: properties) if(property[1] < strong[1+property[0]]) ++weak;
        return weak;
    }

}
