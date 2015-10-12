/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessFloatList;
import gnu.trove.list.TFloatList;
import gnu.trove.list.linked.TFloatLinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableRandomAccessFloatListEvoSuite_Branch {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.loadLogbackForEvoSuite(); 
    org.evosuite.Properties.REPLACE_CALLS = true; 
    org.evosuite.agent.InstrumentingAgent.initialize(); 
  } 

  @Before 
  public void initTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    org.evosuite.agent.InstrumentingAgent.deactivate(); 
  } 


  //Test case number: 0
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessFloatList.subList(II)Lgnu/trove/list/TFloatList;: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessFloatList.<init>(Lgnu/trove/list/TFloatList;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TFloatLinkedList tFloatLinkedList0 = new TFloatLinkedList();
      TUnmodifiableRandomAccessFloatList tUnmodifiableRandomAccessFloatList0 = new TUnmodifiableRandomAccessFloatList((TFloatList) tFloatLinkedList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessFloatList0.subList(278, 278);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // begin index 278 greater than last index 0
         //
      }
  }
}
