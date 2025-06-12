package Pallindrome;

public class StringPallindrome {
  public static void main(String[] args) {
    String name = "radar";
    String reverseString = "";
    for (int i = name.length() - 1; i >= 0; i--) {
      reverseString = reverseString + name.charAt(i);
    }
    if (name.equals(reverseString)) {
      System.out.println(name + " Is Pallindrome");
    } else {
      System.out.println(name + " Is not a Pallindrome");
    }
  }
}
