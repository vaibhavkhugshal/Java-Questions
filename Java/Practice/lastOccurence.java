//Problem-- Find the last occurence of the element x in an array.

public class lastOccurence {
    public static int lastOccurenceOfElement(int[] nums, int x) { //method to find the last occurence of any particular element x
        
        int lastIndex = -1;  //variable last index is initialized to -1
        
        for (int i = 0; i < nums.length; i++) {   
            if (nums[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 3, 9, 5, 2, 5 };
        int x = 5;
        System.out.println(lastOccurenceOfElement(nums, x));
    }
}
