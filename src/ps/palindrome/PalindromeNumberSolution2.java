package ps.palindrome;


public class PalindromeNumberSolution2 {


    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(123211));
    }

    public static boolean isNumberPalindrome(int number) {

        long right = 0;
        while (number > right) {
            right = right * 10 + number % 10;
            number /= 10;
        }

        return (number == right) || number == right / 10;
    }
}