/*  Problem Statement-- You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.
                     Each element nums[i] represents the maximum length of a forward jump from index i. In other words,
                     if you are at index i, you can jump to any index (i + j).
                     Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.*/


public class jumpGame {
    public static int minNumberOfJump(int[] nums) {
        //count the number of jumps
        int jump = 0;

        //check the maximum reachable in next jump
        int farthest = 0;

        //check the end of the current jump
        int currentEnd = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i + nums[i] > farthest) {
                farthest = i + nums[i];
            }
            if (i == currentEnd) {
                jump++;
                currentEnd = farthest; 
            }
            else {

            }
        }
        return jump;
    }
    
    public static void main(String[] args) {
        int[] nums = { 2, 3, 0, 1, 4 };
        System.out.println(minNumberOfJump(nums));
    }
}
