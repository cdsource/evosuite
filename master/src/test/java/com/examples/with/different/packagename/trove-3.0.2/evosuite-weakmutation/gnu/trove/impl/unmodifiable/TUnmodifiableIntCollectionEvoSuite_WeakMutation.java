/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.TIntCollection;
import gnu.trove.impl.sync.TSynchronizedIntSet;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntList;
import gnu.trove.impl.unmodifiable.TUnmodifiableIntSet;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessIntList;
import gnu.trove.list.TIntList;
import gnu.trove.list.array.TIntArrayList;
import gnu.trove.list.linked.TIntLinkedList;
import gnu.trove.procedure.TIntProcedure;
import gnu.trove.set.TIntSet;
import gnu.trove.set.hash.TIntHashSet;
import java.util.Collection;
import java.util.LinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableIntCollectionEvoSuite_WeakMutation {

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
   * 9 covered goals:
   * 1 Weak Mutation 7: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.size()I:63 - DeleteField: cLgnu/trove/TIntCollection;
   * 2 Weak Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.size()I:63 - DeleteStatement: size()I
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.size()I: root-Branch
   * 4 Weak Mutation 4: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V:58 - ReplaceVariable c -> c
   * 5 Weak Mutation 5: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V:58 - ReplaceComparisonOperator != null -> = null
   * 6 Weak Mutation 6: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V:60 - ReplaceVariable c -> c
   * 7 Weak Mutation 7: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.size()I:63 - DeleteField: cLgnu/trove/TIntCollection;
   * 8 Weak Mutation 8: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.size()I:63 - DeleteStatement: size()I
   * 9 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V: I7 Branch 1 IFNONNULL L58 - true
   */

  @Test
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[5];
      TIntHashSet tIntHashSet0 = new TIntHashSet(intArray0);
      TUnmodifiableIntSet tUnmodifiableIntSet0 = new TUnmodifiableIntSet((TIntSet) tIntHashSet0);
      int int0 = tUnmodifiableIntSet0.size();
      assertEquals(1, int0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * 1 Weak Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.isEmpty()Z:64 - DeleteField: cLgnu/trove/TIntCollection;
   * 2 Weak Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.isEmpty()Z:64 - DeleteStatement: isEmpty()Z
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.isEmpty()Z: root-Branch
   * 4 Weak Mutation 9: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.isEmpty()Z:64 - DeleteField: cLgnu/trove/TIntCollection;
   * 5 Weak Mutation 10: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.isEmpty()Z:64 - DeleteStatement: isEmpty()Z
   */

  @Test
  public void test1()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList(10);
      TUnmodifiableRandomAccessIntList tUnmodifiableRandomAccessIntList0 = new TUnmodifiableRandomAccessIntList((TIntList) tIntArrayList0);
      boolean boolean0 = tUnmodifiableRandomAccessIntList0.isEmpty();
      assertEquals(true, boolean0);
  }

  //Test case number: 2
  /*
   * 11 covered goals:
   * 1 Weak Mutation 11: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - DeleteField: cLgnu/trove/TIntCollection;
   * 2 Weak Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - InsertUnaryOp Negation of o
   * 3 Weak Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - InsertUnaryOp IINC 1 o
   * 4 Weak Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - InsertUnaryOp IINC -1 o
   * 5 Weak Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - DeleteStatement: contains(I)Z
   * 6 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z: root-Branch
   * 7 Weak Mutation 11: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - DeleteField: cLgnu/trove/TIntCollection;
   * 8 Weak Mutation 12: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - InsertUnaryOp Negation of o
   * 9 Weak Mutation 13: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - InsertUnaryOp IINC 1 o
   * 10 Weak Mutation 14: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - InsertUnaryOp IINC -1 o
   * 11 Weak Mutation 15: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.contains(I)Z:65 - DeleteStatement: contains(I)Z
   */

  @Test
  public void test2()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList(8, 8);
      TUnmodifiableIntList tUnmodifiableIntList0 = new TUnmodifiableIntList((TIntList) tIntArrayList0);
      boolean boolean0 = tUnmodifiableIntList0.contains(8);
      assertEquals(false, boolean0);
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * 1 Weak Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray()[I:66 - DeleteStatement: toArray()[I
   * 2 Weak Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray()[I:66 - DeleteField: cLgnu/trove/TIntCollection;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray()[I: root-Branch
   * 4 Weak Mutation 17: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray()[I:66 - DeleteStatement: toArray()[I
   * 5 Weak Mutation 16: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray()[I:66 - DeleteField: cLgnu/trove/TIntCollection;
   */

  @Test
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[5];
      TIntHashSet tIntHashSet0 = new TIntHashSet(intArray0);
      TUnmodifiableIntSet tUnmodifiableIntSet0 = new TUnmodifiableIntSet((TIntSet) tIntHashSet0);
      int[] intArray1 = tUnmodifiableIntSet0.toArray();
      assertFalse(intArray0.equals(intArray1));
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * 1 Weak Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray([I)[I:67 - DeleteStatement: toArray([I)[I
   * 2 Weak Mutation 18: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray([I)[I:67 - DeleteField: cLgnu/trove/TIntCollection;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray([I)[I: root-Branch
   * 4 Weak Mutation 19: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray([I)[I:67 - DeleteStatement: toArray([I)[I
   * 5 Weak Mutation 18: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toArray([I)[I:67 - DeleteField: cLgnu/trove/TIntCollection;
   */

  @Test
  public void test4()  throws Throwable  {
      TIntHashSet tIntHashSet0 = new TIntHashSet(798, 798);
      TSynchronizedIntSet tSynchronizedIntSet0 = new TSynchronizedIntSet((TIntSet) tIntHashSet0);
      TUnmodifiableIntSet tUnmodifiableIntSet0 = new TUnmodifiableIntSet((TIntSet) tSynchronizedIntSet0);
      int[] intArray0 = tUnmodifiableIntSet0.toArray(tIntHashSet0._set);
      assertNotNull(intArray0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * 1 Weak Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toString()Ljava/lang/String;:68 - DeleteStatement: toString()Ljava/lang/String;
   * 2 Weak Mutation 20: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toString()Ljava/lang/String;:68 - DeleteField: cLgnu/trove/TIntCollection;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toString()Ljava/lang/String;: root-Branch
   * 4 Weak Mutation 21: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toString()Ljava/lang/String;:68 - DeleteStatement: toString()Ljava/lang/String;
   * 5 Weak Mutation 20: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.toString()Ljava/lang/String;:68 - DeleteField: cLgnu/trove/TIntCollection;
   */

  @Test
  public void test5()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList(8, 8);
      TUnmodifiableIntList tUnmodifiableIntList0 = new TUnmodifiableIntList((TIntList) tIntArrayList0);
      String string0 = tUnmodifiableIntList0.toString();
      assertEquals("{}", string0);
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * 1 Weak Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.getNoEntryValue()I:69 - DeleteStatement: getNoEntryValue()I
   * 2 Weak Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.getNoEntryValue()I:69 - DeleteField: cLgnu/trove/TIntCollection;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.getNoEntryValue()I: root-Branch
   * 4 Weak Mutation 23: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.getNoEntryValue()I:69 - DeleteStatement: getNoEntryValue()I
   * 5 Weak Mutation 22: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.getNoEntryValue()I:69 - DeleteField: cLgnu/trove/TIntCollection;
   */

  @Test
  public void test6()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList(10);
      TUnmodifiableRandomAccessIntList tUnmodifiableRandomAccessIntList0 = new TUnmodifiableRandomAccessIntList((TIntList) tIntArrayList0);
      int int0 = tUnmodifiableRandomAccessIntList0.getNoEntryValue();
      assertEquals(0, int0);
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * 1 Weak Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.forEach(Lgnu/trove/procedure/TIntProcedure;)Z:70 - DeleteStatement: forEach(Lgnu/trove/procedure/TIntProcedure;)Z
   * 2 Weak Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.forEach(Lgnu/trove/procedure/TIntProcedure;)Z:70 - DeleteField: cLgnu/trove/TIntCollection;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: root-Branch
   * 4 Weak Mutation 25: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.forEach(Lgnu/trove/procedure/TIntProcedure;)Z:70 - DeleteStatement: forEach(Lgnu/trove/procedure/TIntProcedure;)Z
   * 5 Weak Mutation 24: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.forEach(Lgnu/trove/procedure/TIntProcedure;)Z:70 - DeleteField: cLgnu/trove/TIntCollection;
   */

  @Test
  public void test7()  throws Throwable  {
      TIntArrayList tIntArrayList0 = new TIntArrayList();
      TUnmodifiableRandomAccessIntList tUnmodifiableRandomAccessIntList0 = new TUnmodifiableRandomAccessIntList((TIntList) tIntArrayList0);
      boolean boolean0 = tUnmodifiableRandomAccessIntList0.forEach((TIntProcedure) null);
      assertEquals(true, boolean0);
  }

  //Test case number: 8
  /*
   * 19 covered goals:
   * 1 Weak Mutation 0: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.hasNext()Z:76 - DeleteField: iLgnu/trove/iterator/TIntIterator;
   * 2 Weak Mutation 1: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.hasNext()Z:76 - DeleteStatement: hasNext()Z
   * 3 Weak Mutation 2: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.next()I:77 - DeleteField: iLgnu/trove/iterator/TIntIterator;
   * 4 Weak Mutation 3: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.next()I:77 - DeleteStatement: next()I
   * 5 Weak Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z:86 - ReplaceVariable coll -> c
   * 6 Weak Mutation 28: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z:86 - DeleteField: cLgnu/trove/TIntCollection;
   * 7 Weak Mutation 30: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z:86 - DeleteStatement: containsAll(Lgnu/trove/TIntCollection;)Z
   * 8 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z: root-Branch
   * 9 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.iterator()Lgnu/trove/iterator/TIntIterator;: root-Branch
   * 10 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.<init>(Lgnu/trove/impl/unmodifiable/TUnmodifiableIntCollection;)V: root-Branch
   * 11 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.hasNext()Z: root-Branch
   * 12 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.next()I: root-Branch
   * 13 Weak Mutation 0: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.hasNext()Z:76 - DeleteField: iLgnu/trove/iterator/TIntIterator;
   * 14 Weak Mutation 1: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.hasNext()Z:76 - DeleteStatement: hasNext()Z
   * 15 Weak Mutation 2: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.next()I:77 - DeleteField: iLgnu/trove/iterator/TIntIterator;
   * 16 Weak Mutation 3: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection$1.next()I:77 - DeleteStatement: next()I
   * 17 Weak Mutation 29: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z:86 - ReplaceVariable coll -> c
   * 18 Weak Mutation 28: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z:86 - DeleteField: cLgnu/trove/TIntCollection;
   * 19 Weak Mutation 30: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Lgnu/trove/TIntCollection;)Z:86 - DeleteStatement: containsAll(Lgnu/trove/TIntCollection;)Z
   */

  @Test
  public void test8()  throws Throwable  {
      int[] intArray0 = new int[2];
      TIntArrayList tIntArrayList0 = TIntArrayList.wrap(intArray0);
      TUnmodifiableRandomAccessIntList tUnmodifiableRandomAccessIntList0 = new TUnmodifiableRandomAccessIntList((TIntList) tIntArrayList0);
      boolean boolean0 = tUnmodifiableRandomAccessIntList0.containsAll((TIntCollection) tUnmodifiableRandomAccessIntList0);
      assertEquals(true, boolean0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * 1 Weak Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Ljava/util/Collection;)Z:85 - DeleteStatement: containsAll(Ljava/util/Collection;)Z
   * 2 Weak Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Ljava/util/Collection;)Z:85 - DeleteField: cLgnu/trove/TIntCollection;
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Ljava/util/Collection;)Z: root-Branch
   * 4 Weak Mutation 27: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Ljava/util/Collection;)Z:85 - DeleteStatement: containsAll(Ljava/util/Collection;)Z
   * 5 Weak Mutation 26: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll(Ljava/util/Collection;)Z:85 - DeleteField: cLgnu/trove/TIntCollection;
   */

  @Test
  public void test9()  throws Throwable  {
      TIntHashSet tIntHashSet0 = new TIntHashSet();
      TIntArrayList tIntArrayList0 = TIntArrayList.wrap(tIntHashSet0._set);
      TUnmodifiableRandomAccessIntList tUnmodifiableRandomAccessIntList0 = new TUnmodifiableRandomAccessIntList((TIntList) tIntArrayList0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      boolean boolean0 = tUnmodifiableRandomAccessIntList0.containsAll((Collection<?>) linkedList0);
      assertEquals(true, boolean0);
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * 1 Weak Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll([I)Z:87 - DeleteField: cLgnu/trove/TIntCollection;
   * 2 Weak Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll([I)Z:87 - DeleteStatement: containsAll([I)Z
   * 3 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll([I)Z: root-Branch
   * 4 Weak Mutation 31: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll([I)Z:87 - DeleteField: cLgnu/trove/TIntCollection;
   * 5 Weak Mutation 32: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.containsAll([I)Z:87 - DeleteStatement: containsAll([I)Z
   */

  @Test
  public void test10()  throws Throwable  {
      TIntLinkedList tIntLinkedList0 = new TIntLinkedList(10);
      TUnmodifiableIntCollection tUnmodifiableIntCollection0 = new TUnmodifiableIntCollection((TIntCollection) tIntLinkedList0);
      int[] intArray0 = new int[8];
      boolean boolean0 = tUnmodifiableIntCollection0.containsAll(intArray0);
      assertEquals(false, boolean0);
  }

  //Test case number: 11
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.add(I)Z: root-Branch
   * 2 Weak Mutation 4: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V:58 - ReplaceVariable c -> c
   * 3 Weak Mutation 6: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V:60 - ReplaceVariable c -> c
   */

  @Test
  public void test11()  throws Throwable  {
      int[] intArray0 = new int[5];
      TIntHashSet tIntHashSet0 = new TIntHashSet(intArray0);
      TUnmodifiableIntSet tUnmodifiableIntSet0 = new TUnmodifiableIntSet((TIntSet) tIntHashSet0);
      // Undeclared exception!
      try {
        tUnmodifiableIntSet0.add(0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V: I7 Branch 1 IFNONNULL L58 - false
   * 2 Weak Mutation 5: gnu.trove.impl.unmodifiable.TUnmodifiableIntCollection.<init>(Lgnu/trove/TIntCollection;)V:58 - ReplaceComparisonOperator != null -> = null
   */

  @Test
  public void test12()  throws Throwable  {
      TUnmodifiableIntCollection tUnmodifiableIntCollection0 = null;
      try {
        tUnmodifiableIntCollection0 = new TUnmodifiableIntCollection((TIntCollection) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
