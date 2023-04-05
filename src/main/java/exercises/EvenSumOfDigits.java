package exercises;

/* DESCRIPTION
Print every integer between 100 and 150 (exclusive) of which the sum of digits is an even number.
 */
public class EvenSumOfDigits {
    public static void main(String[] args) {

        for (int i = 100; i < 150; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }
            if (sum % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}
