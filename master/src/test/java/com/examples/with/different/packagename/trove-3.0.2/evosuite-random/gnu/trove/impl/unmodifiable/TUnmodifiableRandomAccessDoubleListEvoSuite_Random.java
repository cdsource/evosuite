/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.unmodifiable;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedDoubleList;
import gnu.trove.impl.unmodifiable.TUnmodifiableDoubleList;
import gnu.trove.impl.unmodifiable.TUnmodifiableRandomAccessDoubleList;
import gnu.trove.list.TDoubleList;
import gnu.trove.list.array.TDoubleArrayList;
import gnu.trove.list.linked.TDoubleLinkedList;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TUnmodifiableRandomAccessDoubleListEvoSuite_Random {

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
      double[] doubleArray0 = new double[2];
      double double0 = (-1534.805583295067);
      doubleArray0[0] = double0;
      double double1 = 0.0;
      doubleArray0[1] = double1;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      double double2 = (-797.9799489463965);
      tUnmodifiableRandomAccessDoubleList0.contains(double2);
      int int0 = (-2028);
      TDoubleArrayList tDoubleArrayList1 = null;
      try {
        tDoubleArrayList1 = new TDoubleArrayList(int0, int0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = (-780.8175201612967);
      doubleArray0[0] = double0;
      double double1 = 244.51655967180864;
      doubleArray0[1] = double1;
      double double2 = (-601.1253608183847);
      doubleArray0[2] = double2;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      String string0 = "p^{&{MCGXC7$";
      Locale locale0 = new Locale(string0);
      Locale locale1 = Locale.forLanguageTag(string0);
      String string1 = locale0.getDisplayName(locale1);
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(string1);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // p^{&{mcgxc7$ (No such file or directory)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      double double0 = (-1.0);
      TDoubleLinkedList tDoubleLinkedList0 = new TDoubleLinkedList(double0);
      TUnmodifiableDoubleList tUnmodifiableDoubleList0 = new TUnmodifiableDoubleList((TDoubleList) tDoubleLinkedList0);
      tDoubleLinkedList0.toArray();
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tUnmodifiableDoubleList0);
      int int0 = 148;
      double double1 = Double.POSITIVE_INFINITY;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessDoubleList0.insert(int0, double1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      TDoubleList tDoubleList0 = null;
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = null;
      try {
        tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList(tDoubleList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 105;
      double[] doubleArray0 = new double[3];
      double double0 = (-1096.827062783365);
      doubleArray0[0] = double0;
      doubleArray0[1] = (double) int0;
      doubleArray0[2] = (double) int0;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      int int1 = (-1095);
      // Undeclared exception!
      try {
        tDoubleArrayList0.subList(int1, int1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // begin index can not be < 0
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList();
      int int0 = (-1390);
      ByteArrayOutputStream byteArrayOutputStream0 = null;
      try {
        byteArrayOutputStream0 = new ByteArrayOutputStream(int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative initial size: -1390
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TDoubleLinkedList tDoubleLinkedList0 = new TDoubleLinkedList();
      int int0 = (-47);
      // Undeclared exception!
      try {
        tDoubleLinkedList0.replace(int0, int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // at offset -47
         //
      }
  }

  @Test
  public void test7()  throws Throwable  {
      double[] doubleArray0 = new double[3];
      double double0 = (-1.0);
      doubleArray0[0] = double0;
      double double1 = (-691.2790147038435);
      doubleArray0[1] = double1;
      double double2 = 1785.6104701967483;
      doubleArray0[2] = double2;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      int int0 = (-1106);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessDoubleList0.subList(int0, int0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // begin index can not be < 0
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      TDoubleList tDoubleList0 = null;
      TSynchronizedDoubleList tSynchronizedDoubleList0 = null;
      try {
        tSynchronizedDoubleList0 = new TSynchronizedDoubleList(tDoubleList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      int int0 = 0;
      int int1 = 405;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(int1);
      int int2 = 715;
      // Undeclared exception!
      try {
        tDoubleArrayList0.subList(int2, int1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // end index 405 greater than begin index 715
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-1);
      TDoubleArrayList tDoubleArrayList0 = null;
      try {
        tDoubleArrayList0 = new TDoubleArrayList(int0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      int int0 = 0;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(int0);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      int int1 = (-942);
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessDoubleList0.get(int1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -942
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList();
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      URI uRI0 = null;
      File file0 = null;
      try {
        file0 = new File(uRI0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      double double0 = (-1977.6866196870328);
      TDoubleLinkedList tDoubleLinkedList0 = new TDoubleLinkedList(double0);
      int int0 = 828;
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleLinkedList0);
      double double1 = 246.54759976657243;
      tUnmodifiableRandomAccessDoubleList0.contains(double1);
      double double2 = 0.0;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(int0, double2);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList1 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleLinkedList0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = (double) int0;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessDoubleList1.retainAll(doubleArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TDoubleLinkedList tDoubleLinkedList0 = new TDoubleLinkedList();
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleLinkedList0);
      double[] doubleArray0 = new double[7];
      double double0 = 1713.936417139318;
      doubleArray0[0] = double0;
      double double1 = 2043.856047381937;
      doubleArray0[1] = double1;
      double double2 = 1154.560125926595;
      doubleArray0[2] = double2;
      double double3 = 0.0;
      doubleArray0[3] = double3;
      double double4 = 0.0;
      doubleArray0[4] = double4;
      double double5 = 0.0;
      doubleArray0[5] = double5;
      double double6 = 0.0;
      doubleArray0[6] = double6;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessDoubleList0.removeAll(doubleArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TDoubleList tDoubleList0 = null;
      TDoubleLinkedList tDoubleLinkedList0 = null;
      try {
        tDoubleLinkedList0 = new TDoubleLinkedList(tDoubleList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = 1;
      double[] doubleArray0 = new double[2];
      doubleArray0[0] = (double) int0;
      doubleArray0[1] = (double) int0;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      int int1 = 0;
      // Undeclared exception!
      try {
        tUnmodifiableRandomAccessDoubleList0.set(int0, doubleArray0, int1, int0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      double[] doubleArray0 = new double[6];
      double double0 = 901.7136023955876;
      doubleArray0[0] = double0;
      double double1 = (-1.0);
      doubleArray0[1] = double1;
      double double2 = 83.42668458490714;
      doubleArray0[2] = double2;
      double double3 = 0.0;
      doubleArray0[3] = double3;
      double double4 = Double.POSITIVE_INFINITY;
      doubleArray0[4] = double4;
      double double5 = (-584.7625115410146);
      doubleArray0[5] = double5;
      TDoubleArrayList tDoubleArrayList0 = new TDoubleArrayList(doubleArray0);
      TUnmodifiableRandomAccessDoubleList tUnmodifiableRandomAccessDoubleList0 = new TUnmodifiableRandomAccessDoubleList((TDoubleList) tDoubleArrayList0);
      assertEquals(0.0, tUnmodifiableRandomAccessDoubleList0.getNoEntryValue(), 0.01D);
  }
}
