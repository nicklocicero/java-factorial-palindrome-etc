package edu.cnm.deepdive;

import java.math.BigInteger;

public class Factorial {
  public static BigInteger iterative(int limit) {
    BigInteger product = BigInteger.ONE;
    for (int i = 2; i <= limit; i++) {
      product = product.multiply(BigInteger.valueOf(i));
    }
    return product;
  }

  public static BigInteger recursive(int limit) {
    if (limit <= 1) {
      return BigInteger.ONE;
    }
    return recursive(limit - 1).multiply(BigInteger.valueOf(limit));
  }

  public static void main(String[] args) {
    assert iterative(0).equals(BigInteger.ZERO) : "0! is 1 by definition";
    assert iterative(52).equals(recursive(52)) : "Recursive must give the same "
        + "result as iterative factorial.";
  }
}
