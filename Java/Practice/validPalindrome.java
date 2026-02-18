//Problem Statement-- Given a string s, return true if it is a palindrome, or false otherwise.
public class validPalindrome {

    public static boolean isPalindrome(String s) {
        int start = 0;
        s = s.toLowerCase();  //convert string to lowercase
        s = s.replace(" ", ""); //replace the whitespaces
        s = s.replaceAll("[^a-z A-Z 0-9]", "");  //replace the special character
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
