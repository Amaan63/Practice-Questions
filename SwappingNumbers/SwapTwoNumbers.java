package SwappingNumbers;

public class SwapTwoNumbers {

  public static void swapTwoNumbersUsingThirdVariable() {
    int a = 10, b = 20;
    System.out.println("Before Swapping : a = " + a + "  b = " + b);
    int temporary;
    temporary = a;
    a = b;
    b = temporary;
    System.out.println("After Swapping : a = " + a + "  b = " + b);
  }

  public static void swapTwoNumbersWithoutUsingThirdVariable() {
    int a = 10, b = 20;
    System.out.println("Before Swapping : a = " + a + "  b = " + b);
    a = a + b; // 30 = 10 + 20
    b = a - b; // 10 = 30 - 20
    a = a - b; // 20 = 30 - 10
    System.out.println("After Swapping : a = " + a + "  b = " + b);
  }

  public static void main(String[] args) {
    swapTwoNumbersUsingThirdVariable();
    swapTwoNumbersWithoutUsingThirdVariable();
  }
}
