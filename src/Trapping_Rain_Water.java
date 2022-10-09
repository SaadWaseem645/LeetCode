public class Trapping_Rain_Water {
    public int trap(int[] height) {
        int left = 0, right = height.length-1, lower = 0, level = 0, total = 0;

        while(left < right){
            if(height[left] < height[right]){
                lower = height[left];
                left += 1;
            }
            else{
                lower = height[right];
                right -= 1;
            }
            level = Math.max(lower, level);
            total += level - lower;
        }

        return total;

    }
}
