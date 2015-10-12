/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedShortSet;
import gnu.trove.set.TShortSet;
import gnu.trove.set.hash.TShortHashSet;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedShortSetEvoSuite_Branch {

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
   * 1 gnu.trove.impl.sync.TSynchronizedShortSet.equals(Ljava/lang/Object;)Z: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortSet.<init>(Lgnu/trove/set/TShortSet;)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TShortHashSet tShortHashSet0 = new TShortHashSet((-689));
      TSynchronizedShortSet tSynchronizedShortSet0 = new TSynchronizedShortSet((TShortSet) tShortHashSet0);
      boolean boolean0 = tSynchronizedShortSet0.equals((Object) "");
      assertEquals(false, boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortSet.<init>(Lgnu/trove/set/TShortSet;Ljava/lang/Object;)V: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortSet.<init>(Lgnu/trove/set/TShortSet;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TShortHashSet tShortHashSet0 = new TShortHashSet((-689));
      TSynchronizedShortSet tSynchronizedShortSet0 = new TSynchronizedShortSet((TShortSet) tShortHashSet0);
      TSynchronizedShortSet tSynchronizedShortSet1 = new TSynchronizedShortSet((TShortSet) tSynchronizedShortSet0, (Object) "");
      assertNotSame(tSynchronizedShortSet0, tSynchronizedShortSet1);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.sync.TSynchronizedShortSet.hashCode()I: root-Branch
   * 2 gnu.trove.impl.sync.TSynchronizedShortSet.<init>(Lgnu/trove/set/TShortSet;Ljava/lang/Object;)V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      short[] shortArray0 = new short[8];
      TShortHashSet tShortHashSet0 = new TShortHashSet(shortArray0);
      TSynchronizedShortSet tSynchronizedShortSet0 = new TSynchronizedShortSet((TShortSet) tShortHashSet0, (Object) "R4/MYTA14&");
      int int0 = tSynchronizedShortSet0.hashCode();
      assertEquals(0, int0);
  }
}
