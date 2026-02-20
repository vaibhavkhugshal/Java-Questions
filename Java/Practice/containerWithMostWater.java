/*Problem Statement-- You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints 
of the ith line are (i, 0) and (i, height[i]).
Return the maximum amount of water a container can store.*/

public class containerWithMostWater {

    public static int maxArea(int[] height) {
        int n = height.length-1;
        int left = 0;
        int right = n ;
        int maxWater = 0;
        while (left < right) {
            int distance = right - left;
            int minHeight = Math.min(height[left], height[right]);
            maxWater = distance * minHeight;

            if (height[left] < height[right]) {
                left++;
            } else {
                right++;
            }

        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(maxArea(height));
    }
}
