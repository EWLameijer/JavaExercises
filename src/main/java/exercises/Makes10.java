package exercises;

// TAGS boolean, methods, operators-arithmetic, operators-logical, operators-relational, parameters, return

/* DESCRIPTION
https://codingbat.com/prob/p182873
Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true
 */
public class Makes10 {
    public static void main(String[] args) {
        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9));
    }

    private static boolean makes10(int firstNumber, int secondNumber) {
        return (firstNumber == 10 || secondNumber == 10 || firstNumber + secondNumber == 10);
    }
}
