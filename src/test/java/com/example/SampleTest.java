package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {

   @Test
   public void testNum() {
      assertEquals(10, Sample.num());
   }

   @Test public void test0の素数判定() { assertFalse("0は素数ではない",Sample.isPrimeNum(0)); }
   @Test public void test1の素数判定() { assertFalse("1は素数ではない",Sample.isPrimeNum(1)); }
   @Test public void test2の素数判定() { assertTrue("2は素数",Sample.isPrimeNum(2)); }
   @Test public void test3の素数判定() { assertTrue("3は素数ではない",Sample.isPrimeNum(3)); }
   @Test public void test4の素数判定() { assertFalse("4は素数ではない",Sample.isPrimeNum(4)); }
   @Test public void test5の素数判定() { assertTrue("5は素数",Sample.isPrimeNum(5)); }
   @Test public void test6の素数判定() { assertFalse("6は素数ではない",Sample.isPrimeNum(6)); }
   @Test public void test7の素数判定() { assertTrue("7は素数",Sample.isPrimeNum(7)); }
   @Test public void test8の素数判定() { assertFalse("8は素数ではない",Sample.isPrimeNum(8)); }
   @Test public void test9の素数判定() { assertFalse("9は素数ではない", Sample.isPrimeNum(9)); }
   @Test public void test10の素数判定() { assertFalse("10は素数ではない", Sample.isPrimeNum(10)); }
   @Test public void test11の素数判定() { assertTrue("11は素数", Sample.isPrimeNum(11)); }
   @Test public void test97の素数判定() { assertTrue("97は素数", Sample.isPrimeNum(97)); }
   @Test public void test2357の素数判定() { assertTrue("2357は素数", Sample.isPrimeNum(2357)); }
   @Test public void test99991の素数判定() { assertTrue("99991は素数", Sample.isPrimeNum(99991)); }
   @Test public void test524287の素数判定() { assertTrue("524287は素数", Sample.isPrimeNum(524287)); }
   @Test public void test524289の素数判定() { assertFalse("524289は素数ではない", Sample.isPrimeNum(524289)); }
}