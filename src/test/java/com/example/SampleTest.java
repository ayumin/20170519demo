package com.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class SampleTest {

   @Test
   public void testNum() {
      assertEquals(10, Sample.num());
   }
}