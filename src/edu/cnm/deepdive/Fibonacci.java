package edu.cnm.deepdive;

public class Fibonacci {
    public static long fibonacci(int n) {
      if (n < 1) {
        return 0;
      } else if (n == 1) {
        return 1;
      }
      return fibonacci(n-1) + fibonacci(n-1);
    }
}
