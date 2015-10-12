/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedRandomAccessShortList;
import gnu.trove.impl.sync.TSynchronizedShortList;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessShortList;
import gnu.trove.impl.unmodifiable.TUnmodifiableShortList;
import gnu.trove.list.TShortList;
import gnu.trove.list.array.TShortArrayList;
import gnu.trove.list.linked.TShortLinkedList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Set;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableRandomAccessShortListEvoSuite_Random {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.utils.LoggingUtils.setLoggingForJUnit(); 
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


  @Test
  public void test0()  throws Throwable  {
      TShortList tShortList0 = null;
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = null;
      try {
        tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList(tShortList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short short0 = (short)0;
      TShortArrayList tShortArrayList0 = new TShortArrayList();
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortArrayList0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.retainAll((Collection<?>) linkedList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList();
      File file0 = null;
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(file0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name can't be null
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      short[] shortArray0 = new short[9];
      short short0 = (short) (-275);
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short)1;
      shortArray0[2] = short2;
      short short3 = (short)1802;
      shortArray0[3] = short3;
      short short4 = (short)0;
      shortArray0[4] = short4;
      short short5 = (short) (-1565);
      shortArray0[5] = short5;
      short short6 = (short)591;
      shortArray0[6] = short6;
      short short7 = (short)0;
      shortArray0[7] = short7;
      short short8 = (short)0;
      shortArray0[8] = short8;
      TShortArrayList tShortArrayList0 = new TShortArrayList(shortArray0);
      // Undeclared exception!
      try {
        tShortArrayList0.subList((int) shortArray0[0], (int) short6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // begin index can not be < 0
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList();
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortLinkedList0);
      short short0 = (short)1487;
      Locale locale0 = Locale.TAIWAN;
      short[] shortArray0 = new short[2];
      shortArray0[0] = short0;
      shortArray0[1] = short0;
      tUnmodifiableRandomAccessShortList0.containsAll(shortArray0);
      Set<String> set0 = locale0.getUnicodeLocaleAttributes();
      tUnmodifiableRandomAccessShortList0.containsAll((Collection<?>) set0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.fill(short0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList();
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortLinkedList0);
      short[] shortArray0 = new short[3];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short) (-1);
      shortArray0[2] = short2;
      tUnmodifiableRandomAccessShortList0.toArray(shortArray0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.reverse();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      short[] shortArray0 = new short[6];
      short short0 = (short) (-1971);
      shortArray0[0] = short0;
      short short1 = (short)32767;
      shortArray0[0] = short1;
      shortArray0[1] = short1;
      shortArray0[2] = short0;
      shortArray0[3] = short1;
      shortArray0[4] = short1;
      shortArray0[5] = short1;
      shortArray0[1] = short1;
      short short2 = (short)0;
      shortArray0[2] = short2;
      short short3 = (short) (-966);
      shortArray0[3] = short3;
      short short4 = (short) (-810);
      shortArray0[4] = short4;
      short short5 = (short) (-1046);
      shortArray0[5] = short5;
      TShortArrayList tShortArrayList0 = TShortArrayList.wrap(shortArray0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortArrayList0);
      int int0 = (-1399);
      int int1 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.insert(int0, shortArray0, int1, (int) short5);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      short short0 = (short) (-84);
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList(short0);
      String string0 = "";
      Locale locale0 = Locale.forLanguageTag(string0);
      Set<String> set0 = locale0.getUnicodeLocaleKeys();
      tShortLinkedList0.removeAll((Collection<?>) set0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortLinkedList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.min();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      short short0 = (short)32767;
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList(short0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortLinkedList0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.removeAll((Collection<?>) linkedList0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      short[] shortArray0 = new short[3];
      short short0 = (short)0;
      TShortArrayList tShortArrayList0 = new TShortArrayList((int) short0);
      TUnmodifiableShortList tUnmodifiableShortList0 = new TUnmodifiableShortList((TShortList) tShortArrayList0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tUnmodifiableShortList0);
      short short1 = (short) (-1);
      tUnmodifiableRandomAccessShortList0.indexOf(short1);
      TShortArrayList tShortArrayList1 = new TShortArrayList(shortArray0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList1 = new TUnmodifiableRandomAccessShortList((TShortList) tShortArrayList1);
      int int0 = Integer.MAX_VALUE;
      short short2 = (short)1360;
      tShortArrayList1.binarySearch(short2);
      int int1 = 1463;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList1.toArray(shortArray0, (int) short0, int0, int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      short[] shortArray0 = new short[7];
      short short0 = (short) (-1);
      shortArray0[0] = short0;
      short short1 = (short) (-882);
      shortArray0[1] = short1;
      short short2 = (short)31;
      shortArray0[2] = short2;
      short short3 = (short)386;
      shortArray0[3] = short3;
      short short4 = (short)2;
      shortArray0[4] = short4;
      TShortArrayList tShortArrayList0 = new TShortArrayList(shortArray0);
      // Undeclared exception!
      try {
        tShortArrayList0.subList((int) shortArray0[4], (int) shortArray0[0]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // end index -1 greater than begin index 2
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 2;
      short short0 = (short) (-1);
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList(short0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortLinkedList0);
      String string0 = "";
      int int1 = 1298;
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int1, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: ://@:1298?#
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      int int0 = 1375;
      short short0 = (short) (-757);
      TShortArrayList tShortArrayList0 = new TShortArrayList(int0, short0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortArrayList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.removeAt(int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      short[] shortArray0 = new short[10];
      short short0 = (short)1199;
      shortArray0[0] = short0;
      short short1 = (short)0;
      shortArray0[1] = short1;
      short short2 = (short)0;
      shortArray0[2] = short2;
      short short3 = (short)2;
      shortArray0[3] = short3;
      short short4 = (short)0;
      shortArray0[4] = short4;
      short short5 = (short) (-1);
      shortArray0[5] = short5;
      short short6 = (short) (-1805);
      shortArray0[6] = short6;
      short short7 = (short) (-566);
      shortArray0[7] = short7;
      short short8 = (short) (-209);
      shortArray0[8] = short8;
      short short9 = (short) (-1425);
      shortArray0[9] = short9;
      TShortArrayList tShortArrayList0 = TShortArrayList.wrap(shortArray0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortArrayList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.removeAt((int) short5);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      int int0 = 1397;
      TShortArrayList tShortArrayList0 = new TShortArrayList(int0);
      int int1 = 32767;
      // Undeclared exception!
      try {
        tShortArrayList0.removeAt(int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Array index out of range: 32767
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TShortLinkedList tShortLinkedList0 = new TShortLinkedList();
      TUnmodifiableShortList tUnmodifiableShortList0 = new TUnmodifiableShortList((TShortList) tShortLinkedList0);
      TSynchronizedRandomAccessShortList tSynchronizedRandomAccessShortList0 = new TSynchronizedRandomAccessShortList((TShortList) tUnmodifiableShortList0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tUnmodifiableShortList0);
      short[] shortArray0 = new short[4];
      short short0 = (short)1;
      shortArray0[0] = short0;
      shortArray0[1] = short0;
      shortArray0[2] = short0;
      shortArray0[3] = short0;
      short short1 = (short) (-1);
      shortArray0[0] = short1;
      short short2 = (short) (-1);
      shortArray0[1] = short2;
      short short3 = (short) (-1337);
      shortArray0[2] = short3;
      short short4 = (short) (-1036);
      shortArray0[3] = short4;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.add(shortArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      short[] shortArray0 = new short[2];
      short short0 = (short)0;
      shortArray0[0] = short0;
      short short1 = (short) (-1);
      int int0 = 0;
      TShortArrayList tShortArrayList0 = new TShortArrayList(int0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tShortArrayList0);
      int int1 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.add(shortArray0, int1, (int) short1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = (-754);
      short[] shortArray0 = new short[10];
      short short0 = (short)1046;
      shortArray0[0] = short0;
      short short1 = (short) (-1940);
      shortArray0[1] = short1;
      short short2 = (short)0;
      shortArray0[2] = short2;
      short short3 = (short) (-1376);
      shortArray0[3] = short3;
      short short4 = (short) (-1);
      shortArray0[4] = short4;
      short short5 = (short)1514;
      shortArray0[5] = short5;
      short short6 = (short)394;
      shortArray0[6] = short6;
      short short7 = (short) (-1168);
      shortArray0[7] = short7;
      short short8 = (short)1;
      shortArray0[8] = short8;
      short short9 = (short)31;
      shortArray0[9] = short9;
      short short10 = (short) (-1487);
      TShortArrayList tShortArrayList0 = TShortArrayList.wrap(shortArray0, short10);
      TSynchronizedShortList tSynchronizedShortList0 = new TSynchronizedShortList((TShortList) tShortArrayList0);
      TUnmodifiableRandomAccessShortList tUnmodifiableRandomAccessShortList0 = new TUnmodifiableRandomAccessShortList((TShortList) tSynchronizedShortList0);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessShortList0.insert((int) short4, shortArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
