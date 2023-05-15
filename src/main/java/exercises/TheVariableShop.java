package exercises;

// TAGS

/* DESCRIPTION
// From RB Whitaker's "C# Player's Guide" - adjusted to Java
The Variable Shop
You see an old shopkeeper struggling to stack up variables in a window display. “Hoowee! All these variable types sure are exciting but setting them all up to show them
off to excited new programmers like yourself is a lot of work for these aching bones,”
she says. “You wouldn’t mind helping me set up this program with one variable of every
type, would you?”

Objectives:
- Build a program with a variable of all eight primitive Java types (as well as the 'text' type).
- Assign each of them a value using a literal of the correct type.
- Use System.out.println to display the contents of each variable.

To study if you find this difficult yet:
W3 schools Java Data Types - https://www.w3schools.com/java/java_data_types.asp
 */

public class TheVariableShop {
    public static void main(String[] args) {
        boolean iLikeCake = true;
        byte populationOfNeighboursFamily = 4; // note: you almost never use byte or short or float in practice, but you should know their names!
        short populationOfMaartensdijk = 4880;
        int populationOfTheNetherlands = 17_867_200; // note that you can use underscores to make long numbers more readable
        long populationOfTheWorld = 8_033_065_973L; // a suffix "L" or "l" needed to show that this is really a long number.
        // most developers prefer "L" to "l", as "l" can be more easily confused with "1" in code listings
        float averageHeightOfMenInNetherlands = 183.78F; //
        // 	170.36

    }
}
