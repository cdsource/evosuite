/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TIntFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortSet;
import gnu.trove.map.TShortIntMap;
import gnu.trove.map.hash.TShortIntHashMap;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.procedure.TShortIntProcedure;
import gnu.trove.procedure.TShortProcedure;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableShortIntMapEvoSuite_Branch {

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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap$1.value()I: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableShortIntMap;)V: root-Branch
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap$1.advance()V: root-Branch
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap$1.hasNext()Z: root-Branch
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap$1.key()S: root-Branch
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.size()I: root-Branch
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.iterator()Lgnu/trove/iterator/TShortIntIterator;: root-Branch
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.<init>(Lgnu/trove/map/TShortIntMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      short[] shortArray0 = new short[9];
      int[] intArray0 = new int[6];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      TShortIntHashMap tShortIntHashMap1 = new TShortIntHashMap((TShortIntMap) tUnmodifiableShortIntMap0);
      assertEquals(1, tUnmodifiableShortIntMap0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.put(SI)I: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(555, (float) 555, (short)9, (int) (short)9);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.put((short)0, (short)9);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      String string0 = tUnmodifiableShortIntMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.keys()[S: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      short[] shortArray0 = tUnmodifiableShortIntMap0.keys();
      assertNotNull(shortArray0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.putIfAbsent(SI)I: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.putIfAbsent((short) (byte) (-45), (int) (byte) (-45));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(84, 84);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      HashMap<Short, Integer> hashMap0 = new HashMap<Short, Integer>();
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.putAll((Map<? extends Short, ? extends Integer>) hashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.putAll(Lgnu/trove/map/TShortIntMap;)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((int) (short)881);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.putAll((TShortIntMap) tShortIntHashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((int) (short)0, (float) (short)0);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.forEachValue((TIntProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.containsKey(S)Z: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.containsKey((short) (-577));
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.values()[I: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      int[] intArray0 = tUnmodifiableShortIntMap0.values();
      assertNotNull(intArray0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.adjustOrPutValue(SII)I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      short[] shortArray0 = new short[8];
      int[] intArray0 = new int[5];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.adjustOrPutValue((short)0, 0, 0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.adjustValue(SI)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(1171);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.adjustValue((short)0, 1171);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.values([I)[I: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      short[] shortArray0 = new short[9];
      int[] intArray0 = new int[6];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      int[] intArray1 = tUnmodifiableShortIntMap0.values(intArray0);
      assertSame(intArray0, intArray1);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.getNoEntryKey()S: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      short[] shortArray0 = new short[9];
      int[] intArray0 = new int[6];
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(shortArray0, intArray0);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      short short0 = tUnmodifiableShortIntMap0.getNoEntryKey();
      assertEquals((short)0, short0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.keys([S)[S: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      short[] shortArray0 = tUnmodifiableShortIntMap0.keys(tShortIntHashMap0._set);
      assertNotNull(shortArray0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(1171);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.forEachKey((TShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.containsValue(I)Z: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(555, (float) 555, (short)9, (int) (short)9);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.containsValue(555);
      assertEquals(false, boolean0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.getNoEntryValue()I: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      int int0 = tUnmodifiableShortIntMap0.getNoEntryValue();
      assertEquals(0, int0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.clear()V: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.clear();
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.increment(S)Z: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.increment((short)78);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.hashCode()I: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      int int0 = tUnmodifiableShortIntMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.remove(S)I: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((int) (short)0, (float) (short)0);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.remove((short)0);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.transformValues(Lgnu/trove/function/TIntFunction;)V: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.transformValues((TIntFunction) null);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.retainEntries(Lgnu/trove/procedure/TShortIntProcedure;)Z: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableShortIntMap0.retainEntries((TShortIntProcedure) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 25
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.get(S)I: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      int int0 = tUnmodifiableShortIntMap0.get((short) (byte) (-45));
      assertEquals(0, int0);
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.forEachEntry(Lgnu/trove/procedure/TShortIntProcedure;)Z: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.forEachEntry((TShortIntProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.<init>(Lgnu/trove/map/TShortIntMap;)V: I17 Branch 1 IFNONNULL L58 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = null;
      try {
        tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) null);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.keySet()Lgnu/trove/set/TShortSet;: I4 Branch 2 IFNONNULL L79 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.keySet()Lgnu/trove/set/TShortSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test28()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap(1171);
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      TUnmodifiableShortSet tUnmodifiableShortSet0 = (TUnmodifiableShortSet)tUnmodifiableShortIntMap0.keySet();
      assertNotNull(tUnmodifiableShortSet0);
      
      TUnmodifiableShortSet tUnmodifiableShortSet1 = (TUnmodifiableShortSet)tUnmodifiableShortIntMap0.keySet();
      assertSame(tUnmodifiableShortSet1, tUnmodifiableShortSet0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.valueCollection()Lgnu/trove/TIntCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.valueCollection()Lgnu/trove/TIntCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test29()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap();
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      TUnmodifiableIntCollection tUnmodifiableIntCollection0 = (TUnmodifiableIntCollection)tUnmodifiableShortIntMap0.valueCollection();
      assertNotNull(tUnmodifiableIntCollection0);
      
      TUnmodifiableIntCollection tUnmodifiableIntCollection1 = (TUnmodifiableIntCollection)tUnmodifiableShortIntMap0.valueCollection();
      assertSame(tUnmodifiableIntCollection1, tUnmodifiableIntCollection0);
  }

  //Test case number: 30
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortIntMap.<init>(Lgnu/trove/map/TShortIntMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test30()  throws Throwable  {
      TShortIntHashMap tShortIntHashMap0 = new TShortIntHashMap((-385));
      TUnmodifiableShortIntMap tUnmodifiableShortIntMap0 = new TUnmodifiableShortIntMap((TShortIntMap) tShortIntHashMap0);
      boolean boolean0 = tUnmodifiableShortIntMap0.equals((Object) "37777777177");
      assertEquals(false, boolean0);
  }
}
