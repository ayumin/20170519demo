package com.example;

public class Sample {
    public static int num() {
     return 10;
    }

    public static boolean isPrimeNum(int n) {
      int m = 0;

      if (n <= 1) { return false; }
      if (n == 2) { return true; }
      if (n % 2 == 0) { return false; }

      m = n;

      for(int i = 3; i < m; ++i) {
        if (n % i == 0) {
          System.out.println(n + "は" + i + "で割り切れるので素数ではない");
          return false;
        }
      }
      System.out.println(n + "は素数");
      return true;
    }
}