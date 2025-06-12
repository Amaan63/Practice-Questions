package PrimeNumber;

public class CheckPrimeNumber {
  {
    /*
     * Prime Number is number , which is divisible by one and itself
     */
  }

  public static void main(String[] args) {
    int no = 7;
    boolean isPrime = true;
    for (int i = 2; i <= no - 1; i++) {
      if (no % i == 0) {
        isPrime = false;
      }
    }
    if (!isPrime) {
      System.out.println("Not a Prime Number");
    } else {
      System.out.println("Number is Prime");
    }
  }
}
