/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableByteSet;
import gnu.trove.map.TByteByteMap;
import gnu.trove.map.hash.TByteByteHashMap;
import gnu.trove.procedure.TByteByteProcedure;
import gnu.trove.procedure.TByteProcedure;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableByteByteMapEvoSuite_StrongMutation {

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
   * 5 covered goals:
   * 1 Strong Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.isEmpty()Z:64 - DeleteStatement: isEmpty()Z
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.isEmpty()Z: root-Branch
   * 3 Strong Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.<init>(Lgnu/trove/map/TByteByteMap;)V:58 - ReplaceComparisonOperator != null -> = null
   * 4 Strong Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.isEmpty()Z:64 - DeleteStatement: isEmpty()Z
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.<init>(Lgnu/trove/map/TByteByteMap;)V: I17 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1));
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * 1 Strong Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z: root-Branch
   * 3 Strong Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - DeleteField: mLgnu/trove/map/TByteByteMap;
   */

  @Test
  public void test1()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte) (-89);
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      tUnmodifiableByteByteMap0.containsKey((byte) (-127));
      byteArray0[2] = (byte) (-1);
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * 1 Strong Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - DeleteStatement: containsKey(B)Z
   * 2 Strong Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - InsertUnaryOp Negation of key
   * 3 Strong Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - InsertUnaryOp IINC 1 key
   * 4 Strong Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - InsertUnaryOp Negation of key
   * 5 Strong Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - InsertUnaryOp IINC 1 key
   * 6 Strong Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - DeleteStatement: containsKey(B)Z
   */

  @Test
  public void test2()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[1] = (byte)1;
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.containsKey((byte)1);
      assertEquals(true, boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 Strong Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - InsertUnaryOp IINC -1 key
   * 2 Strong Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsKey(B)Z:65 - InsertUnaryOp IINC -1 key
   */

  @Test
  public void test3()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(424, 0.0F, (byte)8, (byte)8);
      TByteByteHashMap tByteByteHashMap1 = new TByteByteHashMap(tByteByteHashMap0._set, tByteByteHashMap0._set);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap1);
      boolean boolean0 = tUnmodifiableByteByteMap0.containsKey((byte)1);
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 Strong Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - InsertUnaryOp Negation of val
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z: root-Branch
   * 3 Strong Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - InsertUnaryOp Negation of val
   * 4 Strong Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC -1 val
   * 5 Strong Mutation 20: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC 1 val
   * 6 Strong Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - DeleteStatement: containsValue(B)Z
   */

  @Test
  public void test4()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)2;
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.containsValue((byte)2);
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * 1 Strong Mutation 18: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 18: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - DeleteField: mLgnu/trove/map/TByteByteMap;
   */

  @Test
  public void test5()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)1;
      tUnmodifiableByteByteMap0.containsValue((byte)67);
      byteArray0[2] = (byte)70;
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * 1 Strong Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - DeleteStatement: containsValue(B)Z
   * 2 Strong Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC -1 val
   * 3 Strong Mutation 20: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.containsValue(B)Z:66 - InsertUnaryOp IINC 1 val
   */

  @Test
  public void test6()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.containsValue((byte)0);
      assertEquals(true, boolean0);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * 1 Strong Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B: root-Branch
   * 3 Strong Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 4 Strong Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - DeleteStatement: get(B)B
   */

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((int) (byte)2, (float) (byte)2, (byte)2, (byte) (-90));
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byteArray0[1] = (byte)1;
      tUnmodifiableByteByteMap0.get((byte)113);
      byteArray0[1] = (byte) (-89);
  }

  //Test case number: 8
  /*
   * 7 covered goals:
   * 1 Strong Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - InsertUnaryOp IINC -1 key
   * 2 Strong Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - InsertUnaryOp IINC 1 key
   * 3 Strong Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - InsertUnaryOp Negation of key
   * 4 Strong Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - DeleteStatement: get(B)B
   * 5 Strong Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - InsertUnaryOp IINC 1 key
   * 6 Strong Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - InsertUnaryOp Negation of key
   * 7 Strong Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.get(B)B:67 - InsertUnaryOp IINC -1 key
   */

  @Test
  public void test8()  throws Throwable  {
      byte[] byteArray0 = new byte[10];
      byteArray0[8] = (byte) (-13);
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte byte0 = tUnmodifiableByteByteMap0.get((byte) (-13));
      assertEquals((byte) (-13), byte0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 Strong Mutation 35: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys()[B:83 - DeleteStatement: keys()[B
   * 2 Strong Mutation 34: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys()[B:83 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 3 Strong Mutation 34: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys()[B:83 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 4 Strong Mutation 35: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys()[B:83 - DeleteStatement: keys()[B
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys()[B: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1635), (float) (-1779), (byte)0, (byte)10);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = tUnmodifiableByteByteMap0.keys();
      assertNotNull(byteArray0);
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 Strong Mutation 37: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys([B)[B:84 - DeleteStatement: keys([B)[B
   * 2 Strong Mutation 36: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys([B)[B:84 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 3 Strong Mutation 36: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys([B)[B:84 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 4 Strong Mutation 37: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys([B)[B:84 - DeleteStatement: keys([B)[B
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keys([B)[B: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1), (float) (-1), (byte)1, (byte)2);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = tUnmodifiableByteByteMap0.keys(tByteByteHashMap0._states);
      assertNotNull(byteArray0);
  }

  //Test case number: 11
  /*
   * 5 covered goals:
   * 1 Strong Mutation 45: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values()[B:91 - DeleteStatement: values()[B
   * 2 Strong Mutation 44: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values()[B:91 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 3 Strong Mutation 44: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values()[B:91 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 4 Strong Mutation 45: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values()[B:91 - DeleteStatement: values()[B
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values()[B: root-Branch
   */

  @Test
  public void test11()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1));
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = tUnmodifiableByteByteMap0.values();
      assertNotNull(byteArray0);
  }

  //Test case number: 12
  /*
   * 5 covered goals:
   * 1 Strong Mutation 47: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values([B)[B:92 - DeleteStatement: values([B)[B
   * 2 Strong Mutation 46: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values([B)[B:92 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 3 Strong Mutation 46: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values([B)[B:92 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 4 Strong Mutation 47: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values([B)[B:92 - DeleteStatement: values([B)[B
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.values([B)[B: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1), (float) (-1), (byte)1, (byte)2);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = tUnmodifiableByteByteMap0.values(tByteByteHashMap0._states);
      assertNotNull(byteArray0);
  }

  //Test case number: 13
  /*
   * 7 covered goals:
   * 1 Strong Mutation 50: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteStatement: equals(Ljava/lang/Object;)Z
   * 2 Strong Mutation 51: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 3 Strong Mutation 50: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteStatement: equals(Ljava/lang/Object;)Z
   * 4 Strong Mutation 48: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 5 Strong Mutation 53: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceConstant - 0 -> 1
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - false
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L94 - true
   */

  @Test
  public void test13()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap1 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap1.equals((Object) null);
      assertEquals(false, boolean0);
      assertTrue(tUnmodifiableByteByteMap1.equals(tUnmodifiableByteByteMap0));
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * 1 Strong Mutation 49: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 49: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - DeleteField: mLgnu/trove/map/TByteByteMap;
   */

  @Test
  public void test14()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)8;
      tUnmodifiableByteByteMap0.equals((Object) null);
      byteArray0[0] = (byte)1;
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * 1 Strong Mutation 53: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceConstant - 0 -> 1
   * 2 Strong Mutation 51: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   * 3 Strong Mutation 48: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceComparisonOperator == -> !=
   */

  @Test
  public void test15()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.equals((Object) null);
      assertEquals(false, boolean0);
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * 1 Strong Mutation 52: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceConstant - 1 -> 0
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L94 - true
   * 3 Strong Mutation 52: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.equals(Ljava/lang/Object;)Z:94 - ReplaceConstant - 1 -> 0
   */

  @Test
  public void test16()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-2016), 23.146057F);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.equals((Object) tUnmodifiableByteByteMap0);
      assertEquals(true, boolean0);
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * 1 Strong Mutation 55: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.hashCode()I:95 - DeleteStatement: hashCode()I
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.hashCode()I: root-Branch
   * 3 Strong Mutation 55: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.hashCode()I:95 - DeleteStatement: hashCode()I
   */

  @Test
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)66;
      byte[] byteArray1 = new byte[4];
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray1);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      int int0 = tUnmodifiableByteByteMap0.hashCode();
      assertEquals(66, int0);
  }

  //Test case number: 18
  /*
   * 2 covered goals:
   * 1 Strong Mutation 54: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.hashCode()I:95 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 54: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.hashCode()I:95 - DeleteField: mLgnu/trove/map/TByteByteMap;
   */

  @Test
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte) (-91);
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(byteArray0, byteArray0);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      tUnmodifiableByteByteMap0.hashCode();
      byteArray0[0] = (byte)1;
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * 1 Strong Mutation 56: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.toString()Ljava/lang/String;:96 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 57: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.toString()Ljava/lang/String;:96 - DeleteStatement: toString()Ljava/lang/String;
   * 3 Strong Mutation 57: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.toString()Ljava/lang/String;:96 - DeleteStatement: toString()Ljava/lang/String;
   * 4 Strong Mutation 56: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.toString()Ljava/lang/String;:96 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test19()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1), (float) (-1), (byte)1, (byte)2);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      String string0 = tUnmodifiableByteByteMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 20
  /*
   * 3 covered goals:
   * 1 Strong Mutation 59: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryKey()B:97 - DeleteStatement: getNoEntryKey()B
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryKey()B: root-Branch
   * 3 Strong Mutation 59: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryKey()B:97 - DeleteStatement: getNoEntryKey()B
   */

//   @Test
//   public void test20()  throws Throwable  {
//       TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
//       TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
//       TByteByteHashMap tByteByteHashMap1 = new TByteByteHashMap(0, 1894.1677F, (byte) (-81), (byte) (-81));
//       tUnmodifiableByteByteMap0.getNoEntryKey();
//       TUnmodifiableByteByteMap tUnmodifiableByteByteMap1 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap1);
//       assertEquals(-81, tUnmodifiableByteByteMap1.getNoEntryKey());
//   }

  //Test case number: 21
  /*
   * 2 covered goals:
   * 1 Strong Mutation 58: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryKey()B:97 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 58: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryKey()B:97 - DeleteField: mLgnu/trove/map/TByteByteMap;
   */

  @Test
  public void test21()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)8;
      tUnmodifiableByteByteMap0.getNoEntryKey();
      byteArray0[0] = (byte)1;
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * 1 Strong Mutation 61: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryValue()B:98 - DeleteStatement: getNoEntryValue()B
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryValue()B: root-Branch
   * 3 Strong Mutation 61: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryValue()B:98 - DeleteStatement: getNoEntryValue()B
   */

  @Test
  public void test22()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(424, 0.0F, (byte)8, (byte)8);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte byte0 = tUnmodifiableByteByteMap0.getNoEntryValue();
      assertEquals((byte)8, byte0);
  }

  //Test case number: 23
  /*
   * 2 covered goals:
   * 1 Strong Mutation 60: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryValue()B:98 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 60: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.getNoEntryValue()B:98 - DeleteField: mLgnu/trove/map/TByteByteMap;
   */

  @Test
  public void test23()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      byte[] byteArray0 = new byte[4];
      byteArray0[2] = (byte)1;
      tUnmodifiableByteByteMap0.getNoEntryValue();
      byteArray0[2] = (byte)70;
  }

  //Test case number: 24
  /*
   * 5 covered goals:
   * 1 Strong Mutation 62: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z:101 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 2 Strong Mutation 63: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z:101 - DeleteStatement: forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z
   * 3 Strong Mutation 63: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z:101 - DeleteStatement: forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z
   * 4 Strong Mutation 62: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z:101 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachKey(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   */

  @Test
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      byteArray0[0] = (byte) (-91);
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(1548);
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      tUnmodifiableByteByteMap0.forEachKey((TByteProcedure) null);
      byteArray0[0] = (byte)1;
  }

  //Test case number: 25
  /*
   * 3 covered goals:
   * 1 Strong Mutation 65: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z:104 - DeleteStatement: forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z: root-Branch
   * 3 Strong Mutation 65: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z:104 - DeleteStatement: forEachValue(Lgnu/trove/procedure/TByteProcedure;)Z
   */

  @Test
  public void test25()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap((-1126));
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.forEachValue((TByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 26
  /*
   * 3 covered goals:
   * 1 Strong Mutation 67: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachEntry(Lgnu/trove/procedure/TByteByteProcedure;)Z:107 - DeleteStatement: forEachEntry(Lgnu/trove/procedure/TByteByteProcedure;)Z
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachEntry(Lgnu/trove/procedure/TByteByteProcedure;)Z: root-Branch
   * 3 Strong Mutation 67: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.forEachEntry(Lgnu/trove/procedure/TByteByteProcedure;)Z:107 - DeleteStatement: forEachEntry(Lgnu/trove/procedure/TByteByteProcedure;)Z
   */

  @Test
  public void test26()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      boolean boolean0 = tUnmodifiableByteByteMap0.forEachEntry((TByteByteProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 27
  /*
   * 27 covered goals:
   * 1 Strong Mutation 7: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.hasNext()Z:117 - DeleteStatement: hasNext()Z
   * 2 Strong Mutation 0: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.key()B:114 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 3 Strong Mutation 1: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.key()B:114 - DeleteStatement: key()B
   * 4 Strong Mutation 2: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.value()B:115 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 5 Strong Mutation 3: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.value()B:115 - DeleteStatement: value()B
   * 6 Strong Mutation 4: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.advance()V:116 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 7 Strong Mutation 5: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.advance()V:116 - DeleteStatement: advance()V
   * 8 Strong Mutation 6: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.hasNext()Z:117 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 9 Strong Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.size()I:63 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 10 Strong Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.size()I:63 - DeleteStatement: size()I
   * 11 Strong Mutation 0: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.key()B:114 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 12 Strong Mutation 1: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.key()B:114 - DeleteStatement: key()B
   * 13 Strong Mutation 2: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.value()B:115 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 14 Strong Mutation 3: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.value()B:115 - DeleteStatement: value()B
   * 15 Strong Mutation 4: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.advance()V:116 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 16 Strong Mutation 5: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.advance()V:116 - DeleteStatement: advance()V
   * 17 Strong Mutation 6: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.hasNext()Z:117 - DeleteField: iterLgnu/trove/iterator/TByteByteIterator;
   * 18 Strong Mutation 7: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.hasNext()Z:117 - DeleteStatement: hasNext()Z
   * 19 Strong Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.size()I:63 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 20 Strong Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.size()I:63 - DeleteStatement: size()I
   * 21 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.hasNext()Z: root-Branch
   * 22 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.value()B: root-Branch
   * 23 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableByteByteMap;)V: root-Branch
   * 24 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.advance()V: root-Branch
   * 25 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap$1.key()B: root-Branch
   * 26 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.size()I: root-Branch
   * 27 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.iterator()Lgnu/trove/iterator/TByteByteIterator;: root-Branch
   */

  @Test
  public void test27()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(424, 0.0F, (byte)8, (byte)8);
      TByteByteHashMap tByteByteHashMap1 = new TByteByteHashMap((int) (byte)2, (float) (byte)2, (byte)2, (byte) (-90));
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap1);
      tByteByteHashMap1.putIfAbsent((byte) (-90), (byte)1);
      tByteByteHashMap0.putAll((TByteByteMap) tUnmodifiableByteByteMap0);
      assertEquals(7, tByteByteHashMap0.capacity());
      assertTrue(tByteByteHashMap0.equals(tByteByteHashMap1));
  }

  //Test case number: 28
  /*
   * 12 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;: I4 Branch 2 IFNONNULL L79 - true
   * 2 Strong Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:79 - ReplaceComparisonOperator != null -> = null
   * 3 Strong Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:80 - DeleteStatement: keySet()Lgnu/trove/set/TByteSet;
   * 4 Strong Mutation 30: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:80 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 5 Strong Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:80 - DeleteStatement: unmodifiableSet(Lgnu/trove/set/TByteSet;)Lgnu/trove/set/TByteSet;
   * 6 Strong Mutation 33: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:81 - DeleteField: keySetLgnu/trove/set/TByteSet;
   * 7 Strong Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:79 - ReplaceComparisonOperator != null -> = null
   * 8 Strong Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:80 - DeleteStatement: keySet()Lgnu/trove/set/TByteSet;
   * 9 Strong Mutation 30: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:80 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 10 Strong Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:80 - DeleteStatement: unmodifiableSet(Lgnu/trove/set/TByteSet;)Lgnu/trove/set/TByteSet;
   * 11 Strong Mutation 33: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;:81 - DeleteField: keySetLgnu/trove/set/TByteSet;
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.keySet()Lgnu/trove/set/TByteSet;: I4 Branch 2 IFNONNULL L79 - false
   */

  @Test
  public void test28()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap(1316, (float) 1316, (byte)0, (byte) (-87));
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      TUnmodifiableByteSet tUnmodifiableByteSet0 = (TUnmodifiableByteSet)tUnmodifiableByteByteMap0.keySet();
      assertNotNull(tUnmodifiableByteSet0);
      
      TUnmodifiableByteSet tUnmodifiableByteSet1 = (TUnmodifiableByteSet)tUnmodifiableByteByteMap0.keySet();
      assertSame(tUnmodifiableByteSet1, tUnmodifiableByteSet0);
  }

  //Test case number: 29
  /*
   * 13 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;: I4 Branch 3 IFNONNULL L87 - true
   * 2 Strong Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.<init>(Lgnu/trove/map/TByteByteMap;)V:58 - ReplaceComparisonOperator != null -> = null
   * 3 Strong Mutation 39: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:87 - ReplaceComparisonOperator != null -> = null
   * 4 Strong Mutation 42: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: unmodifiableCollection(Lgnu/trove/TByteCollection;)Lgnu/trove/TByteCollection;
   * 5 Strong Mutation 43: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:89 - DeleteField: valuesLgnu/trove/TByteCollection;
   * 6 Strong Mutation 40: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 7 Strong Mutation 41: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: valueCollection()Lgnu/trove/TByteCollection;
   * 8 Strong Mutation 39: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:87 - ReplaceComparisonOperator != null -> = null
   * 9 Strong Mutation 42: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: unmodifiableCollection(Lgnu/trove/TByteCollection;)Lgnu/trove/TByteCollection;
   * 10 Strong Mutation 43: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:89 - DeleteField: valuesLgnu/trove/TByteCollection;
   * 11 Strong Mutation 40: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteField: mLgnu/trove/map/TByteByteMap;
   * 12 Strong Mutation 41: gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;:88 - DeleteStatement: valueCollection()Lgnu/trove/TByteCollection;
   * 13 gnu.trove.impl.unmodifiable.TUnmodifiableByteByteMap.valueCollection()Lgnu/trove/TByteCollection;: I4 Branch 3 IFNONNULL L87 - false
   */

  @Test
  public void test29()  throws Throwable  {
      TByteByteHashMap tByteByteHashMap0 = new TByteByteHashMap();
      TUnmodifiableByteByteMap tUnmodifiableByteByteMap0 = new TUnmodifiableByteByteMap((TByteByteMap) tByteByteHashMap0);
      TUnmodifiableByteCollection tUnmodifiableByteCollection0 = (TUnmodifiableByteCollection)tUnmodifiableByteByteMap0.valueCollection();
      assertNotNull(tUnmodifiableByteCollection0);
      
      TUnmodifiableByteCollection tUnmodifiableByteCollection1 = (TUnmodifiableByteCollection)tUnmodifiableByteByteMap0.valueCollection();
      assertSame(tUnmodifiableByteCollection1, tUnmodifiableByteCollection0);
  }
}
