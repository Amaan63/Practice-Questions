package Sorting.BubbleSort;

public class BubbleSortString {

  // String array jise sort karna hai
  static String[] names = { "Zara", "Amit", "John", "Kiran", "Bob" };

  // Ascending sort method
  public static void ascendingSort() {
    System.out.println("Sorting in Ascending Order:--");
    String temp;

    // Outer loop → total rounds ke liye
    for (int i = 0; i < names.length; i++) {
      int flag = 0;

      // Inner loop → har round mein adjacent elements compare karne ke liye
      for (int j = 0; j < names.length - 1 - i; j++) {
        // Agar left string alphabetically bada hai, to swap karo
        if (names[j].compareTo(names[j + 1]) > 0) {
          temp = names[j];
          names[j] = names[j + 1];
          names[j + 1] = temp;
          flag = 1;
        }
      }

      // Agar kisi round mein swapping nahi hui, to already sorted hai
      if (flag == 0) {
        break;
      }
    }

    // Sorted array ko print karo
    for (String name : names) {
      System.out.print(name + ",");
    }
    System.out.println(); // New line ke liye
  }

  // Descending sort method
  public static void descendingSort() {
    System.out.println("Sorting in Descending Order:--");
    String temp;

    // Outer loop → total rounds
    for (int i = 0; i < names.length; i++) {
      int flag = 0;

      // Inner loop → neighbours compare karne ke liye
      for (int j = 0; j < names.length - 1 - i; j++) {
        // Descending order ke liye: agar left string chhoti ho, to swap karo
        if (names[j].compareTo(names[j + 1]) < 0) {
          temp = names[j];
          names[j] = names[j + 1];
          names[j + 1] = temp;
          flag = 1;
        }
      }

      // Agar swapping nahi hui, to array already sorted hai
      if (flag == 0) {
        break;
      }
    }

    // Sorted array ko print karo
    for (String name : names) {
      System.out.print(name + ",");
    }
    System.out.println(); // New line ke liye
  }

  public static void main(String[] args) {
    ascendingSort(); // Pehle ascending sort
    descendingSort(); // Fir descending sort
  }
}
