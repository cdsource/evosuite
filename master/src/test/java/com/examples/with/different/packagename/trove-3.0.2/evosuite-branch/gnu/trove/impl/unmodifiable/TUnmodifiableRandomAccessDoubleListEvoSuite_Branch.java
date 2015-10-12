/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessDoubleList;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.array.TDoubleArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableRandomAccessDoubleListEvoSuite_Branch {

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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessDoubleList.subList(II)Lgnu/trove/list/TDoubleList;: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessDoubleList.<init>(Lgnu/trove/list/TDoubleList;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(812);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList1 = (TUnmodifiableRandomAccessDoubleList)tUnmodifiableRandomAccessDoubleList0.subList(812, 812);
      assertNotNull(tUnmodifiableRandomAccessDoubleList1);
      assertEquals(0, tUnmodifiableRandomAccessDoubleList1.size());
  }
}
