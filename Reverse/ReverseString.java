package Reverse;

public class ReverseString {
  public static void main(String[] args) {
    String name = "Amaan";
    String revString = "";
    int length = name.length();
    {
      /*
       * length is 5 but the index starts from 0 so length - 1 that is 4
       */
    }
    for (int i = length - 1; i >= 0; i--) {
      revString = revString + name.charAt(i);
    }
    System.out.println("Reverse String is :- " + revString);

  }
}
