package LeapYear;

public class Leapyear {

  // Method 1: Nested if-else se leap year check kar rahe hai
  public static void checkLeapYearUsingNestedIf() {
    int year = 2016; // Year jise check karna hai
    if (year % 4 == 0) { // Agar 4 se divisible hai
      if (year % 100 == 0) { // Agar 100 se divisible hai
        if (year % 400 == 0) { // Agar 400 se divisible hai
          System.out.println("Leap Year"); // Leap year hai
        } else {
          System.out.println("Not a Leap Year"); // Leap year nahi hai
        }
      } else {
        System.out.println("Leap Year"); // 100 se divisible nahi, to leap year
      }
    } else {
      System.out.println("Not a Leap Year"); // 4 se divisible nahi, to leap year nahi hai
    }
  }

  // Method 2: Short condition ke saath leap year check kar rahe hai
  public static void checkLeapYearUsingSingleCondition() {
    int year = 2016; // Year jise check karna hai
    if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
      System.out.println("Leap Year"); // Leap year hai
    } else {
      System.out.println("Not a Leap Year"); // Leap year nahi hai
    }
  }

  public static void main(String[] args) {
    checkLeapYearUsingNestedIf(); // Pehla method call
    checkLeapYearUsingSingleCondition(); // Dusra method call
  }
}
