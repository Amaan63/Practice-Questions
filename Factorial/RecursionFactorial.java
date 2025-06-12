import java.util.Scanner;

public class RecursionFactorial {
  {
    /*
     * Recursion Means a method call itself
     */
  }
  static int fact = 1;

  public static void findFactorial(int no) {
    if (no > 1) {
      fact = fact * no;
      findFactorial(no - 1);
    }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the Number , To Find The Factorail:- ");
    int no = scanner.nextInt();
    findFactorial(no);
    System.out.println("Factorial Is " + fact);
  }
}
