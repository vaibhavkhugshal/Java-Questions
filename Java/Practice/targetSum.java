//Problem-- Find the number of pairs whose sum is equal to target.

public class targetSum{

    //Funtion to find the pairs
    public static int pairSum(int[] nums, int target) {

        int count = 0; //variable to store the number of pairs
        
        //Traverse the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    count++;
                }
            }
        }
        return count;   
    }


    public static void main(String[] args) {
        int[] nums = { 4, 6, 3, 5, 8, 2, 5, 3, 1};
        System.out.println(pairSum(nums, 7));
    }
}