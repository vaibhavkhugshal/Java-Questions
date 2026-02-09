/* Problem Statement-- Given an array of integers arr and an integer target, 
                       return indices of the two numbers such that they add up to target.(Leetcode-01) */

import java.util.Arrays;

public class twoSum {
    public static int[] twoSumElement(int []arr,int target){
        if (arr.length == 0) {
            return new int[] { -1, -1 };
        }
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + arr[i] == target) {
                return new int[] { i - 1, i };
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15, 24, 1, 10 };
        System.out.println(Arrays.toString(twoSumElement(arr,39)));
    }
}
