/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TShortFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteSet;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortCollection;
import gnu.trove.map.TByteShortMap;
import gnu.trove.map.hash.TByteShortHashMap;
import gnu.trove.procedure.TByteProcedure;
import gnu.trove.procedure.TByteShortProcedure;
import gnu.trove.procedure.TShortProcedure;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableByteShortMapEvoSuite_Branch {

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
   * 8 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap$1.hasNext()Z: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap$1.value()S: root-Branch
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap$1.advance()V: root-Branch
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap$1.key()B: root-Branch
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableByteShortMap;)V: root-Branch
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.size()I: root-Branch
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.iterator()Lgnu/trove/iterator/TByteShortIterator;: root-Branch
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.<init>(Lgnu/trove/map/TByteShortMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      short[] shortArray0 = new short[1];
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(byteArray0, shortArray0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      TByteShortHashMap tByteShortHashMap1 = new TByteShortHashMap((TByteShortMap) tUnmodifiableByteShortMap0);
      assertEquals(1, tUnmodifiableByteShortMap0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.keys([B)[B: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap();
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      byte[] byteArray0 = tUnmodifiableByteShortMap0.keys(tByteShortHashMap0._set);
      assertNotNull(byteArray0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.increment(B)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(19845868, (float) 19845868, (byte) (-12), (short) (byte) (-12));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.increment((byte) (-12));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.get(B)S: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(32756);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      short short0 = tUnmodifiableByteShortMap0.get((byte) (-3));
      assertEquals((short)0, short0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.keys()[B: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1265));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      byte[] byteArray0 = tUnmodifiableByteShortMap0.keys();
      assertNotNull(byteArray0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.containsValue(S)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(32756);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.containsValue((short) (byte) (-3));
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.values()[S: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(19845868, (float) 19845868, (byte) (-12), (short) (byte) (-12));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      short[] shortArray0 = tUnmodifiableByteShortMap0.values();
      assertNotNull(shortArray0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(0, (float) (byte)0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.getNoEntryKey()B: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1265));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      byte byte0 = tUnmodifiableByteShortMap0.getNoEntryKey();
      assertEquals((byte)0, byte0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.adjustValue(BS)Z: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      short[] shortArray0 = new short[1];
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(byteArray0, shortArray0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.adjustValue((byte)2, (byte)2);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(0, (float) 0, (byte) (-1), (short) (byte) (-1));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      String string0 = tUnmodifiableByteShortMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.putAll(Lgnu/trove/map/TByteShortMap;)V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-32749));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.putAll((TByteShortMap) tUnmodifiableByteShortMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.containsKey(B)Z: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(0, (float) 0, (byte) (-1), (short) (byte) (-1));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.containsKey((byte) (-1));
      assertEquals(false, boolean0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.transformValues(Lgnu/trove/function/TShortFunction;)V: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      short[] shortArray0 = new short[10];
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(byteArray0, shortArray0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.transformValues((TShortFunction) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.clear()V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1949));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.remove(B)S: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1265));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.remove((byte)0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.putIfAbsent(BS)S: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap();
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.putIfAbsent((byte) (-1), (byte) (-1));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.getNoEntryValue()S: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(32756);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      short short0 = tUnmodifiableByteShortMap0.getNoEntryValue();
      assertEquals((short)0, short0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1949));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.forEachKey((TByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.put(BS)S: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap();
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.put((byte)48, (byte)48);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.adjustOrPutValue(BSS)S: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      short[] shortArray0 = new short[12];
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(byteArray0, shortArray0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.adjustOrPutValue((byte)4, (short)0, (short)0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.forEachValue(Lgnu/trove/procedure/TShortProcedure;)Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-32749));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.forEachValue((TShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.retainEntries(Lgnu/trove/procedure/TByteShortProcedure;)Z: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap();
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.retainEntries((TByteShortProcedure) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1434), (float) (-1434), (byte) (-18), (short)1172);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      HashMap<Byte, Short> hashMap0 = new HashMap<Byte, Short>((int) (short)1172);
      // Undeclared exception!
      try {
        tUnmodifiableByteShortMap0.putAll((Map<? extends Byte, ? extends Short>) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.hashCode()I: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      short[] shortArray0 = new short[1];
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(byteArray0, shortArray0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      int int0 = tUnmodifiableByteShortMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.forEachEntry(Lgnu/trove/procedure/TByteShortProcedure;)Z: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-1949));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.forEachEntry((TByteShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.values([S)[S: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      short[] shortArray0 = new short[1];
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(byteArray0, shortArray0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      short[] shortArray1 = tUnmodifiableByteShortMap0.values(shortArray0);
      assertSame(shortArray1, shortArray0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.<init>(Lgnu/trove/map/TByteShortMap;)V: I17 Branch 1 IFNONNULL L58 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = null;
      try {
        tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.keySet()Lgnu/trove/set/TByteSet;: I4 Branch 2 IFNONNULL L79 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.keySet()Lgnu/trove/set/TByteSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test28()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-32749));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      TUnmodifiableByteSet tUnmodifiableByteSet0 = (TUnmodifiableByteSet)tUnmodifiableByteShortMap0.keySet();
      assertNotNull(tUnmodifiableByteSet0);
      
      TUnmodifiableByteSet tUnmodifiableByteSet1 = (TUnmodifiableByteSet)tUnmodifiableByteShortMap0.keySet();
      assertSame(tUnmodifiableByteSet1, tUnmodifiableByteSet0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.valueCollection()Lgnu/trove/TShortCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.valueCollection()Lgnu/trove/TShortCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test29()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(0, (float) 0, (byte) (-1), (short) (byte) (-1));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      TUnmodifiableShortCollection tUnmodifiableShortCollection0 = (TUnmodifiableShortCollection)tUnmodifiableByteShortMap0.valueCollection();
      assertNotNull(tUnmodifiableShortCollection0);
      
      TUnmodifiableShortCollection tUnmodifiableShortCollection1 = (TUnmodifiableShortCollection)tUnmodifiableByteShortMap0.valueCollection();
      assertSame(tUnmodifiableShortCollection1, tUnmodifiableShortCollection0);
  }

  //Test case number: 30
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - false
   */

  @Test
  public void test30()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap((-32749));
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.equals((Object) tByteShortHashMap0);
      assertEquals(true, boolean0);
  }

  //Test case number: 31
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteShortMap.<init>(Lgnu/trove/map/TByteShortMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test31()  throws Throwable  {
      TByteShortHashMap tByteShortHashMap0 = new TByteShortHashMap(0, (float) (byte)0);
      TUnmodifiableByteShortMap tUnmodifiableByteShortMap0 = new TUnmodifiableByteShortMap((TByteShortMap) tByteShortHashMap0);
      boolean boolean0 = tUnmodifiableByteShortMap0.equals((Object) (byte)0);
      assertEquals(false, boolean0);
  }
}
