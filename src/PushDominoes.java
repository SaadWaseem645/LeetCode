import java.util.ArrayList;
import java.util.List;

public class PushDominoes {
    public String pushDominoes(String dominoes) {

        char[] arr = dominoes.toCharArray();
        List<Integer> pushes = new ArrayList<Integer>();
        int dominoLen = dominoes.length();

        for(int i = 0; i < dominoLen; ++i) if(arr[i] != '.') pushes.add(i);

        int len = pushes.size(), index = 0;

        while(index < len){

            int pushIndex = pushes.get(index);

            if(arr[pushIndex] == 'L'){
                int tempIndex = pushIndex-1;
                while(tempIndex > -1 && arr[tempIndex] == '.'){
                    arr[tempIndex--] = 'L';
                }
                ++index;
            }if(arr[pushIndex] == 'R')
                if((index + 1 >= len) || arr[pushes.get(index+1)] == 'R'){
                    int tempIndex = pushIndex+1;
                    while(tempIndex < dominoLen && arr[tempIndex] == '.'){
                        arr[tempIndex++] = 'R';
                    }
                    ++index;
                }else if(arr[pushes.get(index+1)] == 'L'){
                    int l = pushIndex+1, r = pushes.get(index+1)-1;
                    while(l < r){
                        arr[l++] = 'R';
                        arr[r--] = 'L';
                    }
                    index += 2;
                }

        }

        return String.valueOf(arr);

    }
}
