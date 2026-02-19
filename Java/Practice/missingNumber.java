public class missingNumber {
    public static int numberIsMissing(int[] arr) {
        int n = arr.length;
        int pointer = 0;
        while (pointer < arr.length) {
            int index = arr[pointer];
            if (arr[pointer] == n) {
                pointer++;
            } else if (arr[pointer] != arr[index]) {
                int temp = arr[pointer];
                arr[pointer] = arr[index];
                arr[index] = temp;
            } else {
                pointer++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i != arr[i]) {
                return i;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 0 };
        System.out.print(numberIsMissing(arr));
    }
}
