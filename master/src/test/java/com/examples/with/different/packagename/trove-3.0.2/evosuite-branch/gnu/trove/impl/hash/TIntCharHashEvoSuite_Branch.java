/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.hash.TIntCharHashMap;
import gnu.trove.procedure.TIntProcedure;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TIntCharHashEvoSuite_Branch {

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
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.getNoEntryValue()C: root-Branch
   * 2 gnu.trove.impl.hash.TIntCharHash.setUp(I)I: root-Branch
   * 3 gnu.trove.impl.hash.TIntCharHash.<init>()V: root-Branch
   */

  @Test
  public void test0()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap();
      char char0 = tIntCharHashMap0.getNoEntryValue();
      assertEquals(0, tIntCharHashMap0.getNoEntryKey());
      assertEquals(23, tIntCharHashMap0.capacity());
      assertEquals('\u0000', char0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.getNoEntryKey()I: root-Branch
   * 2 gnu.trove.impl.hash.TIntCharHash.<init>(IFIC)V: root-Branch
   */

  @Test
  public void test1()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap((int) 'd', (float) 'd', (-741), 'd');
      int int0 = tIntCharHashMap0.getNoEntryKey();
      assertEquals((-741), int0);
      assertEquals('d', tIntCharHashMap0.getNoEntryValue());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.writeExternal(Ljava/io/ObjectOutput;)V: root-Branch
   * 2 gnu.trove.impl.hash.TIntCharHash.<init>(IFIC)V: root-Branch
   */

  @Test
  public void test2()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap((int) 'd', (float) 'd', (-741), 'd');
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream((int) 'd');
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream((OutputStream) byteArrayOutputStream0);
      tIntCharHashMap0.writeExternal((ObjectOutput) objectOutputStream0);
      assertEquals(-741, tIntCharHashMap0.getNoEntryKey());
      assertEquals('d', tIntCharHashMap0.getNoEntryValue());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.contains(I)Z: I5 Branch 1 IFLT L178 - true
   * 2 gnu.trove.impl.hash.TIntCharHash.index(I)I: I37 Branch 5 IFNE L228 - false
   */

  @Test
  public void test3()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap();
      boolean boolean0 = tIntCharHashMap0.containsKey((-1981));
      assertEquals('\u0000', tIntCharHashMap0.getNoEntryValue());
      assertEquals(0, tIntCharHashMap0.getNoEntryKey());
      assertEquals(23, tIntCharHashMap0.capacity());
      assertEquals(false, boolean0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.contains(I)Z: I5 Branch 1 IFLT L178 - false
   * 2 gnu.trove.impl.hash.TIntCharHash.insertKeyAt(II)V: root-Branch
   * 3 gnu.trove.impl.hash.TIntCharHash.index(I)I: I37 Branch 5 IFNE L228 - true
   * 4 gnu.trove.impl.hash.TIntCharHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - false
   * 5 gnu.trove.impl.hash.TIntCharHash.index(I)I: I51 Branch 7 IF_ICMPNE L231 - false
   * 6 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I30 Branch 13 IFNE L279 - false
   */

  @Test
  public void test4()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap();
      tIntCharHashMap0.put((int) 'S', 'S');
      boolean boolean0 = tIntCharHashMap0.containsKey((int) 'S');
      assertEquals(false, tIntCharHashMap0.isEmpty());
      assertEquals(true, boolean0);
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 2 IFLE L192 - true
   * 2 gnu.trove.impl.hash.TIntCharHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 2 IFLE L192 - false
   * 3 gnu.trove.impl.hash.TIntCharHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - true
   */

  @Test
  public void test5()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap();
      boolean boolean0 = tIntCharHashMap0.forEachKey((TIntProcedure) null);
      assertEquals(0, tIntCharHashMap0.getNoEntryKey());
      assertEquals(23, tIntCharHashMap0.capacity());
      assertEquals(true, boolean0);
      assertEquals('\u0000', tIntCharHashMap0.getNoEntryValue());
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - false
   * 2 gnu.trove.impl.hash.TIntCharHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I18 Branch 2 IFLE L192 - false
   * 3 gnu.trove.impl.hash.TIntCharHash.forEach(Lgnu/trove/procedure/TIntProcedure;)Z: I25 Branch 3 IF_ICMPNE L193 - true
   * 4 gnu.trove.impl.hash.TIntCharHash.<init>(I)V: root-Branch
   */

  @Test
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[1];
      char[] charArray0 = new char[4];
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap(intArray0, charArray0);
      // Undeclared exception!
      try {
        tIntCharHashMap0.forEachKey((TIntProcedure) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 7
  /*
   * 10 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.index(I)I: I51 Branch 7 IF_ICMPNE L231 - true
   * 2 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I30 Branch 13 IFNE L279 - true
   * 3 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - false
   * 4 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - true
   * 5 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - true
   * 6 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - true
   * 7 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - false
   * 8 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - true
   * 9 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - true
   * 10 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - false
   */

  @Test
  public void test7()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap();
      tIntCharHashMap0.adjustOrPutValue((-1925), 'S', 'S');
      tIntCharHashMap0.put((int) 'S', 'S');
      tIntCharHashMap0.compact();
      char char0 = tIntCharHashMap0.remove((-1981));
      assertEquals(5, tIntCharHashMap0.capacity());
      assertEquals('\u0000', char0);
  }

  //Test case number: 8
  /*
   * 7 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - true
   * 2 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I58 Branch 10 IF_ICMPNE L254 - true
   * 3 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I70 Branch 12 IF_ICMPNE L256 - true
   * 4 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - false
   * 5 gnu.trove.impl.hash.TIntCharHash.<init>(IF)V: root-Branch
   * 6 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - false
   * 7 gnu.trove.impl.hash.TIntCharHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - true
   */

  @Test
  public void test8()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap((-1), 1076.635F);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-89);
      int[] intArray0 = new int[7];
      tIntCharHashMap0._set = intArray0;
      byteArray0[5] = (byte) (-89);
      tIntCharHashMap0._states = byteArray0;
      char char0 = tIntCharHashMap0.remove((-1));
      assertEquals(7, tIntCharHashMap0.capacity());
      assertEquals('\u0000', char0);
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I70 Branch 12 IF_ICMPNE L256 - false
   * 2 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - false
   * 3 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - true
   * 4 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - true
   * 5 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - true
   * 6 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - true
   */

  @Test
  public void test9()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap((-1), 1076.635F);
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-89);
      byteArray0[2] = (byte) (-89);
      byteArray0[3] = (byte) (-89);
      int[] intArray0 = new int[7];
      tIntCharHashMap0._set = intArray0;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte) (-89);
      byteArray0[6] = (byte) (-89);
      tIntCharHashMap0._states = byteArray0;
      tIntCharHashMap0.putIfAbsent((-1), '');
      boolean boolean0 = tIntCharHashMap0.adjustValue((-851), '');
      assertEquals("{-1=}", tIntCharHashMap0.toString());
      assertEquals(false, boolean0);
  }

  //Test case number: 10
  /*
   * 15 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - true
   * 2 gnu.trove.impl.hash.TIntCharHash.<init>(IF)V: root-Branch
   * 3 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I120 Branch 24 IF_ICMPEQ L336 - false
   * 4 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - true
   * 5 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I29 Branch 8 IFGE L245 - false
   * 6 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I46 Branch 9 IFNE L250 - true
   * 7 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I58 Branch 10 IF_ICMPNE L254 - true
   * 8 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I58 Branch 10 IF_ICMPNE L254 - false
   * 9 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I61 Branch 11 IF_ICMPEQ L254 - false
   * 10 gnu.trove.impl.hash.TIntCharHash.indexRehashed(IIIB)I: I70 Branch 12 IF_ICMPNE L256 - true
   * 11 gnu.trove.impl.hash.TIntCharHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - true
   * 12 gnu.trove.impl.hash.TIntCharHash.removeAt(I)V: root-Branch
   * 13 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - false
   * 14 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - false
   * 15 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - false
   */

  @Test
  public void test10()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap((-1), 1076.635F);
      tIntCharHashMap0.tempDisableAutoCompaction();
      byte[] byteArray0 = new byte[7];
      byteArray0[1] = (byte) (-89);
      byteArray0[2] = (byte) (-89);
      byteArray0[3] = (byte) (-89);
      int[] intArray0 = new int[7];
      tIntCharHashMap0._set = intArray0;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte) (-89);
      byteArray0[6] = (byte) (-89);
      tIntCharHashMap0._states = byteArray0;
      tIntCharHashMap0.putIfAbsent((-1), '');
      tIntCharHashMap0.remove((-1));
      tIntCharHashMap0.putIfAbsent((int) '', '');
      assertEquals("{127=}", tIntCharHashMap0.toString());
      assertEquals(false, tIntCharHashMap0.isEmpty());
  }

  //Test case number: 11
  /*
   * 7 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - false
   * 2 gnu.trove.impl.hash.TIntCharHash.removeAt(I)V: root-Branch
   * 3 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - false
   * 4 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I31 Branch 17 IF_ICMPNE L306 - false
   * 5 gnu.trove.impl.hash.TIntCharHash.index(I)I: I37 Branch 5 IFNE L228 - true
   * 6 gnu.trove.impl.hash.TIntCharHash.index(I)I: I46 Branch 6 IF_ICMPNE L231 - false
   * 7 gnu.trove.impl.hash.TIntCharHash.index(I)I: I51 Branch 7 IF_ICMPNE L231 - false
   */

  @Test
  public void test11()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap(12);
      tIntCharHashMap0.putIfAbsent(12, '\u008A');
      tIntCharHashMap0.remove(12);
      char char0 = tIntCharHashMap0.putIfAbsent(12, '\u008A');
      assertEquals(false, tIntCharHashMap0.isEmpty());
      assertEquals('\u0000', char0);
  }

  //Test case number: 12
  /*
   * 11 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I103 Branch 22 IF_ICMPNE L327 - false
   * 2 gnu.trove.impl.hash.TIntCharHash.insertKeyAt(II)V: root-Branch
   * 3 gnu.trove.impl.hash.TIntCharHash.<init>(I)V: root-Branch
   * 4 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - false
   * 5 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I67 Branch 20 IF_ICMPEQ L317 - true
   * 6 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - false
   * 7 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I103 Branch 22 IF_ICMPNE L327 - true
   * 8 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I30 Branch 13 IFNE L279 - false
   * 9 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - false
   * 10 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - true
   * 11 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I56 Branch 15 IF_ICMPNE L286 - false
   */

  @Test
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[2] = (-1191);
      intArray0[3] = Integer.MAX_VALUE;
      char[] charArray0 = new char[7];
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap(intArray0, charArray0);
      tIntCharHashMap0.adjustOrPutValue(Integer.MAX_VALUE, '\u0000', '\u0000');
      assertEquals('\u0000', tIntCharHashMap0.getNoEntryValue());
      assertEquals("{2147483647=\u0000, -1191=\u0000, 0=\u0000}", tIntCharHashMap0.toString());
      assertEquals(3, tIntCharHashMap0.size());
  }

  //Test case number: 13
  /*
   * 12 covered goals:
   * 1 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I120 Branch 24 IF_ICMPEQ L336 - true
   * 2 gnu.trove.impl.hash.TIntCharHash.setUp(I)I: root-Branch
   * 3 gnu.trove.impl.hash.TIntCharHash.<init>()V: root-Branch
   * 4 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I28 Branch 16 IF_ICMPNE L306 - true
   * 5 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - true
   * 6 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I45 Branch 18 IFGE L310 - false
   * 7 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I62 Branch 19 IFNE L316 - true
   * 8 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I97 Branch 21 IF_ICMPNE L327 - true
   * 9 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - true
   * 10 gnu.trove.impl.hash.TIntCharHash.insertKeyRehash(IIIB)I: I115 Branch 23 IF_ICMPNE L332 - false
   * 11 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I30 Branch 13 IFNE L279 - true
   * 12 gnu.trove.impl.hash.TIntCharHash.insertKey(I)I: I50 Branch 14 IF_ICMPNE L286 - true
   */

  @Test
  public void test13()  throws Throwable  {
      TIntCharHashMap tIntCharHashMap0 = new TIntCharHashMap();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)74;
      byteArray0[1] = (byte)74;
      byteArray0[2] = (byte)74;
      tIntCharHashMap0.compact();
      tIntCharHashMap0._states = byteArray0;
      // Undeclared exception!
      try {
        tIntCharHashMap0.putIfAbsent(84, '%');
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No free or removed slots available. Key set full?!!
         //
      }
  }
}
