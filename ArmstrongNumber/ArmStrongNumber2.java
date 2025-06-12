public class ArmStrongNumber2 {
  public static void main(String[] args) {
    int n = 153;
    int temp = n;
    int arm = 0, rem;
    while (temp > 0) {
      rem = temp % 10;
      arm = (rem * rem * rem) + arm;
      temp = temp / 10;
    }
    if (arm == n) {
      System.out.println("ArmStrong Number");
    } else {
      System.out.println("Not An Armstrong Number");
    }
  }
}
