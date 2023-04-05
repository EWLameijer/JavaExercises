package exercises;

import java.util.Scanner;

/* DESCRIPTION
Write a program to calculate the geometric mean of a set of numbers.
Hint:
The geometric mean is calculated using n√(a1 × a2 × ... × an)
(the nth power root of (a1 × a2 × ... × an))

Example:
Enter the number of values: 5
Enter a real number: 4.31
Enter a real number: 3.98
Enter a real number: 1.90
Enter a real number: 4.42
Enter a real number: 9.19
The geometric mean is: 4.210855561928519

 */
public class GeometricMean {
    public static void main(String[] args) {
        int c = 0;
        double p = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int count = input.nextInt();

        while ((c < count)) {
            System.out.print("Enter a real number: ");
            double x = input.nextDouble();
            c = c + 1;
            p = p * x;
        }
        double gm = Math.pow(p, 1.0 / count);
        System.out.println("The geometric mean is: " + gm);

    }
}
