//Problem-- Check if the array is sorted.

public class sortedArray {
    public static boolean ifArrayIsSorted(int arr[]) { //function to check if array is sorted
        
        //Traversing the array
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i+1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 6, 7, 8 };

        //Calling function and printing results
        System.out.println(ifArrayIsSorted(arr));
    }
}