//Problem Statement-- You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

public class richestCustomer {
    public static int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int rowSum = 0;
            for (int col = 0; col < account.length; col++) {
                rowSum += account[col];
            }
            wealth = Math.max(rowSum, wealth);
        }
        return wealth;
    }

    public static void main(String[] args) {
        int[][] accounts = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        System.out.println(maximumWealth(accounts));
    }

}

