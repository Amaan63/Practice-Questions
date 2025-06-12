package Anagram;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
    // Do strings jinko compare karna hai
    String str1 = "LISTEN";
    String str2 = "SILENT";

    // Strings ko character array mein convert karo
    char[] a = str1.toCharArray(); // str1 ko char array mein badlo
    char[] b = str2.toCharArray(); // str2 ko char array mein badlo

    // Dono arrays ko sort karo
    Arrays.sort(a); // a array ko ascending order mein sort karo
    Arrays.sort(b); // b array ko ascending order mein sort karo

    // Dono arrays ko compare karo
    boolean result = Arrays.equals(a, b); // agar same hai to true return hoga

    // Result print karo
    if (result) {
      System.out.println("Strings Are Anagram"); // Agar sorted arrays same hai
    } else {
      System.out.println("Strings Are Not Anagram"); // Agar same nahi hai
    }
  }
}
