/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 19 09:05:39 GMT 2023
 */

package com.ib.client;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.ib.client.Util;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Util_ESTest extends Util_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      Object object0 = new Object();
      vector0.add(object0);
      Vector<Object> vector1 = new Vector<Object>();
      vector1.add((Object) vector0);
      vector0.add(object0);
      vector1.add(object0);
      boolean boolean0 = Util.VectorEqualsUnordered(vector0, vector1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>(2283, (-881));
      vector0.add("");
      Vector<Object> vector1 = new Vector<Object>();
      boolean boolean0 = Util.VectorEqualsUnordered(vector0, vector1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = Util.StringCompareIgnCase("<;mz)A1O]VJDi", "");
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = Util.StringCompareIgnCase("", "2u^McbM|T%");
      assertEquals((-10), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = Util.StringCompare("-3588.5142", "");
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      int int0 = Util.StringCompare("0", "D1Kmqwx(99\"8");
      assertEquals((-20), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Util.NormalizeString("mm bkw-qD}MYA+");
      assertEquals("mm bkw-qD}MYA+", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) null);
      Vector<Object> vector1 = new Vector<Object>(vector0);
      // Undeclared exception!
      try { 
        Util.VectorEqualsUnordered(vector0, vector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.ib.client.Util", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Util.NormalizeString("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Util.DoubleMaxString(1.7976931348623157E308);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String string0 = Util.DoubleMaxString(0.0);
      assertEquals("0.0", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = Util.IntMaxString(Integer.MAX_VALUE);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = Util.IntMaxString(0);
      assertEquals("0", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      vector0.add((Object) "");
      Integer integer0 = new Integer((-17));
      vector0.add((Object) integer0);
      Vector<Object> vector1 = new Vector<Object>(vector0);
      boolean boolean0 = Util.VectorEqualsUnordered(vector0, vector1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>(2283, (-881));
      vector0.add("");
      boolean boolean0 = Util.VectorEqualsUnordered((Vector) null, vector0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector<String> vector0 = new Vector<String>(2283, (-881));
      boolean boolean0 = Util.VectorEqualsUnordered(vector0, (Vector) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector<Object> vector0 = new Vector<Object>();
      boolean boolean0 = Util.VectorEqualsUnordered(vector0, vector0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = Util.NormalizeString((String) null);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Util.StringIsEmpty("0.0");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = Util.StringIsEmpty("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Util.StringIsEmpty((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = Util.StringCompare("Z", "Z");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = Util.StringCompareIgnCase("", "");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Util util0 = new Util();
  }
}
