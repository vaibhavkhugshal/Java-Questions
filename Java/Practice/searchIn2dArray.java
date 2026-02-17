//Problem Statement-- Search element in a 2d matrix.

public class searchIn2dArray {
    public static void main(String[] args) {
        int [][]nums={
            {1,2,3,5},
            {8,6},
            {7,0,3,8},
        };
        int target = 6;
        
        for (int row = 0; row < nums.length; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                if (nums[row][col] == target) {
                    System.out.println("Element " + target + " found at index : [" + row + "," + col + "]");
                }
                else {
                    System.out.println("Element " + target + " is not found");
                }
            }
        }
                
    }
}
