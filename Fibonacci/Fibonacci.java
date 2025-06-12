package Fibonacci;

public class Fibonacci {
  public static void main(String[] args) {
    int no = 5, x = 0, y = 1, z;

    // Pehle do numbers print karo (0 aur 1)
    System.out.print(x + "," + y);

    // Fibonacci series generate karne ke liye loop
    for (int i = 1; i <= no; i++) {
      z = x + y; // Next number = pehle do numbers ka sum
      System.out.print("," + z); // Next number print karo
      x = y; // x ko update karo (x = y)
      y = z; // y ko update karo (y = z)
    }
  }
}
