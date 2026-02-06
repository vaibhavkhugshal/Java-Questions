//Problem-- Count the number of element greater than value target.

public class greaterNumber {

    //function to count the number of elements
    public static int greaterElement(int[] nums, int target) {
        
        //variable to store the count
        int numberGreater = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums.length == 0) {
                return -1;
            }

            if (nums[i] > target) {
                numberGreater++;
            }
        }
        return numberGreater;
    }
    
    public static void main(String[] args) {
        int []nums = { 1, 0, 2, 6, 9, 8, 10, 5, 7, 66 };
        int target = 6;

        //invoking method and printing required output.
        System.out.println(greaterElement(nums, target));
    }
}
