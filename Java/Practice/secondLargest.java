//Problem Statement-- Get the second largest element in an array.

import java.util.Arrays;

public class secondLargest {
    public static int secondLargestElement(int[] nums) {

        //sort() method to sort the array
        Arrays.sort(nums);
        int length = nums.length;

        //starting from the second last element as last element is largest.
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] != nums[length - 1]) {
                return nums[i];
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        int[] nums = { 12, 5, 47, 23, 6, 10, 11, 12, 9 };
        System.out.println(secondLargestElement(nums));
    }
}
