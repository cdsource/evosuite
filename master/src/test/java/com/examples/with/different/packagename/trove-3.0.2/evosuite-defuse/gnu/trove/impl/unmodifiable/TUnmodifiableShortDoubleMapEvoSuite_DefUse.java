/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortSet;
import gnu.trove.map.TShortDoubleMap;
import gnu.trove.map.hash.TShortDoubleHashMap;
import gnu.trove.procedure.TDoubleProcedure;
import gnu.trove.procedure.TShortDoubleProcedure;
import gnu.trove.procedure.TShortProcedure;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableShortDoubleMapEvoSuite_DefUse {

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
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 62 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in size()I.4 root-Branch Line 63
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 8 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in size()I.3 root-Branch Line 63
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.size()I: root-Branch
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TShortDoubleMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TShortDoubleMap;)V_LV_1" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.27 Branch 1t Line 60
   * 5 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TShortDoubleMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TShortDoubleMap;)V_LV_1" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.16 root-Branch Line 58
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.<init>(Lgnu/trove/map/TShortDoubleMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(1791);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      int int0 = tUnmodifiableShortDoubleMap0.size();
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 9 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in isEmpty()Z.3 root-Branch Line 64
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 52 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in isEmpty()Z.4 root-Branch Line 64
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      boolean boolean0 = tUnmodifiableShortDoubleMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 63 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in containsKey(S)Z.5 root-Branch Line 65
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 10 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in containsKey(S)Z.3 root-Branch Line 65
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsKey(S)Z
	Use 11 for Parameter-Variable "containsKey(S)Z_LV_1" in containsKey(S)Z.4 root-Branch Line 65
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.containsKey(S)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((int) (short)154, (float) (short)154);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      boolean boolean0 = tUnmodifiableShortDoubleMap0.containsKey((short)154);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 12 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in containsValue(D)Z.3 root-Branch Line 66
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 60 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in containsValue(D)Z.5 root-Branch Line 66
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsValue(D)Z
	Use 13 for Parameter-Variable "containsValue(D)Z_LV_1" in containsValue(D)Z.4 root-Branch Line 66
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.containsValue(D)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(1791);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      boolean boolean0 = tUnmodifiableShortDoubleMap0.containsValue((double) 1791);
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 59 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in get(S)D.5 root-Branch Line 67
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 14 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in get(S)D.3 root-Branch Line 67
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method get(S)D
	Use 15 for Parameter-Variable "get(S)D_LV_1" in get(S)D.4 root-Branch Line 67
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.get(S)D: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((int) (short)154, (float) (short)154);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      double double0 = tUnmodifiableShortDoubleMap0.get((short)154);
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 19 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in keys()[S.3 root-Branch Line 83
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 51 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in keys()[S.4 root-Branch Line 83
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.keys()[S: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap(1791);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      short[] shortArray0 = tUnmodifiableShortDoubleMap0.keys();
      assertNotNull(shortArray0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 56 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in keys([S)[S.5 root-Branch Line 84
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 20 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in keys([S)[S.3 root-Branch Line 84
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method keys([S)[S
	Use 21 for Parameter-Variable "keys([S)[S_LV_1" in keys([S)[S.4 root-Branch Line 84
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.keys([S)[S: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1162), (-1162));
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      short[] shortArray0 = tUnmodifiableShortDoubleMap0.keys(tShortDoubleHashMap0._set);
      assertNotNull(shortArray0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 25 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in values()[D.3 root-Branch Line 91
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 43 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in values()[D.4 root-Branch Line 91
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.values()[D: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1162), (-1162));
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      double[] doubleArray0 = tUnmodifiableShortDoubleMap0.values();
      assertNotNull(doubleArray0);
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 53 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in values([D)[D.5 root-Branch Line 92
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 26 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in values([D)[D.3 root-Branch Line 92
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method values([D)[D
	Use 27 for Parameter-Variable "values([D)[D_LV_1" in values([D)[D.4 root-Branch Line 92
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.values([D)[D: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      double[] doubleArray0 = new double[22];
      double[] doubleArray1 = tUnmodifiableShortDoubleMap0.values(doubleArray0);
      assertSame(doubleArray1, doubleArray0);
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 29 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in equals(Ljava/lang/Object;)Z.6 Branch 4f Line 94
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 57 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in equals(Ljava/lang/Object;)Z.8 Branch 4f Line 94
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 30 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.7 Branch 4f Line 94
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 28 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.2 root-Branch Line 94
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   */

  @Test
  public void test9()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((int) (short)154, (float) (short)154);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      Object object0 = new Object();
      boolean boolean0 = tUnmodifiableShortDoubleMap0.equals(object0);
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 49 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in hashCode()I.4 root-Branch Line 95
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 31 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in hashCode()I.3 root-Branch Line 95
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.hashCode()I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((int) (short)154, (float) (short)154);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      int int0 = tUnmodifiableShortDoubleMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 32 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in toString()Ljava/lang/String;.3 root-Branch Line 96
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 44 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in toString()Ljava/lang/String;.4 root-Branch Line 96
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((int) (short)154, (float) (short)154);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      String string0 = tUnmodifiableShortDoubleMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 33 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in getNoEntryKey()S.3 root-Branch Line 97
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 46 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in getNoEntryKey()S.4 root-Branch Line 97
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.getNoEntryKey()S: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      short short0 = tUnmodifiableShortDoubleMap0.getNoEntryKey();
      assertEquals((short)0, short0);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 34 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in getNoEntryValue()D.3 root-Branch Line 98
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 54 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in getNoEntryValue()D.4 root-Branch Line 98
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.getNoEntryValue()D: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      double double0 = tUnmodifiableShortDoubleMap0.getNoEntryValue();
      assertEquals(0.0, double0, 0.01D);
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 35 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z.3 root-Branch Line 101
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 45 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z.5 root-Branch Line 101
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z
	Use 36 for Parameter-Variable "forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z_LV_1" in forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z.4 root-Branch Line 101
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.forEachKey(Lgnu/trove/procedure/TShortProcedure;)Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      boolean boolean0 = tUnmodifiableShortDoubleMap0.forEachKey((TShortProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 37 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z.3 root-Branch Line 104
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 41 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z.5 root-Branch Line 104
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z
	Use 38 for Parameter-Variable "forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z_LV_1" in forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z.4 root-Branch Line 104
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((int) (short)154, (float) (short)154);
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      boolean boolean0 = tUnmodifiableShortDoubleMap0.forEachValue((TDoubleProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 39 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z.3 root-Branch Line 107
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 55 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z.5 root-Branch Line 107
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z
	Use 40 for Parameter-Variable "forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z_LV_1" in forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z.4 root-Branch Line 107
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.forEachEntry(Lgnu/trove/procedure/TShortDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap();
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      boolean boolean0 = tUnmodifiableShortDoubleMap0.forEachEntry((TShortDoubleProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 7 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.keySet" in keySet()Lgnu/trove/set/TShortSet;.12 Branch 2f Line 80
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.keySet" in keySet()Lgnu/trove/set/TShortSet;.3 root-Branch Line 79
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.keySet()Lgnu/trove/set/TShortSet;: I4 Branch 2 IFNONNULL L79 - true
   * 3 INTRA_METHOD-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.keySet" in keySet()Lgnu/trove/set/TShortSet;.12 Branch 2f Line 80
	Use 18 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.keySet" in keySet()Lgnu/trove/set/TShortSet;.16 root-Branch Line 81
   * 4 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 47 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in keySet()Lgnu/trove/set/TShortSet;.10 Branch 2f Line 80
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 2 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.keySet" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.8 root-Branch Line 75
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.keySet" in keySet()Lgnu/trove/set/TShortSet;.3 root-Branch Line 79
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 17 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in keySet()Lgnu/trove/set/TShortSet;.9 Branch 2f Line 80
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.keySet()Lgnu/trove/set/TShortSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test17()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1162), (-1162));
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      TUnmodifiableShortSet tUnmodifiableShortSet0 = (TUnmodifiableShortSet)tUnmodifiableShortDoubleMap0.keySet();
      assertNotNull(tUnmodifiableShortSet0);
      
      TUnmodifiableShortSet tUnmodifiableShortSet1 = (TUnmodifiableShortSet)tUnmodifiableShortDoubleMap0.keySet();
      assertSame(tUnmodifiableShortSet1, tUnmodifiableShortSet0);
  }

  //Test case number: 18
  /*
   * 9 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.values" in valueCollection()Lgnu/trove/TDoubleCollection;.12 Branch 3f Line 88
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.values" in valueCollection()Lgnu/trove/TDoubleCollection;.3 root-Branch Line 87
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 3 INTRA_METHOD-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.values" in valueCollection()Lgnu/trove/TDoubleCollection;.12 Branch 3f Line 88
	Use 24 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.values" in valueCollection()Lgnu/trove/TDoubleCollection;.16 root-Branch Line 89
   * 4 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 58 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in valueCollection()Lgnu/trove/TDoubleCollection;.10 Branch 3f Line 88
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 3 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.values" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.13 root-Branch Line 76
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.values" in valueCollection()Lgnu/trove/TDoubleCollection;.3 root-Branch Line 87
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.28 Branch 1t Line 60
	Use 23 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableShortDoubleMap.m" in valueCollection()Lgnu/trove/TDoubleCollection;.9 Branch 3f Line 88
   * 7 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TShortDoubleMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TShortDoubleMap;)V_LV_1" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.27 Branch 1t Line 60
   * 8 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TShortDoubleMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TShortDoubleMap;)V_LV_1" in <init>(Lgnu/trove/map/TShortDoubleMap;)V.16 root-Branch Line 58
   * 9 gnu.trove.impl.unmodifiable.TUnmodifiableShortDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test18()  throws Throwable  {
      TShortDoubleHashMap tShortDoubleHashMap0 = new TShortDoubleHashMap((-1162), (-1162));
      TUnmodifiableShortDoubleMap tUnmodifiableShortDoubleMap0 = new TUnmodifiableShortDoubleMap((TShortDoubleMap) tShortDoubleHashMap0);
      TUnmodifiableDoubleCollection tUnmodifiableDoubleCollection0 = (TUnmodifiableDoubleCollection)tUnmodifiableShortDoubleMap0.valueCollection();
      assertNotNull(tUnmodifiableDoubleCollection0);
      
      TUnmodifiableDoubleCollection tUnmodifiableDoubleCollection1 = (TUnmodifiableDoubleCollection)tUnmodifiableShortDoubleMap0.valueCollection();
      assertSame(tUnmodifiableDoubleCollection1, tUnmodifiableDoubleCollection0);
  }
}
