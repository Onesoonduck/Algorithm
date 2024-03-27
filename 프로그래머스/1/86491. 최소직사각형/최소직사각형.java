import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;

        for (int i = 0; i < sizes.length; i++) {
            int[] size = sizes[i];
            Arrays.sort(size); 
            width = Math.max(width, size[0]); 
            height = Math.max(height, size[1]); 
        }

        return width * height;
    }
}