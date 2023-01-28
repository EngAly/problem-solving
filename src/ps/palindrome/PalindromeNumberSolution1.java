package ps.palindrome;

public class PalindromeNumberSolution1 {

    public static void main(String[] args) {


        boolean numberPalindrome = isNumberPalindrome(12343211);
        System.out.println(numberPalindrome);

    }

    private static boolean isNumberPalindrome(int number) {

        int reverse = reverse(number);

        if (number > 0) {
            return number == reverse ? true : false;
        }
        return false;
    }


    public static int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }
        long reverse = 0;
        while (x > 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) (isNegative ? -reverse : reverse);
    }


}
