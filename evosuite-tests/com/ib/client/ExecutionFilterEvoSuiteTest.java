/*
 * This file was automatically generated by EvoSuite
 */

package com.ib.client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import com.ib.client.ExecutionFilter;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExecutionFilterEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter();
      boolean boolean0 = executionFilter0.equals((Object) null);
      assertEquals(0, executionFilter0.m_clientId);
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter((-2), "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4");
      ExecutionFilter executionFilter1 = new ExecutionFilter();
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals((-2), executionFilter0.m_clientId);
      assertEquals(0, executionFilter1.m_clientId);
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter((-2), "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4");
      ExecutionFilter executionFilter1 = new ExecutionFilter((-2), "", "", "", "", "", "");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals(false, boolean0);
      assertEquals((-2), executionFilter1.m_clientId);
  }

  @Test
  public void test3()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter((-2), "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4");
      ExecutionFilter executionFilter1 = new ExecutionFilter((-2), "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "t${L|6V.gUo!sff4", "", "t${L|6V.gUo!sff4", "");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals(false, boolean0);
      assertEquals((-2), executionFilter1.m_clientId);
  }

  @Test
  public void test4()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter(0, "", "", "", "", "", "");
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "", "OB", "", "", "", "");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertFalse(executionFilter1.equals(executionFilter0));
      assertEquals(0, executionFilter0.m_clientId);
      assertEquals(false, boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter((-2), "", "", "", "", "", "");
      ExecutionFilter executionFilter1 = new ExecutionFilter((-2), "", "", "t${L|6V.gUo!sff4", "", "", "");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals(false, boolean0);
      assertEquals((-2), executionFilter1.m_clientId);
      assertFalse(executionFilter1.equals(executionFilter0));
  }

  @Test
  public void test6()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter(0, "", "", "", "", "", "");
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "", "", "", "", "", "OB");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals(0, executionFilter1.m_clientId);
      assertFalse(executionFilter1.equals(executionFilter0));
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter(0, "7", "7", "7", "7", "7", "7");
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "7", "7", "7", "7", "[po6>`~u67v9o-!n", "[po6>`~u67v9o-!n");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      ExecutionFilter executionFilter0 = new ExecutionFilter(0, "7", "7", "7", "7", "7", "7");
      ExecutionFilter executionFilter1 = new ExecutionFilter(0, "7", "7", "7", "7", "7", "7");
      boolean boolean0 = executionFilter0.equals((Object) executionFilter1);
      assertEquals(true, boolean0);
  }
}