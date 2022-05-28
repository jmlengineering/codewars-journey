/* 

Title : Return Negative
Date : May 25, 2022
Instruction : Simply  make a number negative that you are given.
My thought process:
1. Check if the given number is positive or already negative.
2. Use appropriate operation (or none) and return the number.

*/



public class Kata {

    public static int makeNegative(final int x) {
      if (x > 0) {
        return x * (-1);
      } else if (x < 0) {
        return x;
      } else {
        return 0;
      }
    }
  }