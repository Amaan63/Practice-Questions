package Fibonacci;

public class FibonacciRecursion {

  static int x = 0, y = 1, z;

  public static void printFibonacci(int no) {
    if (no >= 1) {
      z = x + y;
      System.out.print("," + z);
      x = y;
      y = z;
      printFibonacci(no - 1);
    }
  }

  public static void main(String[] args) {
    int no = 5;
    System.out.print(x + "," + y);
    printFibonacci(no);
  }
}
