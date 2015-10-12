/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TCharFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharSet;
import gnu.trove.map.TCharCharMap;
import gnu.trove.map.hash.TCharCharHashMap;
import gnu.trove.procedure.TCharCharProcedure;
import gnu.trove.procedure.TCharProcedure;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableCharCharMapEvoSuite_Branch {

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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap$1.value()C: root-Branch
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap$1.hasNext()Z: root-Branch
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableCharCharMap;)V: root-Branch
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap$1.advance()V: root-Branch
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap$1.key()C: root-Branch
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.size()I: root-Branch
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.iterator()Lgnu/trove/iterator/TCharCharIterator;: root-Branch
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.<init>(Lgnu/trove/map/TCharCharMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      char[] charArray0 = new char[13];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      TCharCharHashMap tCharCharHashMap1 = new TCharCharHashMap((TCharCharMap) tUnmodifiableCharCharMap0);
      assertEquals(1, tUnmodifiableCharCharMap0.size());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.putAll(Ljava/util/Map;)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(774);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      HashMap<Character, Character> hashMap0 = new HashMap<Character, Character>();
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.putAll((Map<? extends Character, ? extends Character>) hashMap0);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.getNoEntryValue()C: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      char[] charArray0 = new char[7];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char0 = tUnmodifiableCharCharMap0.getNoEntryValue();
      assertEquals('\u0000', char0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.increment(C)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(1794, (float) 1794, '_', '_');
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.increment('_');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.adjustOrPutValue(CCC)C: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap((int) '\u0000');
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.adjustOrPutValue('\u0000', '\u0000', 'D');
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.containsValue(C)Z: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      boolean boolean0 = tUnmodifiableCharCharMap0.containsValue('<');
      assertEquals(false, boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.forEachKey(Lgnu/trove/procedure/TCharProcedure;)Z: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(3);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      boolean boolean0 = tUnmodifiableCharCharMap0.forEachKey((TCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.values([C)[C: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(1794, (float) 1794, '_', '_');
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char[] charArray0 = tUnmodifiableCharCharMap0.values(tCharCharHashMap0._set);
      assertNotNull(charArray0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.put(CC)C: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.put(')', ')');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.get(C)C: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      char[] charArray0 = new char[2];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char0 = tUnmodifiableCharCharMap0.get('|');
      assertEquals('\u0000', char0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.containsKey(C)Z: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(774);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      boolean boolean0 = tUnmodifiableCharCharMap0.containsKey(' ');
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.retainEntries(Lgnu/trove/procedure/TCharCharProcedure;)Z: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(156);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.retainEntries((TCharCharProcedure) null);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      String string0 = tUnmodifiableCharCharMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.values()[C: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char[] charArray0 = tUnmodifiableCharCharMap0.values();
      assertNotNull(charArray0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.getNoEntryKey()C: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char char0 = tUnmodifiableCharCharMap0.getNoEntryKey();
      assertEquals('\u0000', char0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.keys()[C: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      char[] charArray0 = new char[2];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char[] charArray1 = tUnmodifiableCharCharMap0.keys();
      assertFalse(charArray0.equals(charArray1));
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.forEachEntry(Lgnu/trove/procedure/TCharCharProcedure;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      boolean boolean0 = tUnmodifiableCharCharMap0.forEachEntry((TCharCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.remove(C)C: root-Branch
   */

  @Test
  public void test17()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(3);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.remove('5');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.putIfAbsent(CC)C: root-Branch
   */

  @Test
  public void test18()  throws Throwable  {
      char[] charArray0 = new char[2];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.putIfAbsent('\u0000', '|');
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.hashCode()I: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      int int0 = tUnmodifiableCharCharMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.keys([C)[C: root-Branch
   */

  @Test
  public void test20()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      char[] charArray0 = tUnmodifiableCharCharMap0.keys(tCharCharHashMap0._set);
      assertNotNull(charArray0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z: root-Branch
   */

  @Test
  public void test21()  throws Throwable  {
      char[] charArray0 = new char[7];
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(charArray0, charArray0);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.forEachValue((TCharProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test22()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      boolean boolean0 = tUnmodifiableCharCharMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 23
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.adjustValue(CC)Z: root-Branch
   */

  @Test
  public void test23()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(1076, 1076);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.adjustValue('0', '0');
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.clear()V: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap((-3), (float) (-3), ']', ']');
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.clear();
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.putAll(Lgnu/trove/map/TCharCharMap;)V: root-Branch
   */

  @Test
  public void test25()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.putAll((TCharCharMap) tUnmodifiableCharCharMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 26
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.transformValues(Lgnu/trove/function/TCharFunction;)V: root-Branch
   */

  @Test
  public void test26()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap(1);
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableCharCharMap0.transformValues((TCharFunction) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.<init>(Lgnu/trove/map/TCharCharMap;)V: I17 Branch 1 IFNONNULL L58 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = null;
      try {
        tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) null);
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
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L79 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.keySet()Lgnu/trove/set/TCharSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test28()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharSet tUnmodifiableCharSet0 = (TUnmodifiableCharSet)tUnmodifiableCharCharMap0.keySet();
      assertNotNull(tUnmodifiableCharSet0);
      
      TUnmodifiableCharSet tUnmodifiableCharSet1 = (TUnmodifiableCharSet)tUnmodifiableCharCharMap0.keySet();
      assertSame(tUnmodifiableCharSet1, tUnmodifiableCharSet0);
  }

  //Test case number: 29
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.valueCollection()Lgnu/trove/TCharCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.valueCollection()Lgnu/trove/TCharCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test29()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap((int) '\u0000');
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      TUnmodifiableCharCollection tUnmodifiableCharCollection0 = (TUnmodifiableCharCollection)tUnmodifiableCharCharMap0.valueCollection();
      assertNotNull(tUnmodifiableCharCollection0);
      
      TUnmodifiableCharCollection tUnmodifiableCharCollection1 = (TUnmodifiableCharCollection)tUnmodifiableCharCharMap0.valueCollection();
      assertSame(tUnmodifiableCharCollection1, tUnmodifiableCharCollection0);
  }

  //Test case number: 30
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableCharCharMap.<init>(Lgnu/trove/map/TCharCharMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test30()  throws Throwable  {
      TCharCharHashMap tCharCharHashMap0 = new TCharCharHashMap();
      TUnmodifiableCharCharMap tUnmodifiableCharCharMap0 = new TUnmodifiableCharCharMap((TCharCharMap) tCharCharHashMap0);
      boolean boolean0 = tUnmodifiableCharCharMap0.equals((Object) "zh-CN");
      assertEquals(false, boolean0);
  }
}
