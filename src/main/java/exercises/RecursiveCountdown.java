package exercises;
/* DESCRIPTION
Print the numbers from 8 to 0, using recursion.
 */

public class RecursiveCountdown {
    public static void main(String[] args) {
        print_till_zero(8);

    }

    public static void print_till_zero(int n) {
        System.out.println(n);
        if (n == 0)
            return;
        n = n - 1;
        print_till_zero(n);
    }
}
