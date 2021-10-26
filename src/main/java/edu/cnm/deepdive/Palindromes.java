package edu.cnm.deepdive;

public abstract class Palindromes {

  public static boolean checkRecursive(String input) {
    int length = input.length();
    return (length <= 1)
        || (input.charAt(0) == input.charAt(length - 1)
            && checkRecursive(input.substring(1, length - 1)));
  }
}
