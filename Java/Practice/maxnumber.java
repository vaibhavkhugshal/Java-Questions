public class maxnumber {
    public static void main(String[] args) {
        int[] num = { 0, 1, 2, 3, 9, 4, 6, 8, 96, 13, 1102 };
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > res) {
                res = num[i];
            }
        }
        System.out.println(res);

    }
}
