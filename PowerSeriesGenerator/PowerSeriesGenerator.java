/*
Problem: Generate Power Series

You are given three integers for each test case:

a → the starting number

b → the multiplier

n → the number of terms to generate

You need to build a series as follows:

1st term = a + (2^0 * b)

2nd term = a + (2^0 * b) + (2^1 * b)

3rd term = a + (2^0 * b) + (2^1 * b) + (2^2 * b)

… continue until n terms

The first input will be an integer t (number of test cases).
For each test case, read a, b, and n.
Then print the series on a single line with space-separated values.

Example Input:
2
0 2 10
5 3 5

Example Output:
2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
*/

import java.util.Scanner;

public class PowerSeriesGenerator {
  public static void main(String[] argh) {
    // Scanner banaya input lene ke liye
    Scanner in = new Scanner(System.in);

    // Kitne test cases chalenge, uska input liya
    int t = in.nextInt();

    // Power ko store karne ke liye variable banaya
    int power;

    // Har test case ke liye loop
    for (int i = 0; i < t; i++) {

      // Starting number input liya
      int startNumber = in.nextInt();

      // Multiplier input liya (ye har power ke sath multiply hoga)
      int multiplier = in.nextInt();

      // Kitne terms print karne hai, uska input liya
      int numOfTerms = in.nextInt();

      // Ek temporary variable jisme har bar ka result store hoga
      int temp = startNumber;

      // Terms generate karne ke liye loop
      for (int j = 0; j < numOfTerms; j++) {

        // Power calculate kiya (2^j)
        power = (int) Math.pow(2, j);

        // Formula: temp = temp + (2^j * multiplier)
        temp = temp + (power * multiplier);

        // Har term ko print kar diya
        System.out.print(temp + " ");
      }

      // Har test case ke baad new line
      System.out.print("\n");
    }

    // Scanner close kiya (best practice)
    in.close();
  }

}
