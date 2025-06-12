package Pallindrome;

public class NumberPallindrome {
  public static void main(String[] args) {
    int no = 1221;
    int temp = no;
    int rev = 0, rem;
    while (temp != 0) {
      rem = temp % 10;
      rev = rev * 10 + rem;
      temp = temp / 10;
    }
    if (no == rev) {
      System.out.println(no + " Is Pallindrome Number");
    } else {
      System.out.println(no + " Is not a Pallindrome Number");
    }
  }
}
