package exercises;
/* DESCRIPTION
Print all multiples of 3 between 10 and 50
 */

public class MultiplesOf3 {
    public static void main(String[] args) {

        for (int i = 10; i < 50; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }

    }
}
