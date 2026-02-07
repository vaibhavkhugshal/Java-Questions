/*Problem Statement-- Given an integer array nums, return true if any value appears at least twice in the array,
             and return false if every element is distinct.  (Leetcode- 217)*/

import java.util.Arrays;
public class duplicate {
    public static boolean containsDuplicate(int[] nums) {

        //Sort() method to sort the array
        Arrays.sort(nums);

        //Traverse through the sorted array
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }
    
    public static void main(String[] args) {
        int []nums = { 1, 2, 5, 2, 9, 1, 3, 6, 7 };
        System.out.println(containsDuplicate(nums));
    }
}
