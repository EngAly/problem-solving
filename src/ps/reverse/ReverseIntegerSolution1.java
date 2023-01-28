package ps.reverse;


public class ReverseIntegerSolution1 {


    public static void main(String[] args) {

        System.out.println(new ReverseIntegerSolution1().reverse(23456789));

    }

    public int reverse(int x) {
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