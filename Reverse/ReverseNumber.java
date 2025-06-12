package Reverse;

public class ReverseNumber {
  public static void main(String[] args) {
    int no = 54321, rem, rev = 0;

    // Jab tak number 0 nahi ho jata, loop chalega
    while (no != 0) {
      rem = no % 10; // Akhri digit nikalna (remainder)
      rev = rev * 10 + rem; // Reverse number banana
      no = no / 10; // Last digit hata dena (number chhota karna)
    }

    // Reverse number print karna
    System.out.println("Reverse is " + rev);
  }
}
