package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class FactorialsTest {

  static final int[] args = {
      0,
      1,
      5,
      10,
      13,
  };

  static final long[] expectedValues = {
      1,
      1,
      120,
      3628800,
      6227020800L,

  };


  @Test
  void computeRecursive_nonNegative() {
    for (int i = 0; i < args.length; i++) {
      int n = args[i];
      long expected = expectedValues[i];
      long actual = Factorials.computeRecursive(n);
      assertEquals(expected, actual);

    }

  }

  @Test
  void computeRecursive_negative_exception() {
    assertThrows(IllegalArgumentException.class,
        () -> Factorials.computeRecursive(-1));
  }
}