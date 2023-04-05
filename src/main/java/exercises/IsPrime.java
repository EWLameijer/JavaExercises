package exercises;

// TAGS

/* DESCRIPTION
Check whether a given number is a prime number.
 */

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {

        System.out.println("Enter an integer: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isPotentialPrime = (number % 2 != 0 || number == 2) && number > 1;
        boolean isPrime = true;

        if (isPotentialPrime) {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }

        if (isPrime) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

    }
}
