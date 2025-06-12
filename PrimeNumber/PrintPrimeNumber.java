package PrimeNumber;

public class PrintPrimeNumber {
  public static void main(String[] args) {
    int temp = 0;

    // 1 se 100 tak ke numbers ke liye loop
    for (int i = 1; i <= 100; i++) {

      {
        /*
         * Har number ke liye check karo kya wo kisi aur number se divide hota hai ya nahi
         */
      }
      for (int j = 2; j <= i - 1; j++) {
        if (i % j == 0) {
          temp = temp + 1; // Agar divide hota hai to prime nahi hai
        }
      }

      // Agar temp 0 hai to number prime hai
      if (temp == 0) {
        System.out.print(i + ","); // Prime number print karo
      } else {
        temp = 0; // temp reset karo next number ke liye
      }
    }
  }
}
