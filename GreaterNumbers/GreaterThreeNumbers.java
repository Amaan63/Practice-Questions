package GreaterNumbers;

public class GreaterThreeNumbers {

  public static void findGreatestNumberMethodOne() {
    int a = 10, b = 20, c = 30;
    if (a > b) {
      if (a > c) {
        System.out.println("a is greater");
      } else {
        System.out.println("c is greater");
      }
    } else if (b > c) {
      System.out.println("b is greater");
    } else {
      System.out.println("c is greater");
    }
  }

  public static void findGreatestNumberMethodTwo() {
    int a = 10, b = 20, c = 30;
    if (a > b && a > c) {
      System.out.println("a is greater");
    } else if (b > a && b > c) {
      System.out.println("b is greater");
    } else {
      System.out.println("c is greater");
    }
  }

  public static void main(String[] args) {
    findGreatestNumberMethodOne();
    findGreatestNumberMethodTwo();
  }
}
