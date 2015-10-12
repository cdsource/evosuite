/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.map.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.map.TDoubleObjectMap;
import gnu.trove.map.hash.TDoubleObjectHashMap;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.AbstractMap;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TDoubleObjectHashMapEvoSuite_Random {

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
      int int0 = 57955739;
      double double0 = (-1380.9477650696367);
      TDoubleObjectHashMap<AbstractMap.SimpleEntry<String, Integer>> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<AbstractMap.SimpleEntry<String, Integer>>(int0, (float) int0, double0);
      TDoubleObjectMap<Integer> tDoubleObjectMap0 = null;
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap1 = null;
      try {
        tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Integer>(tDoubleObjectMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>();
      tDoubleObjectHashMap0.keySet();
      int int0 = tDoubleObjectHashMap0.capacity();
      float float0 = 0.0F;
      tDoubleObjectHashMap0.setAutoCompactionFactor(float0);
      int int1 = 1;
      float float1 = 1717.3546F;
      tDoubleObjectHashMap0.ensureCapacity(int0);
      int int2 = (-1703);
      float float2 = 1946.3267F;
      double double0 = 1790.0223996477253;
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Integer>(int2, float2, double0);
      tDoubleObjectHashMap1.valueCollection();
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap2 = new TDoubleObjectHashMap<Object>(int1, float1, (double) float1);
      int int3 = 0;
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap3 = new TDoubleObjectHashMap<Integer>(int3);
      tDoubleObjectHashMap2.getAutoCompactionFactor();
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap4 = new TDoubleObjectHashMap<Integer>((TDoubleObjectMap<? extends Integer>) tDoubleObjectHashMap3);
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap5 = new TDoubleObjectHashMap<Double>();
      String string0 = tDoubleObjectHashMap5.toString();
      tDoubleObjectHashMap4.containsValue((Object) string0);
      tDoubleObjectHashMap4.toString();
      double double1 = 1.0;
      int int4 = 604;
      float float3 = 1.0F;
      TDoubleObjectHashMap<AbstractMap.SimpleImmutableEntry<Double, Double>> tDoubleObjectHashMap6 = new TDoubleObjectHashMap<AbstractMap.SimpleImmutableEntry<Double, Double>>(int4, float3, (double) int0);
      tDoubleObjectHashMap6.compact();
      tDoubleObjectHashMap3.contains(double1);
      ObjectOutput objectOutput0 = null;
      // Undeclared exception!
      try {
        tDoubleObjectHashMap0.writeExternal(objectOutput0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      int int0 = 1482707;
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(int0, int0);
      tDoubleObjectHashMap0.setAutoCompactionFactor((float) int0);
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 1;
      TDoubleObjectHashMap<AbstractMap.SimpleEntry<String, String>> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<AbstractMap.SimpleEntry<String, String>>(int0);
      byte[] byteArray0 = new byte[10];
      byte byte0 = (byte)43;
      byteArray0[0] = byte0;
      byte byte1 = (byte) (-98);
      byteArray0[1] = byte1;
      byte byte2 = (byte)114;
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-35);
      byteArray0[3] = byte3;
      byte byte4 = (byte)27;
      byteArray0[4] = byte4;
      byte byte5 = (byte)76;
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-71);
      byteArray0[6] = byte6;
      byte byte7 = (byte)1;
      byteArray0[7] = byte7;
      byte byte8 = (byte)0;
      byteArray0[8] = byte8;
      byte byte9 = (byte)40;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) pipedInputStream0, (InputStream) pipedInputStream0);
      ObjectInputStream objectInputStream0 = null;
      try {
        objectInputStream0 = new ObjectInputStream((InputStream) sequenceInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = (-300);
      double double0 = 0.0;
      TDoubleObjectHashMap<String> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<String>(int0, (float) int0, double0);
      tDoubleObjectHashMap0.remove((double) int0);
      assertEquals(true, tDoubleObjectHashMap0.isEmpty());
      assertEquals(0.0, tDoubleObjectHashMap0.getNoEntryKey(), 0.01D);
      assertEquals(0, tDoubleObjectHashMap0.size());
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = 168;
      double double0 = 4.9E-324;
      TDoubleObjectHashMap<AbstractMap.SimpleEntry<Integer, Object>> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<AbstractMap.SimpleEntry<Integer, Object>>(int0, (float) int0, double0);
      tDoubleObjectHashMap0.keySet();
      float float0 = 95.38941F;
      double double1 = 4.9E-324;
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<Object>(int0);
      tDoubleObjectHashMap1.keySet();
      assertEquals(359, tDoubleObjectHashMap1.capacity());
      assertEquals(0.0, tDoubleObjectHashMap1.getNoEntryKey(), 0.01D);
      
      TDoubleObjectHashMap<TDoubleObjectHashMap<String>> tDoubleObjectHashMap2 = new TDoubleObjectHashMap<TDoubleObjectHashMap<String>>(int0, float0, double1);
      tDoubleObjectHashMap2.getNoEntryValue();
      assertEquals(4.9E-324, tDoubleObjectHashMap2.getNoEntryKey(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      TDoubleObjectHashMap<Object> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Object>();
      double[] doubleArray0 = new double[10];
      double double0 = 1513.390494465792;
      doubleArray0[0] = double0;
      double double1 = (-785.9418030709624);
      doubleArray0[1] = double1;
      double double2 = (-1145.7575170307011);
      doubleArray0[2] = double2;
      double double3 = (-1.0);
      doubleArray0[3] = double3;
      double double4 = 0.0;
      doubleArray0[4] = double4;
      double double5 = 1510.543601546682;
      doubleArray0[5] = double5;
      double double6 = 1.0;
      doubleArray0[6] = double6;
      double double7 = 1483.5861587534678;
      doubleArray0[7] = double7;
      double double8 = 0.0;
      doubleArray0[8] = double8;
      double double9 = (-1217.955963195092);
      doubleArray0[9] = double9;
      double[] doubleArray1 = tDoubleObjectHashMap0.keys(doubleArray0);
      assertNotNull(doubleArray1);
      assertSame(doubleArray0, doubleArray1);
      
      String string0 = tDoubleObjectHashMap0.toString();
      assertNotNull(string0);
      assertEquals("{}", string0);
      assertEquals(23, tDoubleObjectHashMap0.capacity());
  }

  @Test
  public void test7()  throws Throwable  {
      int int0 = 696;
      TDoubleObjectHashMap<Integer> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Integer>(int0);
      tDoubleObjectHashMap0.size();
      int int1 = 776;
      TDoubleObjectHashMap<String> tDoubleObjectHashMap1 = new TDoubleObjectHashMap<String>(int1, int1);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream();
      int int2 = (-1039);
      BufferedOutputStream bufferedOutputStream0 = null;
      try {
        bufferedOutputStream0 = new BufferedOutputStream((OutputStream) byteArrayOutputStream0, int2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Buffer size <= 0
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = (-518);
      float float0 = (-1417.7515F);
      TDoubleObjectHashMap<Double> tDoubleObjectHashMap0 = new TDoubleObjectHashMap<Double>(int0, float0);
      double double0 = 1099.922439725476;
      Double double1 = new Double(double0);
      tDoubleObjectHashMap0.putIfAbsent((double) float0, double1);
      assertEquals(7, tDoubleObjectHashMap0.capacity());
      assertEquals("{-1417.75146484375=1099.922439725476}", tDoubleObjectHashMap0.toString());
  }
}
