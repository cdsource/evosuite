/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.hash.TCharFloatHashMap;
import gnu.trove.map.hash.TFloatFloatHashMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TPrimitiveHashEvoSuite_WeakMutation {

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
   * 30 covered goals:
   * 1 Weak Mutation 14: gnu.trove.impl.hash.TPrimitiveHash.capacity()I:108 - DeleteField: _states[B
   * 2 gnu.trove.impl.hash.TPrimitiveHash.capacity()I: root-Branch
   * 3 Weak Mutation 0: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:95 - ReplaceConstant - 1 -> 0
   * 4 Weak Mutation 1: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:95 - InsertUnaryOp Negation of initialCapacity
   * 5 Weak Mutation 2: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:95 - DeleteStatement: max(II)I
   * 6 Weak Mutation 3: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:96 - InsertUnaryOp Negation of loadFactor
   * 7 Weak Mutation 4: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp Negation of initialCapacity
   * 8 Weak Mutation 5: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp IINC 1 initialCapacity
   * 9 Weak Mutation 6: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp IINC -1 initialCapacity
   * 10 Weak Mutation 7: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp Negation of loadFactor
   * 11 Weak Mutation 8: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> -
   * 12 Weak Mutation 9: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> +
   * 13 Weak Mutation 10: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> %
   * 14 Weak Mutation 11: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> *
   * 15 Weak Mutation 12: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - DeleteStatement: fastCeil(F)I
   * 16 Weak Mutation 13: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - DeleteStatement: setUp(I)I
   * 17 Weak Mutation 14: gnu.trove.impl.hash.TPrimitiveHash.capacity()I:108 - DeleteField: _states[B
   * 18 Weak Mutation 27: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:133 - InsertUnaryOp IINC 1 initialCapacity
   * 19 Weak Mutation 26: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:133 - InsertUnaryOp Negation of initialCapacity
   * 20 Weak Mutation 29: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - ReplaceVariable capacity -> initialCapacity
   * 21 Weak Mutation 28: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:133 - InsertUnaryOp IINC -1 initialCapacity
   * 22 Weak Mutation 31: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - InsertUnaryOp IINC 1 capacity
   * 23 Weak Mutation 30: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - InsertUnaryOp Negation of capacity
   * 24 Weak Mutation 34: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - InsertUnaryOp Negation of capacity
   * 25 Weak Mutation 35: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - InsertUnaryOp IINC 1 capacity
   * 26 Weak Mutation 32: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - InsertUnaryOp IINC -1 capacity
   * 27 Weak Mutation 33: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - ReplaceVariable capacity -> initialCapacity
   * 28 Weak Mutation 36: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - InsertUnaryOp IINC -1 capacity
   * 29 gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I: root-Branch
   * 30 gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TIntObjectHashMap<Integer> tIntObjectHashMap0 = new TIntObjectHashMap<Integer>((-2048), (-2048));
      tIntObjectHashMap0.clear();
      assertEquals(3, tIntObjectHashMap0.capacity());
  }

  //Test case number: 1
  /*
   * 38 covered goals:
   * 1 Weak Mutation 15: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - DeleteField: _states[B
   * 2 Weak Mutation 17: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - InsertUnaryOp IINC 1 index
   * 3 Weak Mutation 16: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - InsertUnaryOp Negation of index
   * 4 Weak Mutation 19: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> 0
   * 5 Weak Mutation 18: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - InsertUnaryOp IINC -1 index
   * 6 Weak Mutation 21: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> -1
   * 7 Weak Mutation 20: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> 1
   * 8 Weak Mutation 22: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> 3
   * 9 Weak Mutation 23: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:119 - InsertUnaryOp Negation of index
   * 10 Weak Mutation 25: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:119 - InsertUnaryOp IINC -1 index
   * 11 Weak Mutation 24: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:119 - InsertUnaryOp IINC 1 index
   * 12 gnu.trove.impl.hash.TPrimitiveHash.<init>(I)V: root-Branch
   * 13 gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V: root-Branch
   * 14 Weak Mutation 0: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:95 - ReplaceConstant - 1 -> 0
   * 15 Weak Mutation 1: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:95 - InsertUnaryOp Negation of initialCapacity
   * 16 Weak Mutation 2: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:95 - DeleteStatement: max(II)I
   * 17 Weak Mutation 3: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:96 - InsertUnaryOp Negation of loadFactor
   * 18 Weak Mutation 4: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp Negation of initialCapacity
   * 19 Weak Mutation 5: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp IINC 1 initialCapacity
   * 20 Weak Mutation 6: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp IINC -1 initialCapacity
   * 21 Weak Mutation 7: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - InsertUnaryOp Negation of loadFactor
   * 22 Weak Mutation 8: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> -
   * 23 Weak Mutation 9: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> +
   * 24 Weak Mutation 10: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> %
   * 25 Weak Mutation 11: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - ReplaceArithmeticOperator / -> *
   * 26 Weak Mutation 12: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - DeleteStatement: fastCeil(F)I
   * 27 Weak Mutation 13: gnu.trove.impl.hash.TPrimitiveHash.<init>(IF)V:97 - DeleteStatement: setUp(I)I
   * 28 Weak Mutation 15: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - DeleteField: _states[B
   * 29 Weak Mutation 17: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - InsertUnaryOp IINC 1 index
   * 30 Weak Mutation 16: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - InsertUnaryOp Negation of index
   * 31 Weak Mutation 19: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> 0
   * 32 Weak Mutation 18: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - InsertUnaryOp IINC -1 index
   * 33 Weak Mutation 21: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> -1
   * 34 Weak Mutation 20: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> 1
   * 35 Weak Mutation 23: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:119 - InsertUnaryOp Negation of index
   * 36 Weak Mutation 22: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:118 - ReplaceConstant - 2 -> 3
   * 37 Weak Mutation 25: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:119 - InsertUnaryOp IINC -1 index
   * 38 Weak Mutation 24: gnu.trove.impl.hash.TPrimitiveHash.removeAt(I)V:119 - InsertUnaryOp IINC 1 index
   */

  @Test
  public void test1()  throws Throwable  {
      float[] floatArray0 = new float[3];
      TFloatFloatHashMap tFloatFloatHashMap0 = new TFloatFloatHashMap(floatArray0, floatArray0);
      tFloatFloatHashMap0.remove(0.0F);
      assertEquals(0, tFloatFloatHashMap0.size());
      assertEquals(7, tFloatFloatHashMap0.capacity());
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * 1 gnu.trove.impl.hash.TPrimitiveHash.<init>()V: root-Branch
   * 2 Weak Mutation 27: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:133 - InsertUnaryOp IINC 1 initialCapacity
   * 3 Weak Mutation 26: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:133 - InsertUnaryOp Negation of initialCapacity
   * 4 Weak Mutation 29: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - ReplaceVariable capacity -> initialCapacity
   * 5 Weak Mutation 28: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:133 - InsertUnaryOp IINC -1 initialCapacity
   * 6 Weak Mutation 31: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - InsertUnaryOp IINC 1 capacity
   * 7 Weak Mutation 30: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - InsertUnaryOp Negation of capacity
   * 8 Weak Mutation 34: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - InsertUnaryOp Negation of capacity
   * 9 Weak Mutation 35: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - InsertUnaryOp IINC 1 capacity
   * 10 Weak Mutation 32: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:134 - InsertUnaryOp IINC -1 capacity
   * 11 Weak Mutation 33: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - ReplaceVariable capacity -> initialCapacity
   * 12 Weak Mutation 36: gnu.trove.impl.hash.TPrimitiveHash.setUp(I)I:135 - InsertUnaryOp IINC -1 capacity
   */

  @Test
  public void test2()  throws Throwable  {
      TCharFloatHashMap tCharFloatHashMap0 = new TCharFloatHashMap();
      assertEquals(23, tCharFloatHashMap0.capacity());
  }
}
