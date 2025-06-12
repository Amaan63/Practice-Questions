package Sorting.BubbleSort;

public class BubbleSortNumber {

  // Array jisey sort karna hai
  static int[] a = { 36, 19, 29, 12, 5 };

  public static void ascendingSort() {
    System.out.println("Sorting in Ascending Order:--");
    int temp;

    // Outer loop → total rounds ke liye (n elements ke liye n-1 rounds)
    for (int i = 0; i < a.length; i++) {
      int flag = 0; // Flag check karega ki koi swapping hui ya nahi

      // Inner loop → har round mein adjacent elements compare karne ke liye
      for (int j = 0; j < a.length - 1 - i; j++) {
        // Agar left wala element right se bada hai, to swap karo
        if (a[j] > a[j + 1]) {
          temp = a[j]; // bada element temp mein store karo
          a[j] = a[j + 1]; // chhote wale ko left side le aao
          a[j + 1] = temp; // bada element right side bhej do
          flag = 1; // swapping hui, to flag 1 set karo
        }
      }

      // Agar kisi round mein koi swapping nahi hui to array already sorted hai
      if (flag == 0) {
        break; // loop break kar do
      }
    }

    // Sorted array ko print karo
    for (int i : a) {
      System.out.print(i + ",");
    }
    System.out.println();
  }

  public static void descendingSort() {
    System.out.println("Sorting in Descending Order:--");
    int temp; // Temporary variable for swapping

    // Bahar wala loop - ye number of passes ke liye hai
    for (int i = 0; i < a.length; i++) {
      int flag = 0; // Agar koi swapping nahi hoti to loop break karne ke liye flag use kiya

      // Andar wala loop - har round mein neighbours compare karta hai
      for (int j = 0; j < a.length - 1 - i; j++) {
        // Yaha descending order ke liye condition lagayi gayi hai
        if (a[j] < a[j + 1]) { // Agar left number chhota ho to swap karna hai
          // Pehle chhota number ko temp mein store karo
          temp = a[j];

          // Fir dono elements ko swap karo
          a[j] = a[j + 1];
          a[j + 1] = temp;

          // Flag ko 1 set karo, matlab swapping hui hai
          flag = 1;
        }
      }

      // Agar ek bhi swapping nahi hui to array already sorted hai
      if (flag == 0) {
        break; // Loop ko break kar do
      }
    }

    // Sorted array ko print karo (Descending order)
    for (int i : a) {
      System.out.print(i + ",");
    }
  }

  public static void main(String[] args) {
    ascendingSort();
    descendingSort();
  }
}
