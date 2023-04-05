package exercises;

// TAGS boolean, break, for-loops, if, Math.sqrt(), operators-arithmetic, operators-logical, operators-relational,
// remainder-operator, Scanner, Scanner.nextInt(), System.out.print()

/* DESCRIPTION
Check whether a given number is a prime number.

Example run 1:
Enter an integer: 79
79 is a prime number

Example run 2:
Enter an integer: 21
21 is not a prime number
 */

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean canBePrime = number > 1 && (number == 2 || number % 2 != 0);

        if (canBePrime) {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    canBePrime = false;
                    break;
                }
            }
        }
        if (canBePrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
