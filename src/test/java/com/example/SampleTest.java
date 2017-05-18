package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {

   @Test
   public void testNum() {
    assertEquals(10, Sample.num());
   }

   @Test
   public void testMultiply1() {
    assertEquals("1x1",1,Sample.multiply(1,1));
    assertEquals("1x2",2,Sample.multiply(1,2));
    assertEquals("1x3",3,Sample.multiply(1,3));
    assertEquals("1x4",4,Sample.multiply(1,4));
    assertEquals("1x5",5,Sample.multiply(1,5));
    assertEquals("1x6",6,Sample.multiply(1,6));
    assertEquals("1x7",7,Sample.multiply(1,7));
    assertEquals("1x8",8,Sample.multiply(1,8));
    assertEquals("1x9",9,Sample.multiply(1,9));
  }
  @Test
  public void testMultiply2() {
    assertEquals("2x1",2,Sample.multiply(2,1));
    assertEquals("2x2",4,Sample.multiply(2,2));
    assertEquals("2x3",6,Sample.multiply(2,3));
    assertEquals("2x4",8,Sample.multiply(2,4));
    assertEquals("2x5",10,Sample.multiply(2,5));
    assertEquals("2x6",12,Sample.multiply(2,6));
    assertEquals("2x7",14,Sample.multiply(2,7));
    assertEquals("2x8",16,Sample.multiply(2,8));
    assertEquals("2x9",18,Sample.multiply(2,9));
  }
  @Test
  public void testMultiply3() {
    assertEquals("3x1",3,Sample.multiply(3,1));
    assertEquals("3x2",6,Sample.multiply(3,2));
    assertEquals("3x3",9,Sample.multiply(3,3));
    assertEquals("3x4",12,Sample.multiply(3,4));
    assertEquals("3x5",15,Sample.multiply(3,5));
    assertEquals("3x6",18,Sample.multiply(3,6));
    assertEquals("3x7",21,Sample.multiply(3,7));
    assertEquals("3x8",24,Sample.multiply(3,8));
    assertEquals("3x9",27,Sample.multiply(3,9));
  }
  @Test
  public void testMultiply4() {
    assertEquals("4x1",4,Sample.multiply(4,1));
    assertEquals("4x2",8,Sample.multiply(4,2));
    assertEquals("4x3",12,Sample.multiply(4,3));
    assertEquals("4x4",16,Sample.multiply(4,4));
    assertEquals("4x5",20,Sample.multiply(4,5));
    assertEquals("4x6",24,Sample.multiply(4,6));
    assertEquals("4x7",28,Sample.multiply(4,7));
    assertEquals("4x8",32,Sample.multiply(4,8));
    assertEquals("4x9",36,Sample.multiply(4,9));
  }
  @Test
  public void testMultiply5() {
    assertEquals("5x1",5,Sample.multiply(5,1));
    assertEquals("5x2",10,Sample.multiply(5,2));
    assertEquals("5x3",15,Sample.multiply(5,3));
    assertEquals("5x4",20,Sample.multiply(5,4));
    assertEquals("5x5",25,Sample.multiply(5,5));
    assertEquals("5x6",30,Sample.multiply(5,6));
    assertEquals("5x7",35,Sample.multiply(5,7));
    assertEquals("5x8",40,Sample.multiply(5,8));
    assertEquals("5x9",45,Sample.multiply(5,9));
  }
  @Test
  public void testMultiply6() {
    assertEquals("6x1",6,Sample.multiply(6,1));
    assertEquals("6x2",12,Sample.multiply(6,2));
    assertEquals("6x3",18,Sample.multiply(6,3));
    assertEquals("6x4",24,Sample.multiply(6,4));
    assertEquals("6x5",30,Sample.multiply(6,5));
    assertEquals("6x6",36,Sample.multiply(6,6));
    assertEquals("6x7",42,Sample.multiply(6,7));
    assertEquals("6x8",48,Sample.multiply(6,8));
    assertEquals("6x9",54,Sample.multiply(6,9));
  }
  @Test
  public void testMultiply7() {
    assertEquals("7x1",7,Sample.multiply(7,1));
    assertEquals("7x2",14,Sample.multiply(7,2));
    assertEquals("7x3",21,Sample.multiply(7,3));
    assertEquals("7x4",28,Sample.multiply(7,4));
    assertEquals("7x5",35,Sample.multiply(7,5));
    assertEquals("7x6",42,Sample.multiply(7,6));
    assertEquals("7x7",49,Sample.multiply(7,7));
    assertEquals("7x8",56,Sample.multiply(7,8));
    assertEquals("7x9",63,Sample.multiply(7,9));
  }
  @Test
  public void testMultiply8() {
    assertEquals("8x1",8,Sample.multiply(8,1));
    assertEquals("8x2",16,Sample.multiply(8,2));
    assertEquals("8x3",24,Sample.multiply(8,3));
    assertEquals("8x4",32,Sample.multiply(8,4));
    assertEquals("8x5",40,Sample.multiply(8,5));
    assertEquals("8x6",48,Sample.multiply(8,6));
    assertEquals("8x7",56,Sample.multiply(8,7));
    assertEquals("8x8",64,Sample.multiply(8,8));
    assertEquals("8x9",72,Sample.multiply(8,9));
  }
  @Test
  public void testMultiply9() {
    assertEquals("9x1",9,Sample.multiply(9,1));
    assertEquals("9x2",18,Sample.multiply(9,2));
    assertEquals("9x3",27,Sample.multiply(9,3));
    assertEquals("9x4",36,Sample.multiply(9,4));
    assertEquals("9x5",45,Sample.multiply(9,5));
    assertEquals("9x6",54,Sample.multiply(9,6));
    assertEquals("9x7",63,Sample.multiply(9,7));
    assertEquals("9x8",72,Sample.multiply(9,8));
    assertEquals("9x9",81,Sample.multiply(9,9));
   }
}