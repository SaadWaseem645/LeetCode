public class Flood_Fill {

    public static void main(String[] args) {
        floodFill(new int[][]{{0,1,1},{0,1,1}}, 1,1,1);
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(newColor == image[sr][sc])
            return image;
        floodFill(image, sr, sc, newColor, image[sr][sc],0,0);
        return image;
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor, int startColor, int right, int up) {
        sr += right;
        sc += up;
        if(sr >= image.length || sr < 0 || sc >= image[sr].length || sc < 0 || image[sr][sc] != startColor)
            return image;
        image[sr][sc] = newColor;

        if(right != -1)
            floodFill(image, sr, sc, newColor,startColor, 1, 0);
        if(right != 1)
            floodFill(image, sr, sc, newColor,startColor, -1, 0);
        if(up != -1)
            floodFill(image, sr, sc, newColor,startColor, 0, 1);
        if(up != 1)
            floodFill(image, sr, sc, newColor,startColor, 0, -1);

        return image;
    }

}
