/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteSet;
import gnu.trove.impl.unmodifiable.TUnmodifiableCharCollection;
import gnu.trove.map.TByteCharMap;
import gnu.trove.map.hash.TByteCharHashMap;
import gnu.trove.procedure.TByteCharProcedure;
import gnu.trove.procedure.TByteProcedure;
import gnu.trove.procedure.TCharProcedure;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableByteCharMapEvoSuite_DefUse {

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
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 51 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in size()I.4 root-Branch Line 63
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 8 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in size()I.3 root-Branch Line 63
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.size()I: root-Branch
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TByteCharMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TByteCharMap;)V_LV_1" in <init>(Lgnu/trove/map/TByteCharMap;)V.27 Branch 1t Line 60
   * 5 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TByteCharMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TByteCharMap;)V_LV_1" in <init>(Lgnu/trove/map/TByteCharMap;)V.16 root-Branch Line 58
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.<init>(Lgnu/trove/map/TByteCharMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      int int0 = tUnmodifiableByteCharMap0.size();
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 9 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in isEmpty()Z.3 root-Branch Line 64
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 63 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in isEmpty()Z.4 root-Branch Line 64
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.isEmpty()Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap((-1851), (-1851));
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 10 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in containsKey(B)Z.3 root-Branch Line 65
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 47 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in containsKey(B)Z.5 root-Branch Line 65
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsKey(B)Z
	Use 11 for Parameter-Variable "containsKey(B)Z_LV_1" in containsKey(B)Z.4 root-Branch Line 65
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.containsKey(B)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.containsKey((byte) (-91));
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 12 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in containsValue(C)Z.3 root-Branch Line 66
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 50 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in containsValue(C)Z.5 root-Branch Line 66
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method containsValue(C)Z
	Use 13 for Parameter-Variable "containsValue(C)Z_LV_1" in containsValue(C)Z.4 root-Branch Line 66
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.containsValue(C)Z: root-Branch
   */

  @Test
  public void test3()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.containsValue('@');
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 59 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in get(B)C.5 root-Branch Line 67
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 14 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in get(B)C.3 root-Branch Line 67
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method get(B)C
	Use 15 for Parameter-Variable "get(B)C_LV_1" in get(B)C.4 root-Branch Line 67
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.get(B)C: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      char char0 = tUnmodifiableByteCharMap0.get((byte)122);
      assertEquals('\u0000', char0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 19 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in keys()[B.3 root-Branch Line 83
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 43 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in keys()[B.4 root-Branch Line 83
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.keys()[B: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      byte[] byteArray0 = tUnmodifiableByteCharMap0.keys();
      assertNotNull(byteArray0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 60 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in keys([B)[B.5 root-Branch Line 84
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 20 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in keys([B)[B.3 root-Branch Line 84
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method keys([B)[B
	Use 21 for Parameter-Variable "keys([B)[B_LV_1" in keys([B)[B.4 root-Branch Line 84
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.keys([B)[B: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap(242);
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      byte[] byteArray0 = tUnmodifiableByteCharMap0.keys(tByteCharHashMap0._states);
      assertNotNull(byteArray0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 25 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in values()[C.3 root-Branch Line 91
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 44 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in values()[C.4 root-Branch Line 91
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.values()[C: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      char[] charArray0 = tUnmodifiableByteCharMap0.values();
      assertNotNull(charArray0);
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 26 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in values([C)[C.3 root-Branch Line 92
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 57 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in values([C)[C.5 root-Branch Line 92
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method values([C)[C
	Use 27 for Parameter-Variable "values([C)[C_LV_1" in values([C)[C.4 root-Branch Line 92
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.values([C)[C: root-Branch
   */

  @Test
  public void test8()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      char[] charArray0 = new char[6];
      char[] charArray1 = tUnmodifiableByteCharMap0.values(charArray0);
      assertSame(charArray1, charArray0);
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 41 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in equals(Ljava/lang/Object;)Z.8 Branch 4f Line 94
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 29 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in equals(Ljava/lang/Object;)Z.6 Branch 4f Line 94
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 30 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.7 Branch 4f Line 94
   * 4 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method equals(Ljava/lang/Object;)Z
	Use 28 for Parameter-Variable "equals(Ljava/lang/Object;)Z_LV_1" in equals(Ljava/lang/Object;)Z.2 root-Branch Line 94
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   */

  @Test
  public void test9()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap(242);
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.equals((Object) "");
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 58 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in hashCode()I.4 root-Branch Line 95
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 31 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in hashCode()I.3 root-Branch Line 95
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.hashCode()I: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap(242);
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      int int0 = tUnmodifiableByteCharMap0.hashCode();
      assertEquals(0, int0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 32 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in toString()Ljava/lang/String;.3 root-Branch Line 96
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 49 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in toString()Ljava/lang/String;.4 root-Branch Line 96
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      String string0 = tUnmodifiableByteCharMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 56 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in getNoEntryKey()B.4 root-Branch Line 97
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 33 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in getNoEntryKey()B.3 root-Branch Line 97
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.getNoEntryKey()B: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap((-1851), (-1851));
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      byte byte0 = tUnmodifiableByteCharMap0.getNoEntryKey();
      assertEquals((byte)0, byte0);
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 34 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in getNoEntryValue()C.3 root-Branch Line 98
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 61 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in getNoEntryValue()C.4 root-Branch Line 98
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.getNoEntryValue()C: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap((-1851), (-1851));
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      char char0 = tUnmodifiableByteCharMap0.getNoEntryValue();
      assertEquals('\u0000', char0);
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 52 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z.5 root-Branch Line 101
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 35 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z.3 root-Branch Line 101
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z
	Use 36 for Parameter-Variable "forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z_LV_1" in forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z.4 root-Branch Line 101
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   */

  @Test
  public void test14()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.forEachKey((TByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 46 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z.5 root-Branch Line 104
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 37 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z.3 root-Branch Line 104
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z
	Use 38 for Parameter-Variable "forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z_LV_1" in forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z.4 root-Branch Line 104
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.forEachValue(Lgnu/trove/procedure/TCharProcedure;)Z: root-Branch
   */

  @Test
  public void test15()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap(242);
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.forEachValue((TCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 16
  /*
   * 4 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 39 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in forEachEntry(Lgnu/trove/procedure/TByteCharProcedure;)Z.3 root-Branch Line 107
   * 2 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 48 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in forEachEntry(Lgnu/trove/procedure/TByteCharProcedure;)Z.5 root-Branch Line 107
   * 3 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method forEachEntry(Lgnu/trove/procedure/TByteCharProcedure;)Z
	Use 40 for Parameter-Variable "forEachEntry(Lgnu/trove/procedure/TByteCharProcedure;)Z_LV_1" in forEachEntry(Lgnu/trove/procedure/TByteCharProcedure;)Z.4 root-Branch Line 107
   * 4 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.forEachEntry(Lgnu/trove/procedure/TByteCharProcedure;)Z: root-Branch
   */

  @Test
  public void test16()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap(242);
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      boolean boolean0 = tUnmodifiableByteCharMap0.forEachEntry((TByteCharProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 7 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.keySet" in keySet()Lgnu/trove/set/TByteSet;.12 Branch 2f Line 80
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.keySet" in keySet()Lgnu/trove/set/TByteSet;.3 root-Branch Line 79
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.keySet()Lgnu/trove/set/TByteSet;: I4 Branch 2 IFNONNULL L79 - true
   * 3 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 45 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in keySet()Lgnu/trove/set/TByteSet;.10 Branch 2f Line 80
   * 4 INTRA_METHOD-Definition-Use-Pair
	Definition 5 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.keySet" in keySet()Lgnu/trove/set/TByteSet;.12 Branch 2f Line 80
	Use 18 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.keySet" in keySet()Lgnu/trove/set/TByteSet;.16 root-Branch Line 81
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 2 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.keySet" in <init>(Lgnu/trove/map/TByteCharMap;)V.8 root-Branch Line 75
	Use 16 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.keySet" in keySet()Lgnu/trove/set/TByteSet;.3 root-Branch Line 79
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 17 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in keySet()Lgnu/trove/set/TByteSet;.9 Branch 2f Line 80
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.keySet()Lgnu/trove/set/TByteSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test17()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      TUnmodifiableByteSet tUnmodifiableByteSet0 = (TUnmodifiableByteSet)tUnmodifiableByteCharMap0.keySet();
      assertNotNull(tUnmodifiableByteSet0);
      
      TUnmodifiableByteSet tUnmodifiableByteSet1 = (TUnmodifiableByteSet)tUnmodifiableByteCharMap0.keySet();
      assertSame(tUnmodifiableByteSet1, tUnmodifiableByteSet0);
  }

  //Test case number: 18
  /*
   * 9 covered goals:
   * 1 INTRA_CLASS-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.values" in valueCollection()Lgnu/trove/TCharCollection;.12 Branch 3f Line 88
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.values" in valueCollection()Lgnu/trove/TCharCollection;.3 root-Branch Line 87
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.valueCollection()Lgnu/trove/TCharCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 3 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 62 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in valueCollection()Lgnu/trove/TCharCollection;.10 Branch 3f Line 88
   * 4 INTRA_METHOD-Definition-Use-Pair
	Definition 6 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.values" in valueCollection()Lgnu/trove/TCharCollection;.12 Branch 3f Line 88
	Use 24 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.values" in valueCollection()Lgnu/trove/TCharCollection;.16 root-Branch Line 89
   * 5 INTRA_CLASS-Definition-Use-Pair
	Definition 4 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in <init>(Lgnu/trove/map/TByteCharMap;)V.28 Branch 1t Line 60
	Use 23 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.m" in valueCollection()Lgnu/trove/TCharCollection;.9 Branch 3f Line 88
   * 6 INTRA_CLASS-Definition-Use-Pair
	Definition 3 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.values" in <init>(Lgnu/trove/map/TByteCharMap;)V.13 root-Branch Line 76
	Use 22 for Field-Variable "gnu/trove/impl/unmodifiable/TUnmodifiableByteCharMap.values" in valueCollection()Lgnu/trove/TCharCollection;.3 root-Branch Line 87
   * 7 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TByteCharMap;)V
	Use 7 for Parameter-Variable "<init>(Lgnu/trove/map/TByteCharMap;)V_LV_1" in <init>(Lgnu/trove/map/TByteCharMap;)V.27 Branch 1t Line 60
   * 8 PARAMETER-Definition-Use-Pair
	Parameter-Definition 1 for method <init>(Lgnu/trove/map/TByteCharMap;)V
	Use 6 for Parameter-Variable "<init>(Lgnu/trove/map/TByteCharMap;)V_LV_1" in <init>(Lgnu/trove/map/TByteCharMap;)V.16 root-Branch Line 58
   * 9 gnu.trove.impl.unmodifiable.TUnmodifiableByteCharMap.valueCollection()Lgnu/trove/TCharCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test18()  throws Throwable  {
      TByteCharHashMap tByteCharHashMap0 = new TByteCharHashMap();
      TUnmodifiableByteCharMap tUnmodifiableByteCharMap0 = new TUnmodifiableByteCharMap((TByteCharMap) tByteCharHashMap0);
      TUnmodifiableCharCollection tUnmodifiableCharCollection0 = (TUnmodifiableCharCollection)tUnmodifiableByteCharMap0.valueCollection();
      assertNotNull(tUnmodifiableCharCollection0);
      
      TUnmodifiableCharCollection tUnmodifiableCharCollection1 = (TUnmodifiableCharCollection)tUnmodifiableByteCharMap0.valueCollection();
      assertSame(tUnmodifiableCharCollection1, tUnmodifiableCharCollection0);
  }
}
