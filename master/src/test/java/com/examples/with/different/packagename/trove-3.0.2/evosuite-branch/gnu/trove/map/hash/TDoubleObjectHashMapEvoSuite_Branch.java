/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.function.TObjectFunction;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleSet;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.hash.TDoubleObjectHashMap;
import gnu.trove.procedure.TDoubleObjectProcedure;
import gnu.trove.procedure.TDoubleProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.procedure.array.ToObjectArrayProceedure;
import gnu.trove.set.TDoubleSet;
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

public class TDoubleObjectHashMapEvoSuite_Branch {

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
   * 15 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap$1.execute(DLjava/lang/Object;)Z: root-Branch
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap$1.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;)V: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.putAll(Lgnu/trove/map/TDoubleObjectMap;)V: root-Branch
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.getNoEntryKey()D: root-Branch
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(Lgnu/trove/map/TDoubleObjectMap;)V: root-Branch
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.put(DLjava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(IFD)V: root-Branch
   * 8 gnu.trove.map.hash.TDoubleObjectHashMap.setUp(I)I: root-Branch
   * 9 gnu.trove.map.hash.TDoubleObjectHashMap.doPut(Ljava/lang/Object;I)Ljava/lang/Object;: I11 Branch 48 IFGE L239 - true
   * 10 gnu.trove.map.hash.TDoubleObjectHashMap.doPut(Ljava/lang/Object;I)Ljava/lang/Object;: I40 Branch 49 IFEQ L247 - false
   * 11 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I23 Branch 65 IFLE L416 - true
   * 12 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I23 Branch 65 IFLE L416 - false
   * 13 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I30 Branch 66 IF_ICMPNE L417 - true
   * 14 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I30 Branch 66 IF_ICMPNE L417 - false
   * 15 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I39 Branch 67 IFNE L417 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1815, 1815, 1815);
      tDoubleObjectHashMap0.put((double) 1815, (Integer) 1815);
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Integer>((TDoubleObjectMap<? extends Integer>) tDoubleObjectHashMap0);
      assertEquals(false, tDoubleObjectHashMap0.isEmpty());
      assertEquals(1815.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.forEachKey(Lgnu/trove/procedure/TDoubleProcedure;)Z: root-Branch
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.<init>()V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
      boolean boolean0 = tDoubleObjectHashMap0.forEachKey((TDoubleProcedure) null);
      assertEquals(23, tDoubleObjectHashMap0.capacity());
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.removeAt(I)V: root-Branch
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.remove(D)Ljava/lang/Object;: I13 Branch 50 IFLT L259 - false
   */

  @Test
  public void test2()  throws Throwable  {
      TDoubleObjectHashMap<String> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<String>();
      tDoubleObjectHashMap0.put(0.0, "e&r7K#hr");
      assertEquals(1, tDoubleObjectHashMap0.size());
      
      tDoubleObjectHashMap0.remove(0.0);
      assertEquals(true, tDoubleObjectHashMap0.isEmpty());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.valueCollection()Ljava/util/Collection;: root-Branch
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap$ValueView.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;)V: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>();
      tDoubleObjectHashMap0.valueCollection();
      assertEquals(23, tDoubleObjectHashMap0.capacity());
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.clear()V: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TDoubleObjectHashMap<String> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<String>(1638, 1638, 1638);
      tDoubleObjectHashMap0.clear();
      assertEquals("{}", tDoubleObjectHashMap0.toString());
      assertEquals(1638.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.containsKey(D)Z: root-Branch
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.contains(D)Z: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.keySet()Lgnu/trove/set/TDoubleSet;: root-Branch
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;)V: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(10, 0.0F, (double) 0.0F);
      TDoubleSet tDoubleSet0 = tDoubleObjectHashMap0.keySet();
      TUnmodifiableDoubleSet tUnmodifiableDoubleSet0 = new TUnmodifiableDoubleSet(tDoubleSet0);
      tUnmodifiableDoubleSet0.contains((-1356.6299169071099));
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertEquals(0.0, tUnmodifiableDoubleSet0.getNoEntryValue(), 0.01D);
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.iterator()Lgnu/trove/iterator/TDoubleObjectIterator;: root-Branch
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap$TDoubleObjectHashIterator.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;Lgnu/trove/map/hash/TDoubleObjectHashMap;)V: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 73 IFNE L467 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.equals(Ljava/lang/Object;)Z: I20 Branch 74 IF_ICMPEQ L471 - true
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.equals(Ljava/lang/Object;)Z: I34 Branch 75 IFEQ L476 - true
   */

  @Test
  public void test6()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>();
      boolean boolean0 = tDoubleObjectHashMap0.equals((Object) tDoubleObjectHashMap0);
      assertEquals(true, boolean0);
      assertEquals(23, tDoubleObjectHashMap0.capacity());
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I30 Branch 40 IF_ICMPNE L194 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I35 Branch 41 IF_ACMPNE L194 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I14 Branch 38 IF_ACMPNE L192 - false
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I23 Branch 39 IFLE L193 - true
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I23 Branch 39 IFLE L193 - false
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I30 Branch 40 IF_ICMPNE L194 - true
   */

  @Test
  public void test7()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1815, 1815, 1815);
      tDoubleObjectHashMap0.put((double) 1815, (Integer) 1815);
      boolean boolean0 = tDoubleObjectHashMap0.containsValue((Object) null);
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals(false, boolean0);
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I57 Branch 43 IF_ICMPNE L200 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I62 Branch 44 IF_ACMPEQ L200 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I68 Branch 45 IFEQ L200 - false
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.putIfAbsent(DLjava/lang/Object;)Ljava/lang/Object;: I9 Branch 47 IFGE L229 - true
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(I)V: root-Branch
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I14 Branch 38 IF_ACMPNE L192 - true
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I50 Branch 42 IFLE L199 - false
   * 8 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I57 Branch 43 IF_ICMPNE L200 - true
   */

  @Test
  public void test8()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(0);
      Double double0 = Double.valueOf(0.0);
      tDoubleObjectHashMap0.putIfAbsent((double) 0, double0);
      boolean boolean0 = tDoubleObjectHashMap0.containsValue((Object) 0.0);
      assertEquals(false, tDoubleObjectHashMap0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 7 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I62 Branch 44 IF_ACMPEQ L200 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I68 Branch 45 IFEQ L200 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I14 Branch 38 IF_ACMPNE L192 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I50 Branch 42 IFLE L199 - true
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I50 Branch 42 IFLE L199 - false
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I57 Branch 43 IF_ICMPNE L200 - true
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap.containsValue(Ljava/lang/Object;)Z: I57 Branch 43 IF_ICMPNE L200 - false
   */

  @Test
  public void test9()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>();
      tDoubleObjectHashMap0.putIfAbsent((double) 178, (Integer) 178);
      boolean boolean0 = tDoubleObjectHashMap0.containsValue((Object) "");
      assertEquals("{178.0=178}", tDoubleObjectHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.get(D)Ljava/lang/Object;: I9 Branch 46 IFGE L213 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(IF)V: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I47 Branch 36 IFLE L161 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I47 Branch 36 IFLE L161 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I54 Branch 37 IF_ICMPNE L162 - true
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I54 Branch 37 IF_ICMPNE L162 - false
   */

  @Test
  public void test10()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(0, 0);
      Double double0 = new Double(6.409713261620881);
      tDoubleObjectHashMap0.putIfAbsent((double) 0, double0);
      tDoubleObjectHashMap0.get((double) 0);
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals("{0.0=6.409713261620881}", tDoubleObjectHashMap0.toString());
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.get(D)Ljava/lang/Object;: I9 Branch 46 IFGE L213 - false
   */

  @Test
  public void test11()  throws Throwable  {
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
      tDoubleObjectHashMap0.get((double) 1638);
      assertEquals(23, tDoubleObjectHashMap0.capacity());
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.putIfAbsent(DLjava/lang/Object;)Ljava/lang/Object;: I9 Branch 47 IFGE L229 - false
   */

  @Test
  public void test12()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1815, 1815, 1815);
      tDoubleObjectHashMap0.put((double) 1815, (Integer) 1815);
      tDoubleObjectHashMap0.putIfAbsent((double) 1815, (Integer) 1815);
      assertEquals(false, tDoubleObjectHashMap0.isEmpty());
      assertEquals("{1815.0=1815}", tDoubleObjectHashMap0.toString());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.doPut(Ljava/lang/Object;I)Ljava/lang/Object;: I11 Branch 48 IFGE L239 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.doPut(Ljava/lang/Object;I)Ljava/lang/Object;: I40 Branch 49 IFEQ L247 - true
   */

  @Test
  public void test13()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1815, 1815, 1815);
      tDoubleObjectHashMap0.put((double) 1815, (Integer) 1815);
      tDoubleObjectHashMap0.put((double) 1815, (Integer) 1815);
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals("{1815.0=1815}", tDoubleObjectHashMap0.toString());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.remove(D)Ljava/lang/Object;: I13 Branch 50 IFLT L259 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(IF)V: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(0, 0);
      Double double0 = new Double(6.409713261620881);
      tDoubleObjectHashMap0.remove((double) double0);
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertEquals(true, tDoubleObjectHashMap0.isEmpty());
      assertEquals(0, tDoubleObjectHashMap0.size());
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I34 Branch 53 IF_ICMPNE L316 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I27 Branch 52 IFLE L315 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I27 Branch 52 IFLE L315 - false
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I34 Branch 53 IF_ICMPNE L316 - true
   */

  @Test
  public void test15()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(0, 0, 0);
      tDoubleObjectHashMap0.putIfAbsent((-1441.4048155438672), (Integer) 0);
      tDoubleObjectHashMap0.keys();
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals("{-1441.4048155438672=0}", tDoubleObjectHashMap0.toString());
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I6 Branch 54 IF_ICMPGE L327 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I34 Branch 55 IFLE L334 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I34 Branch 55 IFLE L334 - false
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I41 Branch 56 IF_ICMPNE L335 - true
   */

  @Test
  public void test16()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1815, 1815, 1815);
      double[] doubleArray0 = tDoubleObjectHashMap0.keys(tDoubleObjectHashMap0._set);
      assertEquals(1815.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertNotNull(doubleArray0);
  }

  //Test case number: 17
  /*
   * 10 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I6 Branch 54 IF_ICMPGE L327 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I41 Branch 56 IF_ICMPNE L335 - false
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I34 Branch 55 IFLE L334 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I34 Branch 55 IFLE L334 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.keys([D)[D: I41 Branch 56 IF_ICMPNE L335 - true
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.putAll(Ljava/util/Map;)V: I13 Branch 51 IFEQ L279 - true
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap.putAll(Ljava/util/Map;)V: I13 Branch 51 IFEQ L279 - false
   * 8 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I27 Branch 52 IFLE L315 - true
   * 9 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I27 Branch 52 IFLE L315 - false
   * 10 gnu.trove.map.hash.TDoubleObjectHashMap.keys()[D: I34 Branch 53 IF_ICMPNE L316 - true
   */

  @Test
  public void test17()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>();
      Double double0 = new Double(1155.8118300386977);
      HashMap<Double, Double> hashMap0 = new HashMap<Double, Double>();
      double[] doubleArray0 = tDoubleObjectHashMap0.keys();
      hashMap0.put(double0, double0);
      tDoubleObjectHashMap0.putAll((Map<? extends Double, ? extends Double>) hashMap0);
      tDoubleObjectHashMap0.keys(doubleArray0);
      assertEquals("{1155.8118300386977=1155.8118300386977}", tDoubleObjectHashMap0.toString());
      assertEquals(false, tDoubleObjectHashMap0.isEmpty());
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.values()[Ljava/lang/Object;: I35 Branch 58 IF_ICMPNE L357 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.values()[Ljava/lang/Object;: I28 Branch 57 IFLE L356 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.values()[Ljava/lang/Object;: I28 Branch 57 IFLE L356 - false
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.values()[Ljava/lang/Object;: I35 Branch 58 IF_ICMPNE L357 - true
   */

  @Test
  public void test18()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>();
      tDoubleObjectHashMap0.putIfAbsent((double) 178, (Integer) 178);
      tDoubleObjectHashMap0.values();
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals("{178.0=178}", tDoubleObjectHashMap0.toString());
  }

  //Test case number: 19
  /*
   * 4 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 59 IF_ICMPGE L368 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I39 Branch 60 IFLE L376 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I39 Branch 60 IFLE L376 - false
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I46 Branch 61 IF_ICMPNE L377 - true
   */

  @Test
  public void test19()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(2411);
      Double[] doubleArray0 = new Double[10];
      Double[] doubleArray1 = tDoubleObjectHashMap0.values(doubleArray0);
      assertEquals(4831, tDoubleObjectHashMap0.capacity());
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertSame(doubleArray1, doubleArray0);
      assertNotNull(doubleArray1);
  }

  //Test case number: 20
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I6 Branch 59 IF_ICMPGE L368 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I46 Branch 61 IF_ICMPNE L377 - false
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I39 Branch 60 IFLE L376 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I39 Branch 60 IFLE L376 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.values([Ljava/lang/Object;)[Ljava/lang/Object;: I46 Branch 61 IF_ICMPNE L377 - true
   */

  @Test
  public void test20()  throws Throwable  {
      TDoubleObjectHashMap<String> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<String>(0);
      tDoubleObjectHashMap0.putIfAbsent(0.0, "!");
      String[] stringArray0 = new String[1];
      tDoubleObjectHashMap0.put(1707.4678445337977, ",");
      tDoubleObjectHashMap0.values(stringArray0);
      assertEquals(2, tDoubleObjectHashMap0.size());
      assertEquals(7, tDoubleObjectHashMap0.capacity());
  }

  //Test case number: 21
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: I25 Branch 63 IF_ICMPNE L402 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: I31 Branch 64 IFNE L402 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: I18 Branch 62 IFLE L401 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: I18 Branch 62 IFLE L401 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.forEachValue(Lgnu/trove/procedure/TObjectProcedure;)Z: I25 Branch 63 IF_ICMPNE L402 - true
   */

  @Test
  public void test21()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(10, 0.0F, (double) 0.0F);
      tDoubleObjectHashMap0.putIfAbsent((double) 10, (Double) 4.9E-324);
      Double[] doubleArray0 = new Double[4];
      ToObjectArrayProceedure<Double> toObjectArrayProceedure0 = new ToObjectArrayProceedure<Double>(doubleArray0);
      boolean boolean0 = tDoubleObjectHashMap0.forEachValue((TObjectProcedure<? super Double>) toObjectArrayProceedure0);
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals(true, boolean0);
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.retainEntries(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I31 Branch 68 IFLE L436 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.retainEntries(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I31 Branch 68 IFLE L436 - false
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.retainEntries(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I38 Branch 69 IF_ICMPNE L437 - true
   */

  @Test
  public void test22()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(178);
      boolean boolean0 = tDoubleObjectHashMap0.retainEntries((TDoubleObjectProcedure<? super Double>) null);
      assertEquals(359, tDoubleObjectHashMap0.capacity());
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertEquals(false, boolean0);
  }

  //Test case number: 23
  /*
   * 3 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.transformValues(Lgnu/trove/function/TObjectFunction;)V: I18 Branch 71 IFLE L455 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.transformValues(Lgnu/trove/function/TObjectFunction;)V: I18 Branch 71 IFLE L455 - false
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.transformValues(Lgnu/trove/function/TObjectFunction;)V: I25 Branch 72 IF_ICMPNE L456 - true
   */

  @Test
  public void test23()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1511);
      tDoubleObjectHashMap0.transformValues((TObjectFunction<Integer, Integer>) null);
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertEquals(3049, tDoubleObjectHashMap0.capacity());
  }

  //Test case number: 24
  /*
   * 1 covered goal:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.equals(Ljava/lang/Object;)Z: I4 Branch 73 IFNE L467 - false
   */

  @Test
  public void test24()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>();
      boolean boolean0 = tDoubleObjectHashMap0.equals((Object) "{10.0,4.9E-324");
      assertEquals(23, tDoubleObjectHashMap0.capacity());
      assertEquals(false, boolean0);
  }

  //Test case number: 25
  /*
   * 5 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I29 Branch 81 IF_ICMPNE L503 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I41 Branch 82 IFNONNULL L504 - true
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I22 Branch 80 IFLE L502 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I22 Branch 80 IFLE L502 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I29 Branch 81 IF_ICMPNE L503 - true
   */

  @Test
  public void test25()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(1815, 1815, 1815);
      tDoubleObjectHashMap0.put((double) 1815, (Integer) 1815);
      int int0 = tDoubleObjectHashMap0.hashCode();
      assertEquals(false, tDoubleObjectHashMap0.isEmpty());
      assertEquals(1083988759, int0);
  }

  //Test case number: 26
  /*
   * 6 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I41 Branch 82 IFNONNULL L504 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.<init>()V: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I22 Branch 80 IFLE L502 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I22 Branch 80 IFLE L502 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I29 Branch 81 IF_ICMPNE L503 - true
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.hashCode()I: I29 Branch 81 IF_ICMPNE L503 - false
   */

  @Test
  public void test26()  throws Throwable  {
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
      tDoubleObjectHashMap0.putIfAbsent((double) 1638, (Object) null);
      int int0 = tDoubleObjectHashMap0.hashCode();
      assertEquals(false, tDoubleObjectHashMap0.isEmpty());
      assertEquals(1083807744, int0);
  }

  //Test case number: 27
  /*
   * 8 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.toString()Ljava/lang/String;: I34 Branch 35 IFEQ L744 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.keySet()Lgnu/trove/set/TDoubleSet;: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;)V: root-Branch
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.toString()Ljava/lang/String;: I21 Branch 33 IFLE L742 - true
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.toString()Ljava/lang/String;: I21 Branch 33 IFLE L742 - false
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.toString()Ljava/lang/String;: I30 Branch 34 IF_ICMPNE L743 - true
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.toString()Ljava/lang/String;: I30 Branch 34 IF_ICMPNE L743 - false
   * 8 gnu.trove.map.hash.TDoubleObjectHashMap$KeyView.toString()Ljava/lang/String;: I34 Branch 35 IFEQ L744 - false
   */

  @Test
  public void test27()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(10, 0.0F, (double) 0.0F);
      tDoubleObjectHashMap0.putIfAbsent((double) 10, (Double) 4.9E-324);
      tDoubleObjectHashMap0.put(4.9E-324, (Double) 4.9E-324);
      TDoubleSet tDoubleSet0 = tDoubleObjectHashMap0.keySet();
      TUnmodifiableDoubleSet tUnmodifiableDoubleSet0 = new TUnmodifiableDoubleSet(tDoubleSet0);
      String string0 = tUnmodifiableDoubleSet0.toString();
      assertEquals(2, tDoubleObjectHashMap0.size());
      assertEquals("{10.0,4.9E-324", string0);
  }

  //Test case number: 28
  /*
   * 10 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I39 Branch 84 IF_ICMPNE L974 - false
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(IFD)V: root-Branch
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I31 Branch 83 IFLE L973 - true
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I31 Branch 83 IFLE L973 - false
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.writeExternal(Ljava/io/ObjectOutput;)V: I39 Branch 84 IF_ICMPNE L974 - true
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I47 Branch 36 IFLE L161 - true
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I47 Branch 36 IFLE L161 - false
   * 8 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I54 Branch 37 IF_ICMPNE L162 - true
   * 9 gnu.trove.map.hash.TDoubleObjectHashMap.rehash(I)V: I54 Branch 37 IF_ICMPNE L162 - false
   * 10 gnu.trove.map.hash.TDoubleObjectHashMap.putIfAbsent(DLjava/lang/Object;)Ljava/lang/Object;: I9 Branch 47 IFGE L229 - true
   */

  @Test
  public void test28()  throws Throwable  {
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(0, 0, 0);
      tDoubleObjectHashMap0.putIfAbsent((-1441.4048155438672), (Integer) 0);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(0);
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tDoubleObjectHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(1, tDoubleObjectHashMap0.size());
      assertEquals("\uFFFD\uFFFD\u0000\u0005w\u001E\u0000\u0000\u0000\u0000\u0000\u0000?\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFDGJsr\u0000\u0011java.lang.Integer\u0012\u2824\uFFFD\uFFFD\uFFFD8\u0002\u0000\u0001I\u0000\u0005valuexr\u0000\u0010java.lang.Number\uFFFD\uFFFD\uFFFD\u001D\u000B\uFFFD\uFFFD\uFFFD\u0002\u0000\u0000xp\u0000\u0000\u0000\u0000", byteArrayOutputStream0.toString());
  }

  //Test case number: 29
  /*
   * 15 covered goals:
   * 1 gnu.trove.map.hash.TDoubleObjectHashMap$2.execute(DLjava/lang/Object;)Z: I4 Branch 97 IFEQ L1013 - true
   * 2 gnu.trove.map.hash.TDoubleObjectHashMap$2.execute(DLjava/lang/Object;)Z: I4 Branch 97 IFEQ L1013 - false
   * 3 gnu.trove.map.hash.TDoubleObjectHashMap$1.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;)V: root-Branch
   * 4 gnu.trove.map.hash.TDoubleObjectHashMap.toString()Ljava/lang/String;: root-Branch
   * 5 gnu.trove.map.hash.TDoubleObjectHashMap.put(DLjava/lang/Object;)Ljava/lang/Object;: root-Branch
   * 6 gnu.trove.map.hash.TDoubleObjectHashMap.<init>(I)V: root-Branch
   * 7 gnu.trove.map.hash.TDoubleObjectHashMap.setUp(I)I: root-Branch
   * 8 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I23 Branch 65 IFLE L416 - true
   * 9 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I23 Branch 65 IFLE L416 - false
   * 10 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I30 Branch 66 IF_ICMPNE L417 - true
   * 11 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I30 Branch 66 IF_ICMPNE L417 - false
   * 12 gnu.trove.map.hash.TDoubleObjectHashMap.forEachEntry(Lgnu/trove/procedure/TDoubleObjectProcedure;)Z: I39 Branch 67 IFNE L417 - true
   * 13 gnu.trove.map.hash.TDoubleObjectHashMap.doPut(Ljava/lang/Object;I)Ljava/lang/Object;: I11 Branch 48 IFGE L239 - true
   * 14 gnu.trove.map.hash.TDoubleObjectHashMap.doPut(Ljava/lang/Object;I)Ljava/lang/Object;: I40 Branch 49 IFEQ L247 - false
   * 15 gnu.trove.map.hash.TDoubleObjectHashMap$2.<init>(Lgnu/trove/map/hash/TDoubleObjectHashMap;Ljava/lang/StringBuilder;)V: root-Branch
   */

//   @Test
//   public void test29()  throws Throwable  {
//       TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(2411);
//       Double double0 = new Double((double) 2411);
//       tDoubleObjectHashMap0.put((double) 2411, double0);
//       Double[] doubleArray0 = new Double[10];
//       doubleArray0[5] = null;
//       tDoubleObjectHashMap0.put((double) doubleArray0[5], doubleArray0[5]);
//       String string0 = tDoubleObjectHashMap0.toString();
//       assertEquals(2, tDoubleObjectHashMap0.size());
//       assertEquals("{2411.0=2411.0,0.0=0.0}", string0);
//   }
}
