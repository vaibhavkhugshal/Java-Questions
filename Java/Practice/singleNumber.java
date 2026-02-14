//Problem Statement-- Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

public class singleNumber {
    public static int singleNumberInArray(int[] nums) {
        int ans = 0;
        for (int i : nums) {  
            ans ^= i;  //applying XOR operator inside the array nums
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int []nums = { 2, 2, 6, 0, 4, 6, 0 };
        System.out.println(singleNumberInArray(nums));
    }
}
