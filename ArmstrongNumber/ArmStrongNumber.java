package ArmstrongNumber;

public class ArmStrongNumber {
  {
    /*
     * Arm Strong Numbers
     * Jaise 153 = 1³ + 5³ + 3³ = 153
     */
  }

  public static void main(String[] args) {
    int no = 153;       // Check karne ke liye number
    int t1 = no;
    int length = 0;

    // Step 1: Number ki length (kitne digits hain) find karo
    while (t1 != 0) {
      length = length + 1;
      t1 = t1 / 10;
    }

    // Step 2: Har digit ka 'length' times multiplication karke add karo
    int t2 = no;
    int rem;
    int arm = 0;

    while (t2 != 0) {
      rem = t2 % 10;      // Last digit nikalo
      int multi = 1;

      // Digit ko length times multiply karo (power n ka effect)
      for (int i = 1; i <= length; i++) {
        multi = multi * rem;
      }

      arm = arm + multi;  // Add karo armstrong total mein
      t2 = t2 / 10;       // Last digit hatao
    }

    // Step 3: Compare karo original number se
    if (no == arm) {
      System.out.println(no + " Is an Armstrong Number");
    } else {
      System.out.println(no + " Is not an Armstrong Number");
    }
  }
}
