/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap;
import gnu.trove.map.TObjectDoubleMap;
import gnu.trove.map.custom_hash.TObjectDoubleCustomHashMap;
import gnu.trove.map.hash.TObjectDoubleHashMap;
import gnu.trove.procedure.TDoubleProcedure;
import gnu.trove.procedure.TObjectDoubleProcedure;
import gnu.trove.procedure.TObjectProcedure;
import gnu.trove.procedure.array.ToObjectArrayProceedure;
import gnu.trove.strategy.HashingStrategy;
import gnu.trove.strategy.IdentityHashingStrategy;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableObjectDoubleMapEvoSuite_StrongMutation {

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
   * 1 Strong Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.isEmpty()Z:59 - DeleteStatement: isEmpty()Z
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.isEmpty()Z: root-Branch
   * 3 Strong Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.<init>(Lgnu/trove/map/TObjectDoubleMap;)V:53 - ReplaceComparisonOperator != null -> = null
   * 4 Strong Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.isEmpty()Z:59 - DeleteStatement: isEmpty()Z
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.<init>(Lgnu/trove/map/TObjectDoubleMap;)V: I17 Branch 1 IFNONNULL L53 - true
   */

  @Test
  public void test0()  throws Throwable  {
      TObjectDoubleHashMap<Integer> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Integer>(1);
      TUnmodifiableObjectDoubleMap<Integer> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Integer>((TObjectDoubleMap<Integer>) tObjectDoubleHashMap0);
      boolean boolean0 = tUnmodifiableObjectDoubleMap0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 Strong Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsKey(Ljava/lang/Object;)Z:60 - DeleteStatement: containsKey(Ljava/lang/Object;)Z
   * 2 Strong Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsKey(Ljava/lang/Object;)Z:60 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 3 Strong Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsKey(Ljava/lang/Object;)Z:60 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 4 Strong Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsKey(Ljava/lang/Object;)Z:60 - DeleteStatement: containsKey(Ljava/lang/Object;)Z
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsKey(Ljava/lang/Object;)Z: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      IdentityHashingStrategy<Double> identityHashingStrategy0 = new IdentityHashingStrategy<Double>();
      Double double0 = new Double((-682.5141172028626));
      identityHashingStrategy0.computeHashCode(double0);
      TObjectDoubleHashMap<String> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<String>();
      TUnmodifiableObjectDoubleMap<String> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<String>((TObjectDoubleMap<String>) tObjectDoubleHashMap0);
      boolean boolean0 = tUnmodifiableObjectDoubleMap0.containsKey((Object) "");
      assertEquals(false, boolean0);
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * 1 Strong Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z:61 - InsertUnaryOp Negation of val
   * 2 Strong Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z:61 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 3 Strong Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z:61 - DeleteStatement: containsValue(D)Z
   * 4 Strong Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z:61 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 Strong Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z:61 - DeleteStatement: containsValue(D)Z
   * 6 Strong Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z:61 - InsertUnaryOp Negation of val
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.containsValue(D)Z: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      IdentityHashingStrategy<Double> identityHashingStrategy0 = new IdentityHashingStrategy<Double>();
      Double double0 = new Double((double) 0);
      identityHashingStrategy0.computeHashCode(double0);
      TObjectDoubleCustomHashMap<Double> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Double>((HashingStrategy<? super Double>) identityHashingStrategy0, 0, (float) 0, (double) 0);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleCustomHashMap0);
      boolean boolean0 = tUnmodifiableObjectDoubleMap0.containsValue((-1.0));
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * 1 Strong Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.get(Ljava/lang/Object;)D:62 - DeleteStatement: get(Ljava/lang/Object;)D
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.get(Ljava/lang/Object;)D: root-Branch
   * 3 Strong Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.get(Ljava/lang/Object;)D:62 - DeleteStatement: get(Ljava/lang/Object;)D
   */

  @Test
  public void test3()  throws Throwable  {
      TObjectDoubleHashMap<Double> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Double>((-282), 291.04593F, (double) 291.04593F);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      double double0 = tUnmodifiableObjectDoubleMap0.get((Object) "/");
      assertEquals(291.0459289550781, double0, 0.01D);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 Strong Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys()[Ljava/lang/Object;:78 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 2 Strong Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys()[Ljava/lang/Object;:78 - DeleteStatement: keys()[Ljava/lang/Object;
   * 3 Strong Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys()[Ljava/lang/Object;:78 - DeleteStatement: keys()[Ljava/lang/Object;
   * 4 Strong Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys()[Ljava/lang/Object;:78 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys()[Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test4()  throws Throwable  {
      IdentityHashingStrategy<Double> identityHashingStrategy0 = new IdentityHashingStrategy<Double>();
      TObjectDoubleCustomHashMap<Double> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Double>((HashingStrategy<? super Double>) identityHashingStrategy0, (-631), 0.0F, (double) (-631));
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleCustomHashMap0);
      Object[] objectArray0 = tUnmodifiableObjectDoubleMap0.keys();
      assertNotNull(objectArray0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 Strong Mutation 28: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys([Ljava/lang/Object;)[Ljava/lang/Object;:79 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 2 Strong Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys([Ljava/lang/Object;)[Ljava/lang/Object;:79 - DeleteStatement: keys([Ljava/lang/Object;)[Ljava/lang/Object;
   * 3 Strong Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys([Ljava/lang/Object;)[Ljava/lang/Object;:79 - DeleteStatement: keys([Ljava/lang/Object;)[Ljava/lang/Object;
   * 4 Strong Mutation 28: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys([Ljava/lang/Object;)[Ljava/lang/Object;:79 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keys([Ljava/lang/Object;)[Ljava/lang/Object;: root-Branch
   */

  @Test
  public void test5()  throws Throwable  {
      IdentityHashingStrategy<Double> identityHashingStrategy0 = new IdentityHashingStrategy<Double>();
      TObjectDoubleCustomHashMap<Double> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Double>((HashingStrategy<? super Double>) identityHashingStrategy0, 0, (-1.0F), 0.0);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleCustomHashMap0);
      Double[] doubleArray0 = new Double[5];
      Double[] doubleArray1 = tUnmodifiableObjectDoubleMap0.keys(doubleArray0);
      assertSame(doubleArray0, doubleArray1);
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 Strong Mutation 37: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values()[D:86 - DeleteStatement: values()[D
   * 2 Strong Mutation 36: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values()[D:86 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 3 Strong Mutation 36: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values()[D:86 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 4 Strong Mutation 37: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values()[D:86 - DeleteStatement: values()[D
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values()[D: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      IdentityHashingStrategy<Double> identityHashingStrategy0 = new IdentityHashingStrategy<Double>();
      TObjectDoubleCustomHashMap<Double> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Double>((HashingStrategy<? super Double>) identityHashingStrategy0, 10);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleCustomHashMap0);
      double[] doubleArray0 = tUnmodifiableObjectDoubleMap0.values();
      assertNotNull(doubleArray0);
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 Strong Mutation 39: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values([D)[D:87 - DeleteStatement: values([D)[D
   * 2 Strong Mutation 38: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values([D)[D:87 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 3 Strong Mutation 38: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values([D)[D:87 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 4 Strong Mutation 39: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values([D)[D:87 - DeleteStatement: values([D)[D
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.values([D)[D: root-Branch
   */

  @Test
  public void test7()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectDoubleCustomHashMap<Double> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Double>((HashingStrategy<? super Double>) identityHashingStrategy0, 1559);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleCustomHashMap0);
      double[] doubleArray0 = new double[2];
      double[] doubleArray1 = tUnmodifiableObjectDoubleMap0.values(doubleArray0);
      assertSame(doubleArray1, doubleArray0);
  }

  //Test case number: 8
  /*
   * 7 covered goals:
   * 1 Strong Mutation 45: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceConstant - 0 -> 1
   * 2 Strong Mutation 40: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceComparisonOperator == -> !=
   * 3 Strong Mutation 43: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceComparisonOperator == -> !=
   * 4 Strong Mutation 40: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceComparisonOperator == -> !=
   * 5 Strong Mutation 45: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceConstant - 0 -> 1
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L89 - false
   * 7 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L89 - true
   */

  @Test
  public void test8()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectDoubleCustomHashMap<Object> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Object>((HashingStrategy<? super Object>) identityHashingStrategy0, (-1646), 0.0F);
      TUnmodifiableObjectDoubleMap<Object> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Object>((TObjectDoubleMap<Object>) tObjectDoubleCustomHashMap0);
      Double double0 = new Double((-1922.1526153587602));
      boolean boolean0 = tUnmodifiableObjectDoubleMap0.equals((Object) double0);
      assertEquals(false, boolean0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 Strong Mutation 47: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.hashCode()I:90 - DeleteStatement: hashCode()I
   * 2 Strong Mutation 46: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.hashCode()I:90 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 3 Strong Mutation 46: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.hashCode()I:90 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 4 Strong Mutation 47: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.hashCode()I:90 - DeleteStatement: hashCode()I
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.hashCode()I: root-Branch
   */

  @Test
  public void test9()  throws Throwable  {
      IdentityHashingStrategy<Double> identityHashingStrategy0 = new IdentityHashingStrategy<Double>();
      Double double0 = new Double(0.0);
      int int0 = identityHashingStrategy0.computeHashCode(double0);
      TObjectDoubleCustomHashMap<Double> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Double>((HashingStrategy<? super Double>) identityHashingStrategy0, (-631), 0.0F, (double) (-631));
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleCustomHashMap0);
      int int1 = tUnmodifiableObjectDoubleMap0.hashCode();
      assertFalse(int1 == int0);
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 Strong Mutation 48: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.toString()Ljava/lang/String;:91 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 2 Strong Mutation 49: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.toString()Ljava/lang/String;:91 - DeleteStatement: toString()Ljava/lang/String;
   * 3 Strong Mutation 49: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.toString()Ljava/lang/String;:91 - DeleteStatement: toString()Ljava/lang/String;
   * 4 Strong Mutation 48: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.toString()Ljava/lang/String;:91 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.toString()Ljava/lang/String;: root-Branch
   */

  @Test
  public void test10()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectDoubleCustomHashMap<String> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0);
      TUnmodifiableObjectDoubleMap<String> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<String>((TObjectDoubleMap<String>) tObjectDoubleCustomHashMap0);
      String string0 = tUnmodifiableObjectDoubleMap0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 Strong Mutation 51: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.getNoEntryValue()D:92 - DeleteStatement: getNoEntryValue()D
   * 2 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.getNoEntryValue()D: root-Branch
   * 3 Strong Mutation 51: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.getNoEntryValue()D:92 - DeleteStatement: getNoEntryValue()D
   */

  @Test
  public void test11()  throws Throwable  {
      IdentityHashingStrategy<Object> identityHashingStrategy0 = new IdentityHashingStrategy<Object>();
      TObjectDoubleCustomHashMap<Object> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<Object>((HashingStrategy<? super Object>) identityHashingStrategy0, 232, (float) 232);
      TUnmodifiableObjectDoubleMap<Object> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Object>((TObjectDoubleMap<Object>) tObjectDoubleCustomHashMap0);
      tUnmodifiableObjectDoubleMap0.getNoEntryValue();
      TObjectDoubleHashMap<Object> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Object>(2009, (-1770), (-1770));
      TUnmodifiableObjectDoubleMap<Object> tUnmodifiableObjectDoubleMap1 = new TUnmodifiableObjectDoubleMap<Object>((TObjectDoubleMap<Object>) tObjectDoubleHashMap0);
      assertEquals((-1770.0), tUnmodifiableObjectDoubleMap1.getNoEntryValue(), 0.01D);
  }

  //Test case number: 12
  /*
   * 13 covered goals:
   * 1 Strong Mutation 52: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z:95 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 2 Strong Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.size()I:58 - DeleteStatement: size()I
   * 3 Strong Mutation 53: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z:95 - DeleteStatement: forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z
   * 4 Strong Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.size()I:58 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 Strong Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.size()I:58 - DeleteStatement: size()I
   * 6 Strong Mutation 50: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.getNoEntryValue()D:92 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 7 Strong Mutation 53: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z:95 - DeleteStatement: forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z
   * 8 Strong Mutation 52: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z:95 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 9 Strong Mutation 57: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z:101 - DeleteStatement: forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z
   * 10 Strong Mutation 56: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z:101 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 11 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.size()I: root-Branch
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z: root-Branch
   * 13 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachKey(Lgnu/trove/procedure/TObjectProcedure;)Z: root-Branch
   */

  @Test
  public void test12()  throws Throwable  {
      TObjectDoubleHashMap<Double> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Double>(1740);
      Double double0 = new Double((double) 1740);
      tObjectDoubleHashMap0.putIfAbsent(double0, (double) double0);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      ToObjectArrayProceedure<Object> toObjectArrayProceedure0 = new ToObjectArrayProceedure<Object>(tObjectDoubleHashMap0._set);
      TObjectDoubleHashMap<Object> tObjectDoubleHashMap1 = new TObjectDoubleHashMap<Object>((TObjectDoubleMap<?>) tUnmodifiableObjectDoubleMap0);
      TUnmodifiableObjectDoubleMap<Object> tUnmodifiableObjectDoubleMap1 = new TUnmodifiableObjectDoubleMap<Object>((TObjectDoubleMap<Object>) tObjectDoubleHashMap1);
      boolean boolean0 = tUnmodifiableObjectDoubleMap1.forEachKey((TObjectProcedure<? super Object>) toObjectArrayProceedure0);
      assertEquals("{1740.0=1740.0,1740.0=0.0}", tObjectDoubleHashMap0.toString());
      assertEquals(true, boolean0);
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * 1 Strong Mutation 54: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z:98 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 2 Strong Mutation 55: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z:98 - DeleteStatement: forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z
   * 3 Strong Mutation 55: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z:98 - DeleteStatement: forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z
   * 4 Strong Mutation 54: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z:98 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachValue(Lgnu/trove/procedure/TDoubleProcedure;)Z: root-Branch
   */

  @Test
  public void test13()  throws Throwable  {
      TObjectDoubleHashMap<Double> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Double>(1650);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      Double[] doubleArray0 = new Double[9];
      Double double0 = new Double((double) 1650);
      Double double1 = new Double((-852.9442243914118));
      doubleArray0[1] = double1;
      tUnmodifiableObjectDoubleMap0.forEachValue((TDoubleProcedure) null);
      doubleArray0[1] = double0;
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * 1 Strong Mutation 57: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z:101 - DeleteStatement: forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z
   */

  @Test
  public void test14()  throws Throwable  {
      IdentityHashingStrategy<String> identityHashingStrategy0 = new IdentityHashingStrategy<String>();
      TObjectDoubleCustomHashMap<String> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<String>((HashingStrategy<? super String>) identityHashingStrategy0, 496, (-1.0F), 1349.4284764183199);
      TUnmodifiableObjectDoubleMap<String> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<String>((TObjectDoubleMap<String>) tObjectDoubleCustomHashMap0);
      boolean boolean0 = tUnmodifiableObjectDoubleMap0.forEachEntry((TObjectDoubleProcedure<? super String>) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.putAll(Lgnu/trove/map/TObjectDoubleMap;)V: root-Branch
   * 2 Strong Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.size()I:58 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 3 Strong Mutation 50: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.getNoEntryValue()D:92 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 4 Strong Mutation 56: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.forEachEntry(Lgnu/trove/procedure/TObjectDoubleProcedure;)Z:101 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   */

  @Test
  public void test15()  throws Throwable  {
      TObjectDoubleCustomHashMap<String> tObjectDoubleCustomHashMap0 = new TObjectDoubleCustomHashMap<String>();
      TUnmodifiableObjectDoubleMap<String> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<String>((TObjectDoubleMap<String>) tObjectDoubleCustomHashMap0);
      TObjectDoubleHashMap<Object> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Object>((TObjectDoubleMap<?>) tUnmodifiableObjectDoubleMap0);
      TUnmodifiableObjectDoubleMap<Object> tUnmodifiableObjectDoubleMap1 = new TUnmodifiableObjectDoubleMap<Object>((TObjectDoubleMap<Object>) tObjectDoubleHashMap0);
      // Undeclared exception!
      try {
        tUnmodifiableObjectDoubleMap1.putAll((TObjectDoubleMap<?>) tObjectDoubleHashMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 16
  /*
   * 12 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;: I4 Branch 2 IFNONNULL L74 - true
   * 2 Strong Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:74 - ReplaceComparisonOperator != null -> = null
   * 3 Strong Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:75 - DeleteStatement: keySet()Ljava/util/Set;
   * 4 Strong Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:75 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 5 Strong Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:76 - DeleteField: keySetLjava/util/Set;
   * 6 Strong Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:75 - DeleteStatement: unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
   * 7 Strong Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:74 - ReplaceComparisonOperator != null -> = null
   * 8 Strong Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:75 - DeleteStatement: keySet()Ljava/util/Set;
   * 9 Strong Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:75 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 10 Strong Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:76 - DeleteField: keySetLjava/util/Set;
   * 11 Strong Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;:75 - DeleteStatement: unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.keySet()Ljava/util/Set;: I4 Branch 2 IFNONNULL L74 - false
   */

  @Test
  public void test16()  throws Throwable  {
      TObjectDoubleHashMap<Double> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Double>((-514));
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      Set<Double> set0 = tUnmodifiableObjectDoubleMap0.keySet();
      assertNotNull(set0);
      
      Set<Double> set1 = tUnmodifiableObjectDoubleMap0.keySet();
      assertSame(set1, set0);
  }

  //Test case number: 17
  /*
   * 12 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;: I4 Branch 3 IFNONNULL L82 - true
   * 2 Strong Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:82 - ReplaceComparisonOperator != null -> = null
   * 3 Strong Mutation 34: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:83 - DeleteStatement: unmodifiableCollection(Lgnu/trove/TDoubleCollection;)Lgnu/trove/TDoubleCollection;
   * 4 Strong Mutation 35: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:84 - DeleteField: valuesLgnu/trove/TDoubleCollection;
   * 5 Strong Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:83 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 6 Strong Mutation 33: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:83 - DeleteStatement: valueCollection()Lgnu/trove/TDoubleCollection;
   * 7 Strong Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:82 - ReplaceComparisonOperator != null -> = null
   * 8 Strong Mutation 34: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:83 - DeleteStatement: unmodifiableCollection(Lgnu/trove/TDoubleCollection;)Lgnu/trove/TDoubleCollection;
   * 9 Strong Mutation 35: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:84 - DeleteField: valuesLgnu/trove/TDoubleCollection;
   * 10 Strong Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:83 - DeleteField: mLgnu/trove/map/TObjectDoubleMap;
   * 11 Strong Mutation 33: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;:83 - DeleteStatement: valueCollection()Lgnu/trove/TDoubleCollection;
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.valueCollection()Lgnu/trove/TDoubleCollection;: I4 Branch 3 IFNONNULL L82 - false
   */

  @Test
  public void test17()  throws Throwable  {
      TObjectDoubleHashMap<Double> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Double>((-1770));
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      TUnmodifiableDoubleCollection tUnmodifiableDoubleCollection0 = (TUnmodifiableDoubleCollection)tUnmodifiableObjectDoubleMap0.valueCollection();
      assertNotNull(tUnmodifiableDoubleCollection0);
      
      TUnmodifiableDoubleCollection tUnmodifiableDoubleCollection1 = (TUnmodifiableDoubleCollection)tUnmodifiableObjectDoubleMap0.valueCollection();
      assertSame(tUnmodifiableDoubleCollection1, tUnmodifiableDoubleCollection0);
  }

  //Test case number: 18
  /*
   * 8 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z: I9 Branch 5 IFEQ L89 - false
   * 2 Strong Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.<init>(Lgnu/trove/map/TObjectDoubleMap;)V:53 - ReplaceComparisonOperator != null -> = null
   * 3 Strong Mutation 42: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - DeleteStatement: equals(Ljava/lang/Object;)Z
   * 4 Strong Mutation 43: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceComparisonOperator == -> !=
   * 5 Strong Mutation 44: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceConstant - 1 -> 0
   * 6 Strong Mutation 42: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - DeleteStatement: equals(Ljava/lang/Object;)Z
   * 7 Strong Mutation 44: gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z:89 - ReplaceConstant - 1 -> 0
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableObjectDoubleMap.equals(Ljava/lang/Object;)Z: I4 Branch 4 IF_ACMPEQ L89 - true
   */

  @Test
  public void test18()  throws Throwable  {
      TObjectDoubleHashMap<Double> tObjectDoubleHashMap0 = new TObjectDoubleHashMap<Double>((-1770));
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap0 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      TUnmodifiableObjectDoubleMap<Double> tUnmodifiableObjectDoubleMap1 = new TUnmodifiableObjectDoubleMap<Double>((TObjectDoubleMap<Double>) tObjectDoubleHashMap0);
      boolean boolean0 = tUnmodifiableObjectDoubleMap1.equals((Object) tUnmodifiableObjectDoubleMap0);
      assertEquals(true, boolean0);
  }
}
