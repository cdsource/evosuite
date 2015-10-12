/*
 * This file was automatically generated by EvoSuite
 */

package gnu.trove.impl.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import gnu.trove.impl.sync.TSynchronizedByteFloatMap;
import gnu.trove.map.TByteFloatMap;
import gnu.trove.map.hash.TByteFloatHashMap;
import gnu.trove.procedure.TByteProcedure;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Locale;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;

public class TSynchronizedByteFloatMapEvoSuite_Random {

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
      int int0 = (-2009);
      byte byte0 = (byte)10;
      float float0 = (-1.0F);
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, (float) int0, byte0, float0);
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap((TByteFloatMap) tByteFloatHashMap0);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap1);
      TByteProcedure tByteProcedure0 = null;
      boolean boolean0 = tSynchronizedByteFloatMap0.forEachKey(tByteProcedure0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      TByteFloatMap tByteFloatMap0 = null;
      String string0 = "";
      File file0 = new File(string0, string0);
      file0.getAbsolutePath();
      FileInputStream fileInputStream0 = null;
      try {
        fileInputStream0 = new FileInputStream(file0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // / (Is a directory)
         //
      }
  }

  @Test
  public void test2()  throws Throwable  {
      TByteFloatMap tByteFloatMap0 = null;
      TByteFloatHashMap tByteFloatHashMap0 = null;
      try {
        tByteFloatHashMap0 = new TByteFloatHashMap(tByteFloatMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      int int0 = 1;
      TByteFloatMap tByteFloatMap0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = null;
      try {
        tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap(tByteFloatMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test4()  throws Throwable  {
      int int0 = 0;
      int int1 = 1;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0);
      tSynchronizedByteFloatMap0.hashCode();
      float float0 = 0.0F;
      byte byte0 = (byte)0;
      float float1 = (-1.0F);
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int1, float0, byte0, float1);
      Object object0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap1 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap1, object0);
      TByteFloatHashMap tByteFloatHashMap2 = new TByteFloatHashMap(int0);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap2 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap2);
      tSynchronizedByteFloatMap2.valueCollection();
      int int2 = 0;
      byte byte1 = (byte) (-22);
      // Undeclared exception!
      try {
        tSynchronizedByteFloatMap1.put(byte1, (float) int2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test5()  throws Throwable  {
      int int0 = (-326);
      TByteFloatMap tByteFloatMap0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = null;
      try {
        tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap(tByteFloatMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test6()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0);
      tSynchronizedByteFloatMap0.clear();
      float[] floatArray0 = new float[6];
      float float0 = 0.5F;
      floatArray0[0] = float0;
      float float1 = 0.0F;
      floatArray0[1] = float1;
      float float2 = 14.234705F;
      floatArray0[2] = float2;
      float float3 = 922.8864F;
      floatArray0[3] = float3;
      float float4 = (-1.0F);
      floatArray0[4] = float4;
      float float5 = 0.0F;
      floatArray0[5] = float5;
      float[] floatArray1 = tSynchronizedByteFloatMap0.values(floatArray0);
      assertSame(floatArray1, floatArray0);
  }

  @Test
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byte byte0 = (byte) (-103);
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap((int) byte0);
      String string0 = "";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Expected scheme name at index 0: ://?#
         //
      }
  }

  @Test
  public void test8()  throws Throwable  {
      int int0 = 0;
      byte byte0 = (byte)0;
      byte byte1 = (byte)1;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap((int) byte0, (float) byte0, byte1, (float) byte1);
      Object object0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0, object0);
      // Undeclared exception!
      try {
        tSynchronizedByteFloatMap0.increment(byte1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test9()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)0;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-58);
      byteArray0[2] = byte2;
      byte byte3 = (byte) (-61);
      byteArray0[3] = byte3;
      byte byte4 = (byte)38;
      byteArray0[4] = byte4;
      float[] floatArray0 = new float[10];
      floatArray0[0] = (float) byteArray0[3];
      floatArray0[1] = (float) byte1;
      floatArray0[2] = (float) byte4;
      floatArray0[3] = (float) byteArray0[2];
      floatArray0[4] = (float) byte4;
      float float0 = (-1664.9156F);
      floatArray0[5] = float0;
      floatArray0[6] = (float) byte4;
      floatArray0[7] = (float) byteArray0[1];
      floatArray0[8] = (float) byteArray0[0];
      floatArray0[9] = (float) byteArray0[0];
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(byteArray0, floatArray0);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0);
      String string0 = "-6\"]9N{k1#/";
      int int0 = 0;
      String string1 = " greater than last index ";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int0, string0, string0, string1);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: -6\"]9N{k1#/://-6%22%5D9N%7Bk1%23%2F@-6\"]9N{k1#/:0-6%22%5D9N%7Bk1%23/?-6%22]9N%7Bk1%23/#%20greater%20than%20last%20index%20
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      int int0 = (-779);
      float float0 = 0.0F;
      byte byte0 = (byte)0;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, float0, byte0, (float) int0);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0);
      byte[] byteArray0 = tSynchronizedByteFloatMap0.keys(tByteFloatHashMap0._set);
      assertNotNull(byteArray0);
  }

  @Test
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte) (-45);
      byteArray0[0] = byte0;
      byte byte1 = (byte)9;
      byteArray0[1] = byte1;
      byte byte2 = (byte)0;
      byteArray0[2] = byte2;
      byte byte3 = (byte)1;
      byteArray0[3] = byte3;
      byte byte4 = (byte)72;
      byteArray0[4] = byte4;
      byte byte5 = (byte) (-38);
      byteArray0[5] = byte5;
      byte byte6 = (byte) (-1);
      byteArray0[6] = byte6;
      byte byte7 = (byte)110;
      byteArray0[7] = byte7;
      float[] floatArray0 = new float[10];
      floatArray0[0] = (float) byte0;
      floatArray0[1] = (float) byteArray0[1];
      floatArray0[2] = (float) byte1;
      floatArray0[3] = (float) byteArray0[1];
      floatArray0[4] = (float) byte5;
      floatArray0[5] = (float) byteArray0[2];
      float float0 = 0.0F;
      floatArray0[6] = float0;
      floatArray0[7] = (float) byteArray0[6];
      floatArray0[8] = (float) byte1;
      floatArray0[9] = (float) byteArray0[5];
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(byteArray0, floatArray0);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0);
      float float1 = tSynchronizedByteFloatMap0.getNoEntryValue();
      assertTrue(float1 == float0);
  }

  @Test
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte byte0 = (byte)71;
      byteArray0[0] = byte0;
      byte byte1 = (byte)0;
      byteArray0[1] = byte1;
      byte byte2 = (byte) (-73);
      byteArray0[2] = byte2;
      byte byte3 = (byte)0;
      byteArray0[3] = byte3;
      byte byte4 = (byte)0;
      byteArray0[4] = byte4;
      byte byte5 = (byte)58;
      byteArray0[5] = byte5;
      float[] floatArray0 = new float[10];
      floatArray0[0] = (float) byte5;
      floatArray0[1] = (float) byte0;
      floatArray0[2] = (float) byte5;
      floatArray0[3] = (float) byteArray0[2];
      floatArray0[4] = (float) byteArray0[3];
      floatArray0[5] = (float) byteArray0[2];
      floatArray0[6] = (float) byte2;
      floatArray0[7] = (float) byte5;
      floatArray0[8] = (float) byteArray0[1];
      floatArray0[9] = (float) byte1;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(byteArray0, floatArray0);
      String string0 = "p\\g#Blver+R=ZdQxx";
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: p\\g#Blver+R=ZdQxx://p\\g#Blver+R=ZdQxxp%5Cg%23Blver%7F+R=ZdQxx#p%5Cg%23Blver%7F+R=ZdQxx
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TByteFloatMap tByteFloatMap0 = null;
      String string0 = "{";
      String string1 = "";
      Object object0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap(tByteFloatMap0, object0);
      // Undeclared exception!
      try {
        tSynchronizedByteFloatMap0.getNoEntryKey();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(tByteFloatHashMap0._states);
      int int0 = 1913;
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream((InputStream) byteArrayInputStream0, int0);
      DataInputStream dataInputStream0 = new DataInputStream((InputStream) bufferedInputStream0);
      String string0 = dataInputStream0.readUTF();
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0, (Object) string0);
      float float0 = (-1973.4578F);
      tSynchronizedByteFloatMap0.containsValue(float0);
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap();
      int int1 = 1929;
      tByteFloatHashMap1.ensureCapacity(int1);
      URI uRI0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap1 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap1);
      tSynchronizedByteFloatMap1.getNoEntryValue();
      tSynchronizedByteFloatMap1.values();
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
  public void test15()  throws Throwable  {
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      int int0 = (-496);
      HashMap<Integer, String> hashMap0 = null;
      try {
        hashMap0 = new HashMap<Integer, String>(int0, int0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -496
         //
      }
  }

  @Test
  public void test16()  throws Throwable  {
      int int0 = 0;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, int0);
      byte byte0 = (byte) (-70);
      tByteFloatHashMap0.remove(byte0);
      Object object0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0, object0);
      byte byte1 = (byte) (-1);
      float float0 = 1933.1161F;
      byte byte2 = (byte)124;
      float float1 = 0.0F;
      tByteFloatHashMap0.putIfAbsent(byte2, float1);
      // Undeclared exception!
      try {
        tSynchronizedByteFloatMap0.put(byte1, float0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test17()  throws Throwable  {
      int int0 = (-396);
      float float0 = (-1306.3276F);
      byte byte0 = (byte) (-58);
      float float1 = (-986.4024F);
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(int0, float0, byte0, float1);
      String string0 = "B63<\"$T=";
      int int1 = 1;
      URI uRI0 = null;
      try {
        uRI0 = new URI(string0, string0, string0, int1, string0, string0, string0);
        fail("Expecting exception: URISyntaxException");
      
      } catch(URISyntaxException e) {
         //
         // Relative path in absolute URI: B63<\"$T=://B63%3C%22$T=@B63<\"$T=:1B63%3C%22$T=?B63%3C%22$T=#B63%3C%22$T=
         //
      }
  }

  @Test
  public void test18()  throws Throwable  {
      int int0 = 0;
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap();
      Locale locale0 = Locale.KOREAN;
      String string0 = locale0.getDisplayCountry();
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0, (Object) string0);
      Object object0 = null;
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap1 = new TSynchronizedByteFloatMap((TByteFloatMap) tSynchronizedByteFloatMap0, object0);
      tSynchronizedByteFloatMap1.getNoEntryKey();
      float float0 = 0.5F;
      TByteFloatHashMap tByteFloatHashMap1 = new TByteFloatHashMap(int0, float0);
      TByteFloatHashMap tByteFloatHashMap2 = new TByteFloatHashMap((TByteFloatMap) tByteFloatHashMap1);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap2 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap2);
      tSynchronizedByteFloatMap2.keySet();
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      Locale locale1 = Locale.getDefault(locale_Category0);
      String string1 = locale1.getScript();
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap3 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap2, (Object) string1);
      assertNotSame(tSynchronizedByteFloatMap3, tSynchronizedByteFloatMap2);
  }

  @Test
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte byte0 = (byte) (-1);
      byteArray0[0] = byte0;
      float[] floatArray0 = new float[10];
      floatArray0[0] = (float) byteArray0[0];
      floatArray0[1] = (float) byteArray0[0];
      floatArray0[2] = (float) byte0;
      float float0 = 1003.91296F;
      floatArray0[3] = float0;
      floatArray0[4] = (float) byte0;
      floatArray0[5] = (float) byteArray0[0];
      floatArray0[6] = (float) byteArray0[0];
      floatArray0[7] = (float) byte0;
      floatArray0[8] = (float) byteArray0[0];
      floatArray0[9] = (float) byteArray0[0];
      TByteFloatHashMap tByteFloatHashMap0 = new TByteFloatHashMap(byteArray0, floatArray0);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap0 = new TSynchronizedByteFloatMap((TByteFloatMap) tByteFloatHashMap0);
      Locale locale0 = Locale.CANADA;
      String string0 = "Z_?'SZuP:pO#F=9uN";
      Locale locale1 = new Locale(string0, string0);
      String string1 = locale0.getDisplayName(locale1);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap1 = new TSynchronizedByteFloatMap((TByteFloatMap) tSynchronizedByteFloatMap0, (Object) string1);
      float float1 = 30.69969F;
      Float float2 = new Float(float1);
      TSynchronizedByteFloatMap tSynchronizedByteFloatMap2 = new TSynchronizedByteFloatMap((TByteFloatMap) tSynchronizedByteFloatMap1, (Object) float2);
      byte byte1 = (byte) (-67);
      float float3 = tSynchronizedByteFloatMap2.get(byte1);
      assertFalse(float1 == float3);
  }
}
