/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TIntCollection;
import gnu.trove.function.TIntFunction;
import gnu.trove.map.TByteIntMap;
import gnu.trove.map.hash.TByteIntHashMap;
import gnu.trove.procedure.TByteIntProcedure;
import gnu.trove.procedure.TByteProcedure;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.TByteSet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TByteIntHashMapEvoSuite_Branch {

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
   * 10 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.removeAt(I)V: root-Branch
   * 2 gnu.trove.map.hash.TByteIntHashMap.remove(B)I: I14 Branch 46 IFLT L276 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.adjustOrPutValue(BII)I: I9 Branch 72 IFGE L491 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.adjustOrPutValue(BII)I: I58 Branch 73 IFEQ L502 - false
   * 5 gnu.trove.map.hash.TByteIntHashMap.setUp(I)I: root-Branch
   * 6 gnu.trove.map.hash.TByteIntHashMap.<init>(IF)V: root-Branch
   * 7 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - true
   * 8 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - false
   * 9 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - true
   * 10 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - false
   */

  @Test
  public void test0()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-6), (-6));
      tByteIntHashMap0.adjustOrPutValue((byte) (-1), (-697), (-697));
      assertEquals(1, tByteIntHashMap0.size());
      
      int int0 = tByteIntHashMap0.remove((byte) (-1));
      assertEquals((-697), int0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.containsKey(B)Z: root-Branch
   * 2 gnu.trove.map.hash.TByteIntHashMap.<init>(IFBI)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(144, (float) 144, (byte)99, (int) (byte)99);
      boolean boolean0 = tByteIntHashMap0.containsKey((byte)99);
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 8 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   * 2 gnu.trove.map.hash.TByteIntHashMap.<init>([B[I)V: I24 Branch 33 IF_ICMPGE L119 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.<init>([B[I)V: I24 Branch 33 IF_ICMPGE L119 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I12 Branch 40 IFGE L214 - false
   * 5 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I41 Branch 41 IFEQ L221 - true
   * 6 gnu.trove.map.hash.TByteIntHashMap.put(BI)I: root-Branch
   * 7 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I12 Branch 40 IFGE L214 - true
   * 8 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I41 Branch 41 IFEQ L221 - false
   */

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      int[] intArray0 = new int[3];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      // Undeclared exception!
      try {
        tByteIntHashMap0.forEachKey((TByteProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.keySet()Lgnu/trove/set/TByteSet;: root-Branch
   * 2 gnu.trove.map.hash.TByteIntHashMap$TKeyView.<init>(Lgnu/trove/map/hash/TByteIntHashMap;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-10), 0);
      TByteSet tByteSet0 = tByteIntHashMap0.keySet();
      assertEquals(true, tByteSet0.isEmpty());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.increment(B)Z: root-Branch
   * 2 gnu.trove.map.hash.TByteIntHashMap.adjustValue(BI)Z: I9 Branch 71 IFGE L477 - false
   */

  @Test
  public void test4()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(142, 142);
      boolean boolean0 = tByteIntHashMap0.increment((byte)0);
      assertEquals(false, boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.valueCollection()Lgnu/trove/TIntCollection;: root-Branch
   * 2 gnu.trove.map.hash.TByteIntHashMap$TValueView.<init>(Lgnu/trove/map/hash/TByteIntHashMap;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[6];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      TIntCollection tIntCollection0 = tByteIntHashMap0.valueCollection();
      assertEquals("{0=0}", tByteIntHashMap0.toString());
      assertEquals(17, tByteIntHashMap0.capacity());
      assertEquals(1, tIntCollection0.size());
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.clear()V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(144, (float) 144, (byte)99, (int) (byte)99);
      tByteIntHashMap0.clear();
      assertEquals("{}", tByteIntHashMap0.toString());
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I38 Branch 35 IFEQ L139 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I50 Branch 36 IFEQ L143 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.iterator()Lgnu/trove/iterator/TByteIntIterator;: root-Branch
   * 4 gnu.trove.map.hash.TByteIntHashMap.putAll(Lgnu/trove/map/TByteIntMap;)V: I15 Branch 43 IFEQ L243 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I10 Branch 34 IFEQ L133 - false
   * 6 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.<init>(Lgnu/trove/map/hash/TByteIntHashMap;Lgnu/trove/map/hash/TByteIntHashMap;)V: root-Branch
   */

//   @Test
//   public void test7()  throws Throwable  {
//       TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(999, (float) 999, (byte) (-79), 1994);
//       TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap((TByteIntMap) tByteIntHashMap0);
//       assertEquals(3, tByteIntHashMap1.capacity());
//       assertEquals(1994, tByteIntHashMap1.getNoEntryValue());
//       assertEquals(-79, tByteIntHashMap1.getNoEntryKey());
//   }

  //Test case number: 8
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.putIfAbsent(BI)I: I9 Branch 39 IFGE L205 - false
   */

  @Test
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[6];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      int int0 = tByteIntHashMap0.putIfAbsent((byte)0, 0);
      assertEquals(0, int0);
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals(17, tByteIntHashMap0.capacity());
  }

  //Test case number: 9
  /*
   * 14 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.get(B)I: I9 Branch 44 IFGE L253 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I84 Branch 78 IF_ICMPEQ L1200 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 74 IFNE L1184 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 75 IF_ICMPEQ L1188 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - true
   * 6 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - false
   * 7 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - true
   * 8 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - false
   * 9 gnu.trove.map.hash.TByteIntHashMap.putAll(Lgnu/trove/map/TByteIntMap;)V: I15 Branch 43 IFEQ L243 - false
   * 10 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I38 Branch 35 IFEQ L139 - true
   * 11 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I50 Branch 36 IFEQ L143 - true
   * 12 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.advance()V: root-Branch
   * 13 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.value()I: root-Branch
   * 14 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.key()B: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[14];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap((TByteIntMap) tByteIntHashMap0);
      tByteIntHashMap0._set = tByteIntHashMap1._states;
      boolean boolean0 = tByteIntHashMap0.equals((Object) tByteIntHashMap1);
      assertEquals("{0=0}", tByteIntHashMap1.toString());
      assertEquals("{1=0}", tByteIntHashMap0.toString());
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.isEmpty()Z: I5 Branch 45 IF_ICMPNE L268 - true
   */

  @Test
  public void test10()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((int) (byte)106, (float) 100009607, (byte)106, 100009607);
      tByteIntHashMap0.adjustOrPutValue((byte)106, 100009607, (-1293));
      boolean boolean0 = tByteIntHashMap0.isEmpty();
      assertEquals("{106=-1293}", tByteIntHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.isEmpty()Z: I5 Branch 45 IF_ICMPNE L268 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.<init>()V: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap();
      boolean boolean0 = tByteIntHashMap0.isEmpty();
      assertEquals(true, boolean0);
      assertEquals(23, tByteIntHashMap0.capacity());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.remove(B)I: I14 Branch 46 IFLT L276 - true
   */

  @Test
  public void test12()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(999, (float) 999, (byte) (-79), 1994);
      int int0 = tByteIntHashMap0.remove((byte) (-70));
      assertEquals(1994, int0);
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.keys()[B: I34 Branch 48 IF_ICMPNE L304 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.keys()[B: I27 Branch 47 IFLE L303 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.keys()[B: I27 Branch 47 IFLE L303 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.keys()[B: I34 Branch 48 IF_ICMPNE L304 - true
   */

  @Test
  public void test13()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-10), 0);
      tByteIntHashMap0.put((byte) (-104), 1437356741);
      tByteIntHashMap0.keys();
      assertEquals("{-104=1437356741}", tByteIntHashMap0.toString());
      assertEquals(false, tByteIntHashMap0.isEmpty());
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I10 Branch 49 IF_ICMPGE L315 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I37 Branch 50 IFLE L322 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I37 Branch 50 IFLE L322 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I44 Branch 51 IF_ICMPNE L323 - true
   */

  @Test
  public void test14()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap();
      byte[] byteArray0 = tByteIntHashMap0.keys(tByteIntHashMap0._states);
      assertNotNull(byteArray0);
      assertEquals(23, tByteIntHashMap0.capacity());
  }

  //Test case number: 15
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I10 Branch 49 IF_ICMPGE L315 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I44 Branch 51 IF_ICMPNE L323 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I37 Branch 50 IFLE L322 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I37 Branch 50 IFLE L322 - false
   * 5 gnu.trove.map.hash.TByteIntHashMap.keys([B)[B: I44 Branch 51 IF_ICMPNE L323 - true
   * 6 gnu.trove.map.hash.TByteIntHashMap.<init>(I)V: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[1] = (byte) (-50);
      byteArray0[3] = (byte)10;
      byteArray0[4] = (byte)72;
      int[] intArray0 = new int[5];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(143);
      tByteIntHashMap0.compact();
      TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap(byteArray0, intArray0);
      tByteIntHashMap1.keys(tByteIntHashMap0._states);
      assertEquals(3, tByteIntHashMap0.capacity());
      assertEquals(23, tByteIntHashMap1.capacity());
      assertEquals("{10=0, 72=0, -50=0, 0=0}", tByteIntHashMap1.toString());
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.values()[I: I27 Branch 52 IFLE L343 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.values()[I: I27 Branch 52 IFLE L343 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.values()[I: I34 Branch 53 IF_ICMPNE L344 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.values()[I: I34 Branch 53 IF_ICMPNE L344 - false
   */

  @Test
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[8];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      int[] intArray1 = tByteIntHashMap0.values();
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals("{0=0}", tByteIntHashMap0.toString());
      assertEquals(17, tByteIntHashMap0.capacity());
      assertNotNull(intArray1);
  }

  //Test case number: 17
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I10 Branch 54 IF_ICMPGE L355 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I37 Branch 55 IFLE L362 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I37 Branch 55 IFLE L362 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I44 Branch 56 IF_ICMPNE L363 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I44 Branch 56 IF_ICMPNE L363 - false
   */

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[6];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      int[] intArray1 = tByteIntHashMap0.values(intArray0);
      assertNotNull(intArray1);
      assertSame(intArray1, intArray0);
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals(17, tByteIntHashMap0.capacity());
      assertEquals("{0=0}", tByteIntHashMap0.toString());
  }

  //Test case number: 18
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I10 Branch 54 IF_ICMPGE L355 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I37 Branch 55 IFLE L362 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I37 Branch 55 IFLE L362 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I44 Branch 56 IF_ICMPNE L363 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.values([I)[I: I44 Branch 56 IF_ICMPNE L363 - false
   */

  @Test
  public void test18()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(142, 142);
      tByteIntHashMap0.adjustOrPutValue((byte)0, 142, 142);
      tByteIntHashMap0.put((byte)1, 142);
      int[] intArray0 = new int[1];
      tByteIntHashMap0.values(intArray0);
      assertEquals(2, tByteIntHashMap0.size());
      assertEquals("{1=142, 0=142}", tByteIntHashMap0.toString());
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I18 Branch 57 IFLE L376 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I18 Branch 57 IFLE L376 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I25 Branch 58 IF_ICMPNE L377 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I25 Branch 58 IF_ICMPNE L377 - false
   * 5 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I30 Branch 59 IF_ICMPNE L377 - true
   */

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[14];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      boolean boolean0 = tByteIntHashMap0.containsValue(1);
      assertEquals(false, boolean0);
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals("{0=0}", tByteIntHashMap0.toString());
  }

  //Test case number: 20
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I30 Branch 59 IF_ICMPNE L377 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I18 Branch 57 IFLE L376 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I25 Branch 58 IF_ICMPNE L377 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.containsValue(I)Z: I25 Branch 58 IF_ICMPNE L377 - false
   */

  @Test
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      int[] intArray0 = new int[4];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      boolean boolean0 = tByteIntHashMap0.containsValue(0);
      assertEquals("{0=0}", tByteIntHashMap0.toString());
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals(true, boolean0);
      assertEquals(17, tByteIntHashMap0.capacity());
  }

  //Test case number: 21
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 60 IFLE L407 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 60 IFLE L407 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 61 IF_ICMPNE L408 - true
   */

  @Test
  public void test21()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(144, (float) 144, (byte)99, (int) (byte)99);
      boolean boolean0 = tByteIntHashMap0.forEachValue((TIntProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 61 IF_ICMPNE L408 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 60 IFLE L407 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.forEachValue(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 61 IF_ICMPNE L408 - true
   */

  @Test
  public void test22()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-10), 0);
      tByteIntHashMap0.put((byte) (-104), 1437356741);
      // Undeclared exception!
      try {
        tByteIntHashMap0.forEachValue((TIntProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 23
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.transformValues(Lgnu/trove/function/TIntFunction;)V: I18 Branch 66 IFLE L434 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.transformValues(Lgnu/trove/function/TIntFunction;)V: I18 Branch 66 IFLE L434 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.transformValues(Lgnu/trove/function/TIntFunction;)V: I25 Branch 67 IF_ICMPNE L435 - true
   */

//   @Test
//   public void test23()  throws Throwable  {
//       TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(1005, (float) 1005, (byte) (-79), 1005);
//       tByteIntHashMap0.transformValues((TIntFunction) null);
//       assertEquals(-79, tByteIntHashMap0.getNoEntryKey());
//   }

  //Test case number: 24
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.transformValues(Lgnu/trove/function/TIntFunction;)V: I25 Branch 67 IF_ICMPNE L435 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.putAll(Ljava/util/Map;)V: I15 Branch 42 IFEQ L233 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.putAll(Ljava/util/Map;)V: I15 Branch 42 IFEQ L233 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.transformValues(Lgnu/trove/function/TIntFunction;)V: I18 Branch 66 IFLE L434 - false
   * 5 gnu.trove.map.hash.TByteIntHashMap.transformValues(Lgnu/trove/function/TIntFunction;)V: I25 Branch 67 IF_ICMPNE L435 - true
   */

  @Test
  public void test24()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(999, (float) 999, (byte) (-79), 1994);
      HashMap<Byte, Integer> hashMap0 = new HashMap<Byte, Integer>();
      hashMap0.put((Byte) (byte) (-70), (Integer) 0);
      tByteIntHashMap0.putAll((Map<? extends Byte, ? extends Integer>) hashMap0);
      // Undeclared exception!
      try {
        tByteIntHashMap0.transformValues((TIntFunction) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 25
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.retainEntries(Lgnu/trove/procedure/TByteIntProcedure;)Z: I31 Branch 68 IFLE L453 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.retainEntries(Lgnu/trove/procedure/TByteIntProcedure;)Z: I31 Branch 68 IFLE L453 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.retainEntries(Lgnu/trove/procedure/TByteIntProcedure;)Z: I38 Branch 69 IF_ICMPNE L454 - true
   */

  @Test
  public void test25()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap();
      boolean boolean0 = tByteIntHashMap0.retainEntries((TByteIntProcedure) null);
      assertEquals(23, tByteIntHashMap0.capacity());
      assertEquals(false, boolean0);
  }

  //Test case number: 26
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.retainEntries(Lgnu/trove/procedure/TByteIntProcedure;)Z: I38 Branch 69 IF_ICMPNE L454 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.<init>()V: root-Branch
   * 3 gnu.trove.map.hash.TByteIntHashMap.retainEntries(Lgnu/trove/procedure/TByteIntProcedure;)Z: I31 Branch 68 IFLE L453 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.retainEntries(Lgnu/trove/procedure/TByteIntProcedure;)Z: I38 Branch 69 IF_ICMPNE L454 - true
   */

  @Test
  public void test26()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap();
      tByteIntHashMap0.adjustOrPutValue((byte)39, (byte)39, (byte)39);
      // Undeclared exception!
      try {
        tByteIntHashMap0.retainEntries((TByteIntProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 27
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.adjustValue(BI)Z: I9 Branch 71 IFGE L477 - true
   */

  @Test
  public void test27()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-6), (-6));
      tByteIntHashMap0.adjustOrPutValue((byte) (-1), (-697), (-697));
      boolean boolean0 = tByteIntHashMap0.adjustValue((byte) (-1), (-697));
      assertEquals(false, tByteIntHashMap0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 28
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.adjustOrPutValue(BII)I: I9 Branch 72 IFGE L491 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.adjustOrPutValue(BII)I: I58 Branch 73 IFEQ L502 - true
   */

  @Test
  public void test28()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((int) (byte)106, (float) 100009607, (byte)106, 100009607);
      tByteIntHashMap0.adjustOrPutValue((byte)106, 100009607, (-1293));
      int int0 = tByteIntHashMap0.adjustOrPutValue((byte)106, (-1293), (-1293));
      assertEquals(false, tByteIntHashMap0.isEmpty());
      assertEquals((-2586), int0);
  }

  //Test case number: 29
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 74 IFNE L1184 - false
   */

  @Test
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      int[] intArray0 = new int[8];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      boolean boolean0 = tByteIntHashMap0.equals((Object) "China");
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals("{0=0}", tByteIntHashMap0.toString());
      assertEquals(false, boolean0);
      assertEquals(17, tByteIntHashMap0.capacity());
  }

  //Test case number: 30
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 75 IF_ICMPEQ L1188 - false
   */

  @Test
  public void test30()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((int) (byte)106, (float) 100009607, (byte)106, 100009607);
      int[] intArray0 = new int[9];
      TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap(tByteIntHashMap0._set, intArray0);
      boolean boolean0 = tByteIntHashMap0.equals((Object) tByteIntHashMap1);
      assertFalse(tByteIntHashMap1.equals(tByteIntHashMap0));
      assertEquals(false, boolean0);
      assertEquals(23, tByteIntHashMap1.capacity());
      assertEquals(1, tByteIntHashMap1.size());
      assertEquals("{0=0}", tByteIntHashMap1.toString());
  }

  //Test case number: 31
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I84 Branch 78 IF_ICMPEQ L1200 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I87 Branch 79 IF_ICMPEQ L1200 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I90 Branch 80 IF_ICMPEQ L1200 - false
   * 4 gnu.trove.map.hash.TByteIntHashMap.putIfAbsent(BI)I: I9 Branch 39 IFGE L205 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.get(B)I: I9 Branch 44 IFGE L253 - true
   */

  @Test
  public void test31()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-6), (-6));
      TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap((-6));
      tByteIntHashMap0.putIfAbsent((byte) (-1), (-6));
      tByteIntHashMap1.adjustOrPutValue((byte) (-1), (-697), (-697));
      boolean boolean0 = tByteIntHashMap1.equals((Object) tByteIntHashMap0);
      assertEquals(7, tByteIntHashMap0.capacity());
      assertEquals(false, boolean0);
  }

  //Test case number: 32
  /*
   * 22 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I87 Branch 79 IF_ICMPEQ L1200 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I90 Branch 80 IF_ICMPEQ L1200 - true
   * 3 gnu.trove.map.hash.TByteIntHashMap.iterator()Lgnu/trove/iterator/TByteIntIterator;: root-Branch
   * 4 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 74 IFNE L1184 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 75 IF_ICMPEQ L1188 - true
   * 6 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - true
   * 7 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I53 Branch 76 IFLE L1195 - false
   * 8 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - true
   * 9 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I60 Branch 77 IF_ICMPNE L1196 - false
   * 10 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I84 Branch 78 IF_ICMPEQ L1200 - false
   * 11 gnu.trove.map.hash.TByteIntHashMap.equals(Ljava/lang/Object;)Z: I87 Branch 79 IF_ICMPEQ L1200 - false
   * 12 gnu.trove.map.hash.TByteIntHashMap.putAll(Lgnu/trove/map/TByteIntMap;)V: I15 Branch 43 IFEQ L243 - true
   * 13 gnu.trove.map.hash.TByteIntHashMap.putAll(Lgnu/trove/map/TByteIntMap;)V: I15 Branch 43 IFEQ L243 - false
   * 14 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I10 Branch 34 IFEQ L133 - false
   * 15 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I38 Branch 35 IFEQ L139 - true
   * 16 gnu.trove.map.hash.TByteIntHashMap.<init>(Lgnu/trove/map/TByteIntMap;)V: I50 Branch 36 IFEQ L143 - true
   * 17 gnu.trove.map.hash.TByteIntHashMap.get(B)I: I9 Branch 44 IFGE L253 - true
   * 18 gnu.trove.map.hash.TByteIntHashMap.get(B)I: I9 Branch 44 IFGE L253 - false
   * 19 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.advance()V: root-Branch
   * 20 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.value()I: root-Branch
   * 21 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.key()B: root-Branch
   * 22 gnu.trove.map.hash.TByteIntHashMap$TByteIntHashIterator.<init>(Lgnu/trove/map/hash/TByteIntHashMap;Lgnu/trove/map/hash/TByteIntHashMap;)V: root-Branch
   */

  @Test
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[7] = (byte) (-36);
      int[] intArray0 = new int[14];
      intArray0[6] = (int) (byte) (-36);
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap((TByteIntMap) tByteIntHashMap0);
      tByteIntHashMap0.trimToSize();
      tByteIntHashMap0._set = tByteIntHashMap1._states;
      boolean boolean0 = tByteIntHashMap0.equals((Object) tByteIntHashMap1);
      assertEquals(5, tByteIntHashMap0.capacity());
      assertEquals(true, boolean0);
  }

  //Test case number: 33
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.hashCode()I: I25 Branch 82 IF_ICMPNE L1217 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.<init>(IFBI)V: root-Branch
   * 3 gnu.trove.map.hash.TByteIntHashMap.hashCode()I: I18 Branch 81 IFLE L1216 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.hashCode()I: I18 Branch 81 IFLE L1216 - false
   * 5 gnu.trove.map.hash.TByteIntHashMap.hashCode()I: I25 Branch 82 IF_ICMPNE L1217 - true
   */

  @Test
  public void test33()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((int) (byte)106, (float) 100009607, (byte)106, 100009607);
      tByteIntHashMap0.adjustOrPutValue((byte)106, 100009607, (-1293));
      int int0 = tByteIntHashMap0.hashCode();
      assertEquals(false, tByteIntHashMap0.isEmpty());
      assertEquals((-1383), int0);
  }

  //Test case number: 34
  /*
   * 16 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap$1.execute(BI)Z: I4 Branch 115 IFEQ L1233 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.toString()Ljava/lang/String;: root-Branch
   * 3 gnu.trove.map.hash.TByteIntHashMap.<init>(IF)V: root-Branch
   * 4 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I46 Branch 37 IFLE L185 - false
   * 6 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - true
   * 7 gnu.trove.map.hash.TByteIntHashMap.rehash(I)V: I53 Branch 38 IF_ICMPNE L186 - false
   * 8 gnu.trove.map.hash.TByteIntHashMap.forEachEntry(Lgnu/trove/procedure/TByteIntProcedure;)Z: I23 Branch 63 IFLE L421 - true
   * 9 gnu.trove.map.hash.TByteIntHashMap.forEachEntry(Lgnu/trove/procedure/TByteIntProcedure;)Z: I23 Branch 63 IFLE L421 - false
   * 10 gnu.trove.map.hash.TByteIntHashMap.forEachEntry(Lgnu/trove/procedure/TByteIntProcedure;)Z: I30 Branch 64 IF_ICMPNE L422 - true
   * 11 gnu.trove.map.hash.TByteIntHashMap.forEachEntry(Lgnu/trove/procedure/TByteIntProcedure;)Z: I30 Branch 64 IF_ICMPNE L422 - false
   * 12 gnu.trove.map.hash.TByteIntHashMap.forEachEntry(Lgnu/trove/procedure/TByteIntProcedure;)Z: I39 Branch 65 IFNE L422 - true
   * 13 gnu.trove.map.hash.TByteIntHashMap.adjustOrPutValue(BII)I: I9 Branch 72 IFGE L491 - true
   * 14 gnu.trove.map.hash.TByteIntHashMap.adjustOrPutValue(BII)I: I58 Branch 73 IFEQ L502 - false
   * 15 gnu.trove.map.hash.TByteIntHashMap$1.<init>(Lgnu/trove/map/hash/TByteIntHashMap;Ljava/lang/StringBuilder;)V: root-Branch
   * 16 gnu.trove.map.hash.TByteIntHashMap$1.execute(BI)Z: I4 Branch 115 IFEQ L1233 - false
   */

  @Test
  public void test34()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap((-6), (-6));
      tByteIntHashMap0.adjustOrPutValue((byte) (-1), (-697), (-697));
      int[] intArray0 = new int[4];
      TByteIntHashMap tByteIntHashMap1 = new TByteIntHashMap(tByteIntHashMap0._set, intArray0);
      String string0 = tByteIntHashMap1.toString();
      assertEquals(1, tByteIntHashMap0.size());
      assertEquals("{-1=0, 0=0}", string0);
  }

  //Test case number: 35
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I25 Branch 83 IFLE L1259 - true
   * 2 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I25 Branch 83 IFLE L1259 - false
   * 3 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I33 Branch 84 IF_ICMPNE L1260 - true
   * 4 gnu.trove.map.hash.TByteIntHashMap.<init>(I)V: root-Branch
   */

  @Test
  public void test35()  throws Throwable  {
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(143);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((int) (byte)72);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tByteIntHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("\uFFFD\uFFFD\u0000\u0005", byteArrayOutputStream0.toString());
      assertEquals(311, tByteIntHashMap0.capacity());
  }

  //Test case number: 36
  /*
   * 12 covered goals:
   * 1 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I33 Branch 84 IF_ICMPNE L1260 - false
   * 2 gnu.trove.map.hash.TByteIntHashMap.setUp(I)I: root-Branch
   * 3 gnu.trove.map.hash.TByteIntHashMap.put(BI)I: root-Branch
   * 4 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I25 Branch 83 IFLE L1259 - true
   * 5 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I25 Branch 83 IFLE L1259 - false
   * 6 gnu.trove.map.hash.TByteIntHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I33 Branch 84 IF_ICMPNE L1260 - true
   * 7 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I12 Branch 40 IFGE L214 - true
   * 8 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I12 Branch 40 IFGE L214 - false
   * 9 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I41 Branch 41 IFEQ L221 - true
   * 10 gnu.trove.map.hash.TByteIntHashMap.doPut(BII)I: I41 Branch 41 IFEQ L221 - false
   * 11 gnu.trove.map.hash.TByteIntHashMap.<init>([B[I)V: I24 Branch 33 IF_ICMPGE L119 - true
   * 12 gnu.trove.map.hash.TByteIntHashMap.<init>([B[I)V: I24 Branch 33 IF_ICMPGE L119 - false
   */

  @Test
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      int[] intArray0 = new int[5];
      TByteIntHashMap tByteIntHashMap0 = new TByteIntHashMap(byteArray0, intArray0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((int) (byte)72);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tByteIntHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals("{0=0}", tByteIntHashMap0.toString());
      assertEquals(23, tByteIntHashMap0.capacity());
      assertEquals(1, tByteIntHashMap0.size());
  }
}
