public class Factorial {

  public static void factorialMethodOne() {
    int no = 6;
    int fact = 1;
    for (int i = 1; i <= no; i++) {
      fact = fact * i;
    }
    System.out.println("Factorial is " + fact);
  }

  public static void factorialMethodTwo() {
    int no = 6;
    int fact = 1;
    for (int i = no; i >= 1; i--) {
      fact = fact * i;
    }
    System.out.println("Factorial is " + fact);
  }

  public static void main(String[] args) {
    factorialMethodOne();
    factorialMethodTwo();
  }
}
